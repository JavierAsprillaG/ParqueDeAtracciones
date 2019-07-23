package gestorAplicacion;
public class Operario extends Empleado{
	public Operario(String nom, String ced, String tel,
    		String username, String email, String contrasena, int sue,String lug) {
		this(nom,ced,tel,"Operario",username,email,contrasena,sue,lug);	
	}
	public Operario(String nom, String ced, String tel,String tip,
    		String username, String email, String contrasena, int sue,String lug) {
		super(nom,ced,tel,tip,username, email, contrasena, sue, lug);
	}
//	public void crearoperario(String nom, String ced, String tel,String tip,
//    		String username, String email, String contrasena, int sue,String lug) {
//		super.crearEmpleado();
//	}
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
