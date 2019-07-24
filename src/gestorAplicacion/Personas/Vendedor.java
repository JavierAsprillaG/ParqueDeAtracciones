package gestorAplicacion.Personas;
import java.util.HashMap;

import baseDatos.Datos;
import gestorAplicacion.Registro;
import gestorAplicacion.Infraestructuras.Tienda;
import uiMain.menuconsola.MenuDeConsola;
public class Vendedor extends Empleado{
	public Vendedor() {
		super();
	}
	
	public static HashMap	<String,Vendedor> RegistroVendedores = new HashMap <>();
	int ingresos=0;
	public Vendedor(String nom, String ced, String tel,
    		String username, String email, String contrasena, int sue,String lug) {
		this(nom,ced,tel,"Vendedor",username,email,contrasena,sue,lug);	
	}
	public Vendedor(String nom, String ced, String tel,String tip,
    		String username, String email, String contrasena, int sue,String lug) {
		super(nom,ced,tel,tip,username, email, contrasena, sue, lug);
	}
	
	public int solicitarproducto(Tienda a, int b){
		return a.consultarInventario(b);
	}
	
	public static String nuevoVendedor(String nombre, String cedula, String telefono,String tip,
    		String username, String email, String contrasena, int sue,String lug) {
		Vendedor vend = new Vendedor();
		vend.setNombre(nombre);
		vend.setUsername(username);
		vend.setEmail(email);
		vend.setContrasena(contrasena);
		vend.setLugar(lug);
		vend.setTipo(tip);
		vend.setCedula(cedula);
		vend.setTelefono(telefono);
		
		String [] operations = {"1","2","3","4","5"};
		MenuDeConsola.nuevoMenu(vend, operations);
		if(true){
			Datos.usuarios.put(username,vend);
			return "Ha sido creado";
		}else{
			return "No ha sido creado...";
		}
	}
	
	public void reportarbalance(Registro a, int ing){
		ing=ingresos;
		a.setIngresos(ing);
	}
	
	public int Vender(Tienda a, int k, int v, int pre) {
		return ingresos += a.modificarProducto(k, v, pre);
	}
	
	public Cliente buscarCliente(Cliente a) {
		return a.listaClientes.get(cedula);
		//se recibe un objeto tipo cliente, busca si la cedula del cliente ingresado
		//se encuentra en la lista de clientes, en caso afirmativo devuelve el cliente
		//en caso de que no este esta cedula registrada entonces retorna null
	}			
}
