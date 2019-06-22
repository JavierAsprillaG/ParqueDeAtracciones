package gestorAplicacion;

public abstract class Persona {
	private int ID;
	private String nombre;
	private String cedula;
	private String telefono;
	Persona(int id, String nom, String c, String tel){
		ID = id;
		nombre = nom;
		cedula = c;
		telefono = tel;
		}
	}
