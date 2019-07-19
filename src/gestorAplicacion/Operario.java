package gestorAplicacion;
public class Operario extends Empleado{
	public Operario(String nombre, String cedula, String telefono,String tipo, int sueldo,String lugar) {
		super(nombre,cedula,telefono,tipo,sueldo,lugar);	
	}
	public Empleado crearoperario() {
		return super.crearEmpleado();
	}
	public void abrir(Atraccion a){ 
		a.abrirAtraccion();
	}
	public void cerrar(Atraccion a){
		a.cerrarAtraccion();
	}
	public void solicitar_mantenimiento(Atraccion a){
		a.cerrarAtraccion();
		
	}
}
