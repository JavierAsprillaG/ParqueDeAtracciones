package gestorAplicacion.Personas;

import baseDatos.Datos;
import uiMain.menuconsola.MenuDeConsola;

public class Empleado extends Usuario{
    protected int sueldo;
    protected String lugar;
    
    public Empleado() {
    	
    }
    public Empleado(String nom, String ced, String tel,
    		String username, String email, String contrasena, int sue,String lug) { 
        super(nom,ced,tel, username, email, contrasena);
		this.sueldo = sue; 
		this.lugar = lug;
    }
        
    public int getSueldo() {
		return sueldo;
	}
    
    public String getLugar() {
		return lugar;
	}
       
    public void setLugar(String lugar) {
		this.lugar = lugar;
	}
    
    public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
}
