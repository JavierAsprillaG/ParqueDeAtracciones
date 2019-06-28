package uiMain.menuconsola;
import java.util.Scanner;
public class OpcLogging extends OpcionDeMenu{

	MenuDeConsola mn = new MenuDeConsola();
	public void ejecutar(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su usuario: ");
		String str1 = sc.next();
		while(!archivodeusuarios.contains(str1)){
			System.out.println("El usuario ingresado es incorrecto o no existe\nInténtelo de nuevo");
			str1 = sc.next();
			if(str1.equals("0")) {
				MenuPpal m = new MenuPpal();
				m.ejecutar();
				System.out.println(m);
			}
		}
		System.out.println("Ingrese su contraseña");
		String str2 = sc.next();
		while(!archivodeusuarios.get(str1).contraseña.eguals(str2)){
			System.out.println("La contraseña ingresada es incorrecta\nInténtelo de nuevo");
			str1 = sc.next();
		}
		System.out.println("Oprima 0 para regresar");
	}
	
	public String toString() {
		return " para ingresar como usuario registrado";
	}
}
