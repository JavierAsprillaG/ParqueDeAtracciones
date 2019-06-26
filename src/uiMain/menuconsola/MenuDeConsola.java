package uiMain.menuconsola;
import java.util.ArrayList;

public class MenuDeConsola {
	private ArrayList<OpcionDeMenu> opciones = new ArrayList<OpcionDeMenu>();
	
	public OpcionDeMenu getOpcion(int i) {
		return opciones.get(i);
	}
	
	public void añadirOpcionDeMenu(OpcionDeMenu op) {
		opciones.add(0,op);
	}

	public void lanzarMenu() {
		int i =1;
		for(OpcionDeMenu a:opciones) {
			System.out.println("Presione ("+i+")"+a);
			i++;
		}
	}
	
}
