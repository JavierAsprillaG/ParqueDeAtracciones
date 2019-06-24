package gestorAplicacion;
public class Empleado extends Persona{
    private String tipo;
    private int sueldo;
    private String lugar;
    public Empleado(int id, String nom, String ced, String tel,String tip, int sueld,String lug ) { 
        super(id,nom,ced,tel);
		tipo = tip;
		sueldo = sueld; 
		lugar = lug;
    }
    public void solicitarcontraseña() {
   	
    }
}
