package uiMain.menuconsola;

import java.util.Scanner;

public class MenuPpal extends OpcionDeMenu{
	public MenuDeConsola mn = new MenuDeConsola();
	Scanner sc = new Scanner(System.in);
	int i;
	public void ejecutar() {
		System.out.println("meee");
		mn.a�adirOpcionDeMenu(new OpcLogging());
		mn.a�adirOpcionDeMenu(new OpcRegistrarse());
		mn.a�adirOpcionDeMenu(new OpcInvitado());
		System.out.println("BIENVENIDO TRIPULANTE!\nDESCUBRE UN MUNDO DE DIVERSION Y EMOCI�N");
		mn.lanzarMenu();
		i = sc.nextInt();
		if(i == 0){System.exit(0);}
		mn.getOpcion(i-1).ejecutar();
	}
	public String toString(){
		return "(0) para salir";
	}
}
