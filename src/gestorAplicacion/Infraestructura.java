package gestorAplicacion;
public abstract class Infraestructura {
	protected int ID;
    protected String nombre;
    protected int ganancias;
    
    public Infraestructura() {   	
    }
    public Infraestructura(int id, String nom, int gan){
    	ID = id; 
    	nombre = nom;
    	ganancias = gan;
    }
}
