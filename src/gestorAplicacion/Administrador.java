package gestorAplicacion;
public class Administrador extends Empleado{
    public Administrador(String nombre, String cedula, String telefono,String tipo, int sueldo,String lugar) {
		super(nombre,cedula,telefono,tipo,sueldo,lugar);	
	}
	
	public Administrador crearadministrador() {
		return new Administrador(nombre, cedula, telefono, tipo, sueldo, lugar);
	}
	
	public void consultar(){   
	}
	public Tienda crearTienda(int id, String nom, int gan) {
		return new Tienda(id, nom, gan);
	}
	
	public Atraccion crearAtraccion(int id, String nom, int gan, int cap, boolean est) {
		return new Atraccion(id, nom, gan, cap, est);
	}
	
	public void asginarcontraseña(){
		this.crearEmpleado();
	} 	
}
