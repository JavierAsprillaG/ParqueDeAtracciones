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
	public void asginarcontraseña(){
		crearEmpleado();
	} 	
}
