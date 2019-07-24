package gestorAplicacion.Personas;

import baseDatos.Datos;
import uiMain.menuconsola.MenuDeConsola;

public class Empleado extends Usuario{
    protected String tipo;
    protected int sueldo;
    protected String lugar;
    
    public Empleado() {
    	
    }
    public Empleado(String nom, String ced, String tel,String tip,
    		String username, String email, String contrasena, int sue,String lug) { 
        super(nom,ced,tel, username, email, contrasena);
		this.tipo = tip;
		this.sueldo = sue; 
		this.lugar = lug;
    }
    
    public String crearEmpleado(String nom, String ced, String tel,String tip,
    		String username, String email, String contrasena, int sue,String lug) {
    	Empleado user = new Empleado();
		user.setNombre(nom);
		user.setUsername(username);
		user.setEmail(email);
		user.setContrasena(contrasena);
		
		String [] operations = {"1","2","3","4","5"};
		MenuDeConsola.nuevoMenu(user, operations);
		if(true){
			Datos.usuarios.put(username,user);
			return "Ha sido creado un nuevo empleado";
		}else{
			return "No se ha creado el empleado";
		}
	// el metodo crea un Empleado user y asignandole valores correspondientes
	// y llama al menu consola para informarle al usuario en caso de que
	// haya creado un nuevo Empleado o el caso contrario.
    }
    
    public int getSueldo() {
		return sueldo;
	}
    
    public String getLugar() {
		return lugar;
	}
    
    public String getTipo() {
		return tipo;
	}
    
    public void setLugar(String lugar) {
		this.lugar = lugar;
	}
    
    public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
    
    public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
