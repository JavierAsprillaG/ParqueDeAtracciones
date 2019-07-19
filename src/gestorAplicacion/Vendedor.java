package gestorAplicacion;
import java.util.Iterator;

public class Vendedor extends Empleado{	
	public Vendedor(String nom, String ced, String tel,String tip, int suel, String lug){
		super(nom, ced, tel, tip, suel, lug);		
	}
	
	public Empleado crearvendedor(){
		return super.crearEmpleado();
	}
	
	public int solicitarproducto(Tienda a, int b){
		return a.consultarInventario(b);
	}
	
	public void reportarbalance(){   
	}
	
	public void Vender(Tienda a, int k, int v) {
		a.modificarProducto(k, v);
	}
	
	public Cliente buscarcliente(){
		Iterator<Cliente> nombreIterator = listaClientes.iterator();
		while(nombreIterator.hasNext()){
			Cliente Cliente_A_Buscar = nombreIterator.next();
			if (Cliente_A_Buscar.getnombre().equals(nombre)  && Cliente_A_Buscar.getcedula().equals(cedula) ) {
				return(Cliente_A_Buscar);
			}			
		}
		return (null);		
	}
}
