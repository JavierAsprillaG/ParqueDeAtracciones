package gestorAplicacion.Personas;

import baseDatos.Datos;
import gestorAplicacion.Registro;
import gestorAplicacion.Infraestructuras.Atraccion;
import gestorAplicacion.Infraestructuras.Tienda;

public class Administrador extends Empleado{
	
	public Administrador(){
		super();
	}
	public Administrador(String nom, String ced, String tel,
    		String username, String email, String contrasena, int sue,String lug) {
		super(nom,ced,tel,username, email, contrasena, sue, lug);
	}
	
	public static String crearUsuario(String nombre, String cedula, String telefono,String tip,
    		String username, String email, String contrasena, int sue,String lug) {
		Administrador admin = new Administrador(nombre,cedula,telefono,username, email, contrasena, sue, lug);
		admin.setUsername(username);
		admin.setEmail(email);
		admin.setContrasena(contrasena);
		
		String [] operations = {"1","2","3","4","5","6"};
		if(true){
			Datos.admins.put(username,admin);
			return "Ha sido creado";
		}else{
			return "No ha sido creado...";
		}
	// el metodo crea un Administrador asignandole los valores correspondientes
	// y llama al menu consola para informarle al usuario en caso de que
	// haya creado un nuevo Administrador o el caso contrario.
	}
	
//	public int consultar(Registro a, String b){ 
//		//b seria lo que se desea consultar, los ingresos, los gastos o el balance entre ambos
//		if (b.equals("i")) {
//			return a.getIngresos();
//		}
//		else if (b.equals("g")) {
//			return a.getGastos();
//		}
//		else {
//			int i = a.getIngresos();
//			int g = a.getGastos();
//			return i-g;
//		}
//	}
	
	public Tienda crearTienda(String id, String nom, int gan) {
		return new Tienda(id, nom, gan);
	}
	
	public Atraccion crearAtraccion(String id, String nom, int gan, int cap, boolean est) {
		return new Atraccion(id, nom, gan, cap, est);
	}
	
//	public void asginarcontraseña(){
//		this.crearEmpleado();
//	} 	
}
