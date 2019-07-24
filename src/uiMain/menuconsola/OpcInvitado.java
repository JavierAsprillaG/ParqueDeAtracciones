package uiMain.menuconsola;
import uiMain.menuconsola.invitado.*;

public class OpcInvitado extends OpcionDeMenu{
	public void ejecutar() {
		MenuInvitado mi = new MenuInvitado();
		mi.lanzarMenu();
	}
	public String toString() {
		return " para entrar como invitado";
	}
}
