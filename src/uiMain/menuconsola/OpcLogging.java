package uiMain.menuconsola;
import java.util.Scanner;
public class OpcLogging extends OpcionDeMenu{

	MenuDeConsola mn = new MenuDeConsola();
	public void ejecutar(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su usuario: ");
		String str1 = sc.next();
		if(archivodeusuarios.contains(str1)){
			
		}
	}
	
	public String toString() {
		return " para ingresar como usuario registrado";
	}
}
