package gestorAplicacion;
public class Empleado extends Persona{
    protected String tipo;
    protected int sueldo;
    protected String lugar;
    
    public Empleado(String nom, String ced, String tel,String tip, int sue,String lug ) { 
        super(nom,ced,tel);
		this.tipo = tip;
		this.sueldo = sue; 
		this.lugar = lug;
    }
    
    public Empleado crearEmpleado() {
    	return new Empleado(nombre, cedula, telefono, tipo, sueldo, lugar);
    }
}
