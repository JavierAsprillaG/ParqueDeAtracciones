package uiMain.Main;

import java.util.ArrayList;
import java.util.Scanner;

import ErroresAplicacion.Exception_Informacion_Usuario;
import Vista.VentanaInicio;
import baseDatos.Datos;
import gestorAplicacion.*;
import gestorAplicacion.Personas.Administrador;
import gestorAplicacion.Personas.Usuario;

public class Main {
	public static Usuario usuario = new Usuario();
	public static VentanaInicio v;
	public static void main(String[] args) {
		Datos.admins.put("jairillo", new Administrador("Jairo","10366","2312973","jairillo","jairo003@gmail.com","4321",1500000,"Oficina 3"));
//		Main.iniciar();
//		while(true) {
//			MenuPpal m = new MenuPpal();
//			System.out.print("Ingrese el numero de la funcionalidad a remover: ");
//			m.lanzarMenu();
//			Scanner sc = new Scanner(System.in);
//			int b = sc.nextInt();
//			m.getOpcion(b).ejecutar();
//			System.out.print("Ingrese el numero de la funcionalidad a remover: ");
//			try {
//				if(Main.usuario != null){
//					Main.usuario.getMenu().lanzarMenu();
//				}else {
//					Main.usuInvitado.lanzarMenu();
//				}
//			
//			}
//			catch(Exception e){
//				//Si ocurre una excepcion al ejecutar el programa, lo terminara.
//				
//				//Al terminar el programa ejecutara el guardado
//				Datos.guardarDatos();
//				
//				System.out.println("Adios");
//				System.exit(0);
//			}
//		}
		int n=9;
		v= new VentanaInicio();
		v.arranca();

	}
	
	public static void iniciar() {
		Datos.cargarDatos();
	}

}
