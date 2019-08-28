package Modelo.Personas;

import java.util.HashMap;

import Modelo.Main.*;
import Modelo.baseDatos.Datos;

public class Usuario extends Persona{
	protected String username;
	protected String email;
	protected String contrasena;
	
	
	public Usuario() {
	}

	public Usuario(String nombre, String ced, String tel, 
			String username, String email, String contraseņa) {
		super(nombre,ced,tel);
		this.username = username;
		this.email = email;
		this.contrasena = contraseņa;
		Datos.usuarios.put(username, this);
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
//	public static String nuevoUsuario(String nombre, String username, String email, String contraseņa){
//		Usuario user = new Usuario();
//		user.setNombre(nombre);
//		user.setUsername(username);
//		user.setEmail(email);
//		user.setContrasena(contraseņa);
//
//		String [] operations = {"5"};
//		MenuDeConsola.nuevoMenu(user, operations);
//		if(true){
//			Datos.usuarios.put(username,user);
//			return "Ha sido creado";
//		}else{
//			return "No ha sido creado...";
//		}
//	// el metodo crea un Usuario user asignandole los valores correspondientes
//	// y llama al menu consola para informarle al usuario en caso de que
//	// haya creado un nuevo Usuario o el caso contrario
//	}
	public static String editarUsuario(Usuario u,int option, String value){
		switch (option) {
		case 1:	
			u.setNombre(value);
			return "Nombre modificado";
		case 2:
			u.setContrasena(value);
			return "Contraseņa modificada";
		default:
			return "Opcion no valida";
		}
	// el metodo permite a un Usuario u el poder cambiar su nombre o contraseņa por un 
	// String value elegiendo entre opciones 1 y 2 con option.
	}
	
	public static String borrarUsuario(String username){
		Datos.usuarios.remove(username);
		return "Ha sido eliminado";
	// el metodo permite
	}
	
	public static Usuario getUsuarioPorUsername(String username){
        return Datos.usuarios.get(username);
    }
	
	public HashMap<String, Usuario> getUsuarios(){
		return Datos.usuarios;
	}
	
    public static boolean login(String username, String contrasena){
        Usuario u = Usuario.getUsuarioPorUsername(username);
        if (u != null){
            if(u.getUsername().equals(username) && u.getContrasena().equals(contrasena)){
            	Main.usuario = u;
                return true;
            }
        }
        return false;
    }
    
    public static String signOut(){
    	Main.usuario = getUsuarioPorUsername("default");
        return "Adios";
    }
}
