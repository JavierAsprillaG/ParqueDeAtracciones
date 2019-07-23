package uiMain.menuconsola;

import java.util.ArrayList;
import java.util.Scanner;
import gestorAplicacion.Usuario;
import uiMain.*;

public class MenuPpal extends MenuDeConsola{
	static ArrayList<OpcionDeMenu> op = new ArrayList<OpcionDeMenu>() {
		{
			add(new OpcLogging());
			add(new OpcInvitado());
			add(new OpcRegistrarse());
			add(new OpcSalir());
		}
	};
	public MenuPpal() {
		super(op);
	}
	
}
