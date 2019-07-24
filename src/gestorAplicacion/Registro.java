package gestorAplicacion;

import baseDatos.Datos;
import gestorAplicacion.Personas.Persona;

public class Registro {
	private  int ingresos;
	private  int gastos;
	private  int ID = 0;
	private Persona usuario;
	public Registro(int ing,int gas,Persona usuario){ 
		this.ingresos = ing;
		this.gastos = gas;
		this.usuario=usuario;
	}
	public  Registro crearregistro(int ing,int gas,Persona a) {
		ID=ID+1;
		return new Registro(ing, gas, a);		
	}   	
	
	public static String nuevoRegistro(int id, int g, int gan) {
		Registro r = new Registro();
		r.setID(id);
		r.setGastos(g);
		r.setIngresos(g);
		if(true){
			Datos.registro.put(""+id,r);
			return "Ha sido creado";
		}else{
			return "No ha sido creado...";
		}
	}
	
	public Registro() {		
	}

	public  void setIngresos(int ing) {
		ingresos += ing;
	}
	
	public  void setGastos(int gas) {
		gastos += gas;
	}
		
	public int getIngresos() {
		return ingresos;
	}
	
	public int getGastos() {
		return gastos;
	}
	public  int getID() {
		return ID;
	}

	public  void setID(int iD) {
		ID = iD;
	}
	
	
}
