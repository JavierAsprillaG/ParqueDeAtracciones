package uiMain.menuconsola;
import uiMain.menuconsola.invitado.*;

public class OpcInvitado extends OpcionDeMenu{
	MenuDeConsola mnu = new MenuDeConsola();
	public void ejecutar() {
		mnu.a�adirOpcionDeMenu(new OpcVerBoletas());
		mnu.a�adirOpcionDeMenu(new OpcVerCatalogo());
		System.out.println("Presione (1)"+mnu.getOpcion(0)+"\nPresione (2)"+mnu.getOpcion(1));
	}
	public String toString() {
		return " para entrar como invitado";
	}
}
