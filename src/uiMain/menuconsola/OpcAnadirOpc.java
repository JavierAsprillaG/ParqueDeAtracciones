package uiMain.menuconsola;

import java.util.Scanner;

import gestorAplicacion.Personas.Usuario;;

public class OpcAnadirOpc extends OpcionDeMenu {

	public OpcAnadirOpc(String key){
		super(key);
	}
	
	public void ejecutar() {
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingrese el nombre de usuario: ");
		String username = leer.next();
		Usuario user = Usuario.getUsuarioPorUsername(username);
		OpcionDeMenu.seeAllOperations();
		System.out.print("Ingrese el numero de la funcionalidad a añadir: ");
		String opt = leer.next();
		user.getMenu().anadirOpc(opt);
	}

	public String toString() {
		return "Añadir funcionalidades a un usuario";
	}

}
