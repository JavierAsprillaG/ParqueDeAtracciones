package uiMain.Main;

import uiMain.menuconsola.*;

public class Main {

	public static void main(String[] args) {
		//mn.añadirOpcionDeMenu(new OpcSalir);
		MenuPpal m = new MenuPpal();
		m.ejecutar();
		System.out.println(m);		
	}

}
