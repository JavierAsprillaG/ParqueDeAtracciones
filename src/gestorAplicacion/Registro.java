package gestorAplicacion;

import gestorAplicacion.Personas.Persona;

public class Registro {
	private static int ingresos;
	private static int gastos;
	private static int ID = 0;
	private Persona usuario;
	public Registro(int ing,int gas,Persona usuario){ 
		this.ingresos = ing;
		this.gastos = gas;
		this.usuario=usuario;
	}
	public static Registro crearregistro(int ing,int gas,Persona a) {
		ID=ID+1;
		return new Registro(ing, gas, a);
		
		
	}   	
	
	public Registro() {		
	}

	public static void setingresos(int ing) {
		ingresos += ing;
	}
	
	public static void setGastos(int gas) {
		gastos += gas;
	}
		
	public int getingresos() {
		return ingresos;
	}
	
	public int getGastos() {
		return gastos;
	}
	public static int getID() {
		return ID;
	}

	public static void setID(int iD) {
		ID = iD;
	}
	
	
}
