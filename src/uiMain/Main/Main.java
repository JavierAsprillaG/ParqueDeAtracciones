package uiMain.Main;

import java.util.Scanner;
import uiMain.menuconsola.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("BIENVENIDO TRIPULANTE!\nDESCUBRE UN MUNDO DE DIVERSION Y EMOCI�N");
		Scanner sc = new Scanner(System.in);
		MenuDeConsola mn = new MenuDeConsola();
		mn.a�adirOpcionDeMenu(new OpcLogging());
		mn.a�adirOpcionDeMenu(new OpcRegistrarse());
		mn.a�adirOpcionDeMenu(new OpcInvitado());
		//mn.a�adirOpcionDeMenu(new OpcSalir);
		mn.lanzarMenu();
		mn.getOpcion(sc.nextInt()).ejecutar();
		
	}

}
