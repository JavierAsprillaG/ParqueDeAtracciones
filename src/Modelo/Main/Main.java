package Modelo.Main;

import java.util.ArrayList;
import java.util.Scanner;

import Modelo.*;
import Modelo.ErroresAplicacion.Exception_Informacion_Usuario;
import Modelo.Personas.Administrador;
import Modelo.Personas.Usuario;
import Modelo.baseDatos.Datos;
import Vista.VentanaInicio;

public class Main {
	public static Usuario usuario = new Usuario();
	public static VentanaInicio v;
	public static void main(String[] args) {
		int n=9;
		v= new VentanaInicio();
		v.arranca();
		Datos.admins.put("jairillo", new Administrador("Jairo","10366","2312973","jairillo","jairo003@gmail.com","4321",1500000,"Oficina 3"));
		Datos.admins.put("merche", new Administrador("Mercedes","85456","231587","merche","mercedesaris@gmail.com","777",1500000,"Oficina 3"));
	}
	
	public static void iniciar() {
		Datos.cargarDatos();
	}

}
