package uiMain.Main;

import gestorAplicacion.Personas.Usuario;
import uiMain.menuconsola.*;

public class Main {
	public static Usuario usuario = new Usuario();
	public static void main(String[] args) {
		//mn.a�adirOpcionDeMenu(new OpcSalir);
		MenuPpal m = new MenuPpal();
		m.ejecutar();
		System.out.println(m);		
	}

}
