package gestorAplicacion;
public abstract class Persona {
	//protected int ID;
	protected String nombre;
	protected String cedula;
	protected String telefono;
	protected Persona(){		
	}
	public Persona(String nombre, String cedula, String telefono){
		//ID = id;
		this.nombre = nombre;
		this.cedula = cedula;
		this.telefono = telefono;
		}
	public String getNombre(){
		return nombre;
	}public String getCedula(){
		return cedula;
	}public String getTelefono(){
		return telefono;
	}public void setNombre(String nombre){
		this.nombre=nombre;
	}public void setCedula(String cedula){
		this.cedula=cedula;
	}public void setTelefono(String telefono){
		this.telefono=telefono;
	}
}
