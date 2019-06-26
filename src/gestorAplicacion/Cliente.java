package gestorAplicacion;
import java.util.ArrayList;
import java.util.Iterator;
public class Cliente extends Persona {
	static ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
	private int saldo= 50000;
	public Cliente() {		
	}
	public Cliente(String nombre, String cedula, String telefono) {	
		super(nombre,cedula,telefono);
	}
	public void registrar(String nombre, String cedula, String telefono) {
		Cliente Cliente1 = new Cliente (nombre, cedula, telefono);
		listaClientes.add(Cliente1);
		
	}
	public static boolean verificar_registro(String nombre, String cedula) {
		Iterator<Cliente> nombreIterator = listaClientes.iterator();
		while(nombreIterator.hasNext()){
			Cliente Cliente_A_Buscar = nombreIterator.next();
			if (Cliente_A_Buscar.getnombre() == nombre  && Cliente_A_Buscar.getcedula()== cedula ) {
				return(true);
			}			
		}
		return (false);
	}
	public void comprar() {		
	}
	public int getSaldo() {
		return saldo;
	}
	public void setsaldo(int saldo) {
		this.saldo = saldo;
	}
	public String getnombre() {
		return nombre;
	}
	public String getcedula() {
		return cedula;
	}
	public String gettelefono() {
		return telefono;
	}
	public String toString (){
        String mensaje="El empleado se llama "+ nombre +" "+" con cedula "+cedula+" y telefono  " +
               telefono + " y un salario de "+ saldo;
        return mensaje;
    }
}
