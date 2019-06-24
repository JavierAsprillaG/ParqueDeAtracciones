package gestorAplicacion;
public class Boleta {
    private String categoria;
    private int ID;
    private int valor;
    private Persona usuario;
    private Boleta(String categoria,int ID,int valor,Persona usuario) {
    	categoria=categoria;
    	ID=ID;
    	valor=valor;
    	usuario=usuario;    	
    }
    private void crearboleta() {    	
    }
    
}
