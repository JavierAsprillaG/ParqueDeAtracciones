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
	public void comprar() {		
	}	
}
