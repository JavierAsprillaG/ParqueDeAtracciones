package uiMain.menuconsola;

import java.util.Scanner;

import gestorAplicacion.Personas.Vendedor;

public class OpcNuevoVendedor extends OpcionDeMenu {

	public OpcNuevoVendedor(String key){
		super(key);
	}
	
	public void ejecutar() {
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingrese el nombre: ");
		String name = leer.next();
		System.out.print("Ingrese el cedula: ");
		String cc = leer.next();
		System.out.print("Ingrese el nombre telefono: ");
		String tel = leer.next();
		System.out.print("Ingrese el nombre de usuario: ");
		String username = leer.next();
		System.out.print("Ingrese su email: ");
		String email = leer.next();
		System.out.print("Ingrese la contraseña: ");
		String password = leer.next();
		System.out.print("Ingrese el sueldo: ");
		int sue = leer.nextInt();
		System.out.print("Ingrese lugar de trabajo: ");
		String lugar = leer.next();
		Vendedor.nuevoVendedor(name,cc,tel,"Vendedor", username, email, password,sue,lugar);
	}

	@Override
	public String toString() {
		return " ingresar nuevo usuario vendedor";
	}

}
