package uiMain.menuconsola;
import uiMain.menuconsola.invitado.*;

public class OpcInvitado extends OpcionDeMenu{
	MenuDeConsola mnu = new MenuDeConsola();
	public void ejecutar() {
		mnu.a�adirOpcionDeMenu(new OpcVerBoletas());
		mnu.a�adirOpcionDeMenu(new OpcVerCatalogo());
		mnu.a�adirOpcionDeMenu(new MenuPpal());
		System.out.println(mnu);
	}
	public String toString() {
		return " para entrar como invitado";
	}
}
