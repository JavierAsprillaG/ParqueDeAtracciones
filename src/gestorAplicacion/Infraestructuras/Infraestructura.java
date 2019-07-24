package gestorAplicacion.Infraestructuras;
public abstract class Infraestructura {
	private int id;
    private String nombre;
    private int ganancias;
    
    public Infraestructura() {   	
    }
    public Infraestructura(int id, String nom, int gan){
    	this.id = id; 
    	this.nombre = nom;
    	this.ganancias = gan;
    }
    public int getID(){
        return id;
    }public String getNombre(){
        return nombre;
    }public int getGanancias(){
        return ganancias;
    }public void setID(int id){
        this.id=id;
    }public void setNombre(String nombre){
        this.nombre=nombre;
    }public void setGanancias(int ganancias){
        this.ganancias=ganancias;
    }
}
