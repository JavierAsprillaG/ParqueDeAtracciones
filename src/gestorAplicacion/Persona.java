package gestorAplicacion;
public abstract class Persona {
	protected int ID;
	protected String nombre;
	protected String cedula;
	protected String telefono;
	protected Persona(){		
	}
	public Persona(int id, String nom, String ced, String tel){
		ID = id;
		nombre = nom;
		cedula = ced;
		telefono = tel;
		}
	}
