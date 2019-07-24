package uiMain.menuconsola;
import java.util.Scanner;

import baseDatos.Datos;
import gestorAplicacion.Usuario;
public class OpcLogging extends OpcionDeMenu{

	public void ejecutar(){
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingrese su usuario: ");
		String username = leer.next();
		System.out.print("Ingrese su contraseña: ");
		String password = leer.next();
		
		System.out.println(Usuario.login(username, password));
		
	}
	
	public String toString() {
		return " para ingresar como usuario registrado";
	}
}
