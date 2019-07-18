package gestorAplicacion;
public class Empleado extends Persona{
    protected String tipo;
    protected int sueldo;
    protected String lugar;
    public Empleado(String nombre, String cedula, String telefono,String tipo, int sueldo,String lugar ) { 
        super(nombre,cedula,telefono);
		this.tipo = tipo;
		this.sueldo = sueldo; 
		this.lugar = lugar;
    }
    public void solicitarcontrase�a() {
    	Administrador.asginarcontrase�a();
    }   
    public Empleado crearEmpleado() {
    	return new Empleado(nombre, cedula, telefono, tipo, sueldo, lugar);
    }
}
