package gestorAplicacion;
public abstract class Persona {
	protected int ID;
	protected String nombre;
	protected String cedula;
	protected String telefono;
	protected Persona(){		
	}
	public Persona(int id, String nombre, String cedula, String telefono){
		ID = id;
		this.nombre = nombre;
		this.cedula = cedula;
		this.telefono = telefono;
		}
	}
