package uiMain.menuconsola;

import java.util.Scanner;

public class OpcCerrarAtrac extends OpcionDeMenu {

	public void ejecutar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cual atracci�n se cerrar�");
		int c = sc.nextInt();

	}

	public String toString() {
		return " para inhabilitar una atracci�n";
	}

}
