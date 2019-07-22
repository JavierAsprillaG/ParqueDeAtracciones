package gestorAplicacion;

import java.util.*;
public class prueba {
	public static void main (String[] args) { 		
		Scanner entrada=new Scanner(System.in);
		System.out.print("Ingrese nombre ");
		String nombre=entrada.nextLine();
		System.out.print("Ingrese cedula ");
		String cedula=entrada.nextLine();
		System.out.print("Ingrese telefono ");
		String telefono=entrada.nextLine();
		System.out.print("Ingrese categoria ");
		String categoria=entrada.nextLine();
		Cliente.registrar(nombre,cedula,telefono);
		System.out.print(Cliente.verificarRegistro(cedula+" "));
		System.out.print(Cliente.comprarBoleta(cedula,categoria));					
	}
}
