package uiMain.Main;

import java.util.Scanner;
import uiMain.menuconsola.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("BIENVENIDO TRIPULANTE!\nDESCUBRE UN MUNDO DE DIVERSION Y EMOCIÓN");
		Scanner sc = new Scanner(System.in);
		MenuDeConsola mn = new MenuDeConsola();
		mn.añadirOpcionDeMenu(new OpcLogging());
		mn.añadirOpcionDeMenu(new OpcRegistrarse());
		mn.añadirOpcionDeMenu(new OpcInvitado());
		//mn.añadirOpcionDeMenu(new OpcSalir);
		mn.lanzarMenu();
		mn.getOpcion(sc.nextInt()).ejecutar();
		
	}

}
