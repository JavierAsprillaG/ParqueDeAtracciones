package gestorAplicacion;
public class Atraccion extends Infraestructura{
	private int capacidad;
	private boolean estado;	
	public Atraccion(int id,String nom,int gan, int cap,boolean est) {
		super(id,nom,gan);
		capacidad=cap;
		estado=est;	
	}
	public void cerrarAtraccion() {
		estado = false;
	}
	public void abrirAtraccion() {
		estado = true;
	}
	public boolean consultarEstado() {
		return estado;
	}
}
