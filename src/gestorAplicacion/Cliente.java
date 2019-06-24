package gestorAplicacion;
public class Cliente extends Persona {
	ArrayList<String> listaClientes = new ArrayList<String>();
	private int saldo= 50000;
	public Cliente() {		
	}
	public Cliente(int id, String nombre, String cedula, String telefono) {	
		super(id,nombre,cedula,telefono);
	}
	public void registrar(int id, String nombre, String cedula, String telefono) {
		new Cliente (id, nombre, cedula, telefono);
		ArrayList<String> listaClientes = new ArrayList<String>();
	}
	public void comprar() {		
	}	
}
