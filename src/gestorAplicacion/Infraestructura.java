package gestorAplicacion;
public abstract class Infraestructura {
	private static int ID;
    private String nombre;
    private int ganancias;
    
    public Infraestructura() {   	
    }
    public Infraestructura(int id, String nom, int gan){
    	ID = id; 
    	nombre = nom;
    	ganancias = gan;
    }
}
