package gestorAplicacion;

import uiMain.menuconsola.MenuDeConsola;

public class Usuario{
	private String nombre;
	private String username;
	private String email;
	private String contraseña;
	private MenuDeConsola menu;
	
	
	public Usuario() {
	}
	
	protected Usuario(String username, MenuDeConsola menu) {
		this.username = username;
		this.menu = menu;
		//Falta Guardar usuario
	}

	public Usuario(String nombre, String username, String email, String contraseña) {
		this.nombre = nombre;
		this.username = username;
		this.email = email;
		this.contraseña = contraseña;
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

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	public MenuDeConsola getMenu() {
		return menu;
	}

	public void setMenu(MenuDeConsola menu) {
		this.menu = menu;
	}
	
	public static void nuevoUsuario(String nombre, String username, String email, String contraseña){
		Usuario user = new Usuario();
		user.setNombre(nombre);
		user.setUsername(username);
		user.setEmail(email);
		user.setContraseña(contraseña);
		//Falta Guardarlor
	}
}
