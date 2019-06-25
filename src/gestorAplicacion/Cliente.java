package gestorAplicacion;
import java.util.ArrayList;
public class Cliente extends Persona {
	ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
	private int saldo= 50000;
	public Cliente() {		
	}
	public Cliente(int id, String nombre, String cedula, String telefono) {	
		super(id,nombre,cedula,telefono);
	}
	public void registrar(int id, String nombre, String cedula, String telefono) {
		Cliente Cliente1 = new Cliente (id, nombre, cedula, telefono);
		listaClientes.add(Cliente1);
	}
	public boolean verificar_registro() {
		return(true);
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
	public String cedula() {
		return cedula;
	}
	public String telefono() {
		return telefono;
	}
	public String toString (){
        String mensaje="El empleado se llama "+ "carlos" +" "+" con "+"121475545"+" años " +
                "y un salario de "+saldo;
        return mensaje;
    }
}
