package gestorAplicacion.Infraestructuras;
import java.util.HashMap;
import java.util.ArrayList;

/**/
public class Tienda extends Infraestructura {
	private double ganancias;
	public HashMap	<Integer,Integer> inventario = new HashMap <Integer,Integer>();
	private ArrayList<String> empleados = new ArrayList<>();
	//Cada tienda tendra una tabla que guardara codigo de un producto y su cantidad
	public Tienda(String id, String nom, int gan) {
		super(id, nom);
	}
	
	public void agregarProducto(int k, int e) {
		inventario.put(k, e);
		/*Este método recibe dos int, k que es el codigo del producto que se desea agregar y e que es la cantidad que hay de dicho producto
		 *lo que hace es que agrega el producto de código k y su respectiva cantidad e*/
	}
	
	public int consultarInventario(int k) {
		return inventario.get(k);
		/*Con este método se busca el producto de código k y devuelve la cantidad que hay de tal objeto*/ 
	}
	
	public void eliminarProducto(int k) {
		inventario.remove(k);
		/*Con este método se elimina el producto de código k del inventario*/ 
	}
	
	public int modificarProducto(int k, int v, int precio) {
		/*El parámetro precio se refiere al valor que tiene cada producto vendido*/
		int w = inventario.remove(k);
		w -= v;
		if (w>0) {
			agregarProducto(k, w);
		}
		return v*precio;
		/*Se busca y elimina el elemento de código k y se venden v unidades de este luego se agrega con 
		 * la cantidad que queda, al final regresa la cantidad de dinero obtenido por la venta*/
	}
	public double getGanancias() {
		return ganancias;
	}
	public void setGanancias(double ganancias) {
		this.ganancias = ganancias;
	}
	public HashMap<Integer, Integer> getInventario() {
		return inventario;
		//regresa todos los items del inventario
	}
	public void asignarEmpleado(String id) {
		
	}
	
	
	
}
// elemento e con clave k = put (k, e)
// clave es el codigo del producto 
// elemento es la cantidad de dicho producto