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
		Operario op = new Operario();
		op.setNombre(nombre);
		op.setUsername(username);
		op.setEmail(email);
		op.setContrasena(contrasena);
		op.setLugar(lug);
		op.setTipo(tip);
		op.setCedula(cedula);
		op.setTelefono(telefono);
		
		String [] operations = {"1","2","3","4","5"};
		MenuDeConsola.nuevoMenu(op, operations);
		if(true){
			Datos.usuarios.put(username,op);
			return "Ha sido creado";
		}else{
			return "No ha sido creado...";
		}
	// el metodo crea un Operaroio op asignandole los valores correspondientes
	// y llama al menu consola para informarle al usuario en caso de que
	// haya creado un nuevo Operario o el caso contrario
	}
	
	public void abrir(Atraccion a){ 
		a.abrirAtraccion();
	// este metodo le permite al operario abrir una atraccion a
	}
	public void cerrar(Atraccion a){
		a.cerrarAtraccion();
	// este metodo le permite al operario cerrar una atraccion a
	}
	public void solicitar_mantenimiento(Atraccion a){
		a.cerrarAtraccion();
		
	}
}
