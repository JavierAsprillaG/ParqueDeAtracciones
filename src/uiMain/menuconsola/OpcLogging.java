package uiMain.menuconsola;
import java.util.Scanner;

import baseDatos.Datos;
import gestorAplicacion.Personas.Usuario;
public class OpcLogging extends OpcionDeMenu{

	public void ejecutar(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su usuario: ");
		String str1 = sc.next();
		Usuario u = Usuario.getUsuarioPorUsername(str1);
		while(u == null){
			System.out.println("El usuario ingresado es incorrecto o no existe\nInténtelo de nuevo");
			str1 = sc.next();
			if(str1.equals("0")) {
				MenuPpal m = new MenuPpal();
				m.lanzarMenu();
				System.out.println(m);
			}
			
		}
		System.out.println("Ingrese su contraseña");
		String str2 = sc.next();
		while(!u.getContrasena().equals(str2)){
			System.out.println("La contraseña ingresada es incorrecta\nInténtelo de nuevo");
			str1 = sc.next();
		}
	}
	
	public String toString() {
		return " para ingresar como usuario registrado";
	}
}
