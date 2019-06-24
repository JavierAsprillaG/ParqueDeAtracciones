package gestorAplicacion;
public class Cliente extends Persona {
	private int saldo= 50000;
	public Cliente() {		
	}
	public Cliente(int id, String nombre, String cedula, String telefono) {	
		super(id,nombre,cedula,telefono);
	}
	public void comprar() {		
	}	
}
