package uiMain.Main;

import gestorAplicacion.Persona;
import uiMain.menuconsola.*;

public class Main {
	Persona usuario = new Persona();
	public static void main(String[] args) {
		//mn.a�adirOpcionDeMenu(new OpcSalir);
		MenuPpal m = new MenuPpal();
		m.ejecutar();
		System.out.println(m);		
	}

}
