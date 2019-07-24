package uiMain.menuconsola;

public class OpcDeMenuPpal extends OpcionDeMenu {

	public void ejecutar() {
		MenuPpal mi = new MenuPpal();
		mi.lanzarMenu();
	}
	public String toString() {
		return " volver al Menu Principal";
	}
	
}
