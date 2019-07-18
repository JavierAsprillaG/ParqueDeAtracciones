package gestorAplicacion;
import java.util.Iterator;
public class Vendedor extends Empleado{	
	public Vendedor(String nombre, String cedula, String telefono,String tipo, int sueldo,String lugar){
		super(nombre,cedula,telefono,tipo,sueldo,lugar);		
	}
	public void crearvendedor(){		
	}
	public void solicitarproducto(int a){ 
		Tienda.consultarInventario(a);
	}
	public void reportarbalance(){   
	}
	public void Vender(int k, int v) {
		Tienda.modificarProducto(k, v);
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
