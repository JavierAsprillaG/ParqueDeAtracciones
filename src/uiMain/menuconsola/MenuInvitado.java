package uiMain.menuconsola;

import java.util.ArrayList;
import uiMain.menuconsola.invitado.*;

public class MenuInvitado extends MenuDeConsola{

	static ArrayList<OpcionDeMenu> op = new ArrayList<OpcionDeMenu>() {
		{
			add(new OpcVerBoletas());
			add(new OpcVerCatalogo());
		}
	};
	public MenuInvitado() {
		super(op);
	}
	
}
