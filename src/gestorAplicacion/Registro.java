package gestorAplicacion;
public class Registro {
	private int ganancias;
	private int gastos;
	public void registro(int ganancias,int gastos){ 
		this.ganancias = ganancias;
		this.gastos = gastos;
	} 
	public Registro() {		
	}
	public int getGanancias() {
		return ganancias;
	}
	public int getGastos() {
		return gastos;
	}	
}
