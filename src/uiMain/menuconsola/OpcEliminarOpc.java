package uiMain.menuconsola;

import java.util.Scanner;

import gestorAplicacion.Personas.Usuario;

public class OpcEliminarOpc extends OpcionDeMenu {

	public OpcEliminarOpc(String key){
		super(key);
	}
	
	
	public void ejecutar() {
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingrese el nombre de usuario: ");
		String username = leer.next();
		Usuario user = Usuario.getUsuarioPorUsername(username);
		user.getMenu().verOpc();
		System.out.print("Ingrese el numero de la funcionalidad a remover: ");
		int index = leer.nextInt();
		user.getMenu().eliminarOpc(index);
	}

	@Override
	public String toString() {
		return "Quitar funcionalidades de un usuario";
	}

}
