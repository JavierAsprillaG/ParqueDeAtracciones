package gestorAplicacion;
public class Empleado extends Persona{
    private String tipo;
    private int sueldo;
    private String lugar;
    public Empleado(int id, String nombre, String cedula, String telefono,String tipo, int sueldo,String lugar ) { 
        super(id,nombre,cedula,telefono);
		this.tipo = tipo;
		this.sueldo = sueldo; 
		this.lugar = lugar;
    }
    public void solicitarcontraseña() {  	
    }
}
