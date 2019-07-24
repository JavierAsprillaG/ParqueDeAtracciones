package gestorAplicacion.Personas;

import baseDatos.Datos;
import gestorAplicacion.Infraestructuras.Atraccion;
import uiMain.menuconsola.MenuDeConsola;

public class Operario extends Empleado{
	public Operario(String nom, String ced, String tel,
    		String username, String email, String contrasena, int sue,String lug) {
		this(nom,ced,tel,"Operario",username,email,contrasena,sue,lug);	
	}
	public Operario(String nom, String ced, String tel,String tip,
    		String username, String email, String contrasena, int sue,String lug) {
		super(nom,ced,tel,tip,username, email, contrasena, sue, lug);
	}

	public static String nuevoOperario(String nombre, String cedula, String telefono,String tip,
    		String username, String email, String contrasena, int sue,String lug) {
		Vendedor vend = new Vendedor();
		vend.setNombre(nombre);
		vend.setUsername(username);
		vend.setEmail(email);
		vend.setContrasena(contrasena);
		vend.setLugar(lug);
		vend.setTipo(tip);
		vend.setCedula(cedula);
		vend.setTelefono(telefono);
		
		String [] operations = {"1","2","3","4","5"};
		MenuDeConsola.nuevoMenu(vend, operations);
		if(true){
			Datos.usuarios.put(username,vend);
			return "Ha sido creado";
		}else{
			return "No ha sido creado...";
		}
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
