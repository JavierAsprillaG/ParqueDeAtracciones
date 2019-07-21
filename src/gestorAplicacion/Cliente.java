package gestorAplicacion;
//import java.util.ArrayList;
import java.util.HashMap;
//import java.util.Iterator;
public class Cliente extends Persona {
	//public static ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
	public static HashMap	<String,Cliente> listaClientes = new HashMap <>();
	private int saldo= 50000;
	Boleta x;
	public Cliente() {		
	}
	public Cliente(String nombre, String cedula, String telefono) {	
		super(nombre,cedula,telefono);
	}
	/*public void registrar(String nombre, String cedula, String telefono) {
		Cliente Cliente1 = new Cliente (nombre, cedula, telefono);
		listaClientes.add(Cliente1);
		
	}
	public static boolean verificar_registro(String nombre, String cedula) {
		Iterator<Cliente> nombreIterator = listaClientes.iterator();
		while(nombreIterator.hasNext()){
			Cliente Cliente_A_Buscar = nombreIterator.next();
			if (Cliente_A_Buscar.getnombre().equals(nombre)  && Cliente_A_Buscar.getcedula().equals(cedula) ) {
				return(true);
			}			
		}
		return (false);
	}
	public String comprarboleta(String nombre, String cedula) {
		if(verificar_registro(nombre,cedula) == true) {
			return("");
		}
		else {
			return("Debe Registrarse");
		}
	}*/
	
	public void registrar(String nom, String ced, String tel) {
		Cliente a = new Cliente (nom, ced, tel);
		if(listaClientes.containsKey(ced) == false) {
			listaClientes.put(ced, a);
			//se crea un nuevo cliente si la cedula de este no se encuentra en
			//la lista de clientes entonces lo agrega a esta en caso contrario no hace nada
		}
	}
	
	public boolean verificarRegistro(String ced) {
		return listaClientes.containsKey(ced);
		//busca el cliente con la cedula ingresada, en caso de encontrarlo devuelve true, 
		//si no lo encuentra devuelve false
	}
	
	public Boleta comprarBoleta(String ced, String b, int c, int d){
		if(verificarRegistro(ced) == true) {
			Boleta a = x.crearboleta(b, c, d);
			if(a.pagodeboleta(listaClientes.get(ced), a) == true) {
				a.pagodeboleta(listaClientes.get(ced), a);
				return a;
			}
			else{
				return null;
			}
			//si la cedula esta registrada se crea una nueva boleta con los parametros proporcionados, luego de esto se hace el pago de la boleta descontando saldo del cliente
			//al que pertenece la cedula ingresada y se asigna este usuario a la boleta creada y se retorna la boleta comprada			
		}
		else {
			return null;
		}
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
	public static HashMap<String, Cliente> getListaClientes() {
		return listaClientes;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public String toString (){
        String mensaje="El empleado se llama "+ nombre +" "+" con cedula "+cedula+" y telefono  " +
               telefono + " y un salario de "+ saldo;
        return mensaje;
    }
}
