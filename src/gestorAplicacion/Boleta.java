package gestorAplicacion;
public class Boleta {
    private String categoria;
    private int ID;
    private int valor;
    private Persona usuario;
    private Boleta(String categoria,int id,int valor,Persona usuario) { 
    	this.categoria = categoria;
    	ID = id;
    	this.valor = valor;
    	this.usuario = usuario;
    }
    private void crearboleta() {    	
    }
    
}
