package gestorAplicacion;
public class Administrador extends Empleado{
    public Administrador(String nombre, String cedula, String telefono,String tipo, int sueldo,String lugar) {
		super(nombre,cedula,telefono,tipo,sueldo,lugar);	
	}
	
	public Administrador crearAdministrador() {
		return new Administrador(nombre, cedula, telefono, tipo, sueldo, lugar);
	}
	
	public int consultar(Registro a, String b){ 
		//b seria lo que se desea consultar, los ingresos, los gastos o el balance entre ambos
		if (b.equals("i")) {
			return a.getingresos();
		}
		else if (b.equals("g")) {
			return a.getGastos();
		}
		else {
			int i = a.getingresos();
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
	
	public void asginarcontraseña(){
		this.crearEmpleado();
	} 	
}
