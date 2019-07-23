package gestorAplicacion;

import java.util.HashMap;
import baseDatos.Datos;
import uiMain.Main.*;
import uiMain.menuconsola.MenuDeConsola;

public class Usuario{
	private String nombre;
	private String username;
	private String email;
	private String contrasena;
	private MenuDeConsola menu;
	
	
	public Usuario() {
	}
	
	protected Usuario(String username, MenuDeConsola menu) {
		this.username = username;
		this.menu = menu;
		Datos.usuarios.put(username, this);
	}

	public Usuario(String nombre, String username, String email, String contraseña) {
		this.nombre = nombre;
		this.username = username;
		this.email = email;
		this.contrasena = contraseña;
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
	
	public MenuDeConsola getMenu() {
		return menu;
	}

	public void setMenu(MenuDeConsola menu) {
		this.menu = menu;
	}
	
	public static String nuevoUsuario(String nombre, String username, String email, String contraseña){
		Usuario user = new Usuario();
		user.setNombre(nombre);
		user.setUsername(username);
		user.setEmail(email);
		user.setContrasena(contraseña);

		String [] operations = {"5"};
		MenuDeConsola.newMenu(user, operations);
		if(true){
			Datos.usuarios.put(username,user);
			return "Ha sido creado";
		}else{
			return "No ha sido creado...";
		}
	}
	public static String editarUsuario(Usuario u,int option, String value){
		switch (option) {
		case 1:	
			u.setNombre(value);
			return "Nombre modificado";
		case 2:
			u.setContrasena(value);
			return "Contraseña modificada";
		default:
			return "Opcion no valida";
		}
	}
	
	public static String borrarUsuario(String username){
		Datos.usuarios.remove(username);
		return "Ha sido eliminado";
	}
	
	public static Usuario getUsuarioPorUsername(String username){
        return Datos.usuarios.get(username);
    }
	
	public HashMap<String, Usuario> getUsuarios(){
		return Datos.usuarios;
	}
	
    public static String login(String username, String password){
        Usuario u = Usuario.getUsuarioPorUsername(username);
        if (u != null){
            if(u.getUsername().equals(username) && u.getContrasena().equals(password)){
            	Main.usuario = u;
                return "Bienvenido "+u.getNombre();
            }
        }
        return "Usuario no encontrado";
    }
    
    public static String signOut(){
    	Main.usuario = getUsuarioPorUsername("default");
        return "Adios";
    }
}
