package gestorAplicacion.Infraestructuras;
/**/
public abstract class Infraestructura {
	private int id;
    private String nombre;
    
    
    public Infraestructura() {   	
    }
    public Infraestructura(int id, String nom){
    	this.id = id; 
    	this.nombre = nom;
    }
    public int getID(){
        return id;
    }public String getNombre(){
        return nombre;
    }public void setID(int id){
        this.id=id;
    }public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
}
