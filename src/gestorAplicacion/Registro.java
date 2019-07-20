package gestorAplicacion;
public class Registro {
	private int ingresos;
	private int gastos;
	
	public Registro(int ing,int gas){ 
		this.ingresos = ing;
		this.gastos = gas;
	}
	
	public Registro() {		
	}

	public void setingresos(int ing) {
		this.ingresos += ing;
	}
	
	public void setGastos(int gas) {
		this.gastos += gas;
	}
		
	public int getingresos() {
		return ingresos;
	}
	
	public int getGastos() {
		return gastos;
	}
	
}
