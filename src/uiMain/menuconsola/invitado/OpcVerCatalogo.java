package uiMain.menuconsola.invitado;
import uiMain.menuconsola.*;
import java.util.Scanner;

public class OpcVerCatalogo extends OpcionDeMenu{
	Scanner sc = new Scanner(System.in);
	MenuDeConsola men = new MenuDeConsola();
	public void ejecutar() {
		String archivoarticulos = cargarchivoarticulos();
		men.añadirOpcionDeMenu(new OpcCompra());
		men.añadirOpcionDeMenu(new MenuPpal());
		men.añadirOpcionDeMenu(new OpcSalir());
		
		while(archivoarticulos.hasToken()) {
			System.out.println(archivoarticulos.nextToken());
		}
		
		men.lanzarMenu();
		men.getOpcion(sc.nextInt()-1).ejecutar();
	}
	public String toString() {
		return " para ver el catálogo de artículos";
	}
}
