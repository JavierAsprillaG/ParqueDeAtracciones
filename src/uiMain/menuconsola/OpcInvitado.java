package uiMain.menuconsola;
import uiMain.menuconsola.invitado.*;

public class OpcInvitado extends OpcionDeMenu{
	MenuDeConsola mnu = new MenuDeConsola();
	public void ejecutar() {
		mnu.añadirOpcionDeMenu(new OpcVerBoletas());
		mnu.añadirOpcionDeMenu(new OpcVerCatalogo());
		mnu.añadirOpcionDeMenu(new MenuPpal());
		System.out.println(mnu);
	}
	public String toString() {
		return " para entrar como invitado";
	}
}
