package uiMain.menuconsola;

import java.util.Scanner;

import gestorAplicacion.Usuario;

public class OpcRegistrarse extends OpcionDeMenu{
	public void ejecutar() {
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingrese su nombre: ");
		String name = leer.next();
		System.out.print("Ingrese su nombre de usuario: ");
		String username = leer.next();
		System.out.print("Ingrese su email: ");
		String email = leer.next();
		System.out.print("Ingrese su contraseña: ");
		String password = leer.next();
		Usuario.nuevoUsuario(name, username, email, password);
	}
	
	public String toString() {
		return " para registrarse como cliente";
	}
}
