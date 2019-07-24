package uiMain.menuconsola;
import java.util.ArrayList;

import Personas.Usuario;
import baseDatos.Datos;

public class MenuDeConsola {
	private Usuario usu;
	private ArrayList<OpcionDeMenu> opciones = new ArrayList<OpcionDeMenu>();
	
	public MenuDeConsola(ArrayList<OpcionDeMenu> options){
		this.opciones = options;
	}
	
	public MenuDeConsola(Usuario user, ArrayList<OpcionDeMenu> options){
		this.usu = user;
		this.opciones = options;
	}
	
	public Usuario getUsuario() {
		return usu;
	}

	public void setUsuario(Usuario user) {
		this.usu = user;
	}
	
	public ArrayList<OpcionDeMenu> getOpciones() {
		return opciones;
	}

	public void setOpciones(ArrayList<OpcionDeMenu> options) {
		this.opciones = options;
	}
	
	public OpcionDeMenu getOpcion(int i) {
		return opciones.get(i);
	}
	
	public void añadirOpcionDeMenu(OpcionDeMenu op) {
		opciones.add(0,op);
	}
	
	public String[] getOperaciones() {
		String [] opt = new String[opciones.size()];
		int i = 0;
		for (OpcionDeMenu opcionDeMenu : opciones) {
			//opt[i] = opcionDeMenu.getKey();
			i++;
		}
		return opt;
	}

	public void lanzarMenu() {
		int i =1;
		for(OpcionDeMenu a:opciones) {
			System.out.println("Presione ("+i+")"+a);
			i++;
		}
	}
	
	public static void nuevoMenu(Usuario user, String [] operations) {
		ArrayList<OpcionDeMenu> operationsMenu = new ArrayList<OpcionDeMenu>();
		for (String opt : operations) {
			operationsMenu.add(Datos.operations.get(opt));
		}
		MenuDeConsola menu = new MenuDeConsola(user, operationsMenu);
		user.setMenu(menu);
		Datos.menus.put(user.getUsername(), menu);
	}
	
}
