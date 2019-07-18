package gestorAplicacion;
public class Operario extends Empleado{
	public Operario(String nombre, String cedula, String telefono,String tipo, int sueldo,String lugar) {
		super(nombre,cedula,telefono,tipo,sueldo,lugar);	
	}
	public void crearoperario() {
		super.solicitarcontraseña();
	}
	public void abrir(){ 
		Atraccion.abrirAtraccion();
	}
	public void cerrar(){
		Atraccion.cerrarAtraccion();
	}
	public void solicitar_mantenimiento(){
		cerrar();
		
	}
}
