package gestorAplicacion.Personas;

import baseDatos.Datos;
import gestorAplicacion.Registro;
import gestorAplicacion.Infraestructuras.Atraccion;
import gestorAplicacion.Infraestructuras.Tienda;
import uiMain.menuconsola.MenuDeConsola;

public class Administrador extends Empleado{
	
	Administrador(){
		super();
	}
	
	public Administrador(String nom, String ced, String tel,
    		String username, String email, String contrasena, int sue,String lug) {
		this(nom,ced,tel,"Administrador",username,email,contrasena,sue,lug);	
	}
	public Administrador(String nom, String ced, String tel,String tip,
    		String username, String email, String contrasena, int sue,String lug) {
		super(nom,ced,tel,tip,username, email, contrasena, sue, lug);
	}
	
	public static String crearAdministrador(String nombre, String cedula, String telefono,String tip,
    		String username, String email, String contrasena, int sue,String lug) {
		Administrador admin = new Administrador();
		admin.setNombre(nombre);
		admin.setUsername(username);
		admin.setEmail(email);
		admin.setContrasena(contrasena);
		admin.setLugar(lug);
		admin.setTipo(tip);
		admin.setCedula(cedula);
		admin.setTelefono(telefono);
		
		String [] operations = {"1","2","3","4","5"};
		MenuDeConsola.nuevoMenu(admin, operations);
		if(true){
			Datos.usuarios.put(username,admin);
			return "Ha sido creado";
		}else{
			return "No ha sido creado...";
		}
	}
	
	public int consultar(Registro a, String b){ 
		//b seria lo que se desea consultar, los ingresos, los gastos o el balance entre ambos
		if (b.equals("i")) {
			return a.getIngresos();
		}
		else if (b.equals("g")) {
			return a.getGastos();
		}
		else {
			int i = a.getIngresos();
			int g = a.getGastos();
			return i-g;
		}
	}
	
	public Tienda crearTienda(int id, String nom, int gan) {
		return new Tienda(id, nom, gan);
	}
	
	public Atraccion crearAtraccion(int id, String nom, int gan, int cap, boolean est) {
		return new Atraccion(id, nom, gan, cap, est);
	}
	
//	public void asginarcontraseña(){
//		this.crearEmpleado();
//	} 	
}
