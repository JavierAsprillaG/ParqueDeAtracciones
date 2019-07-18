package gestorAplicacion;
import java.util.HashMap;

public class Tienda extends Infraestructura {
	HashMap	<Integer,Integer> inventario = new HashMap <>();
	public Tienda(int id, String nom, int gan) {
		super(id, nom, gan);
		// TODO Auto-generated constructor stub
		}
	public void agregarProducto(int k, int e) {
		inventario.put(k, e);
		//agrega el producto de codigo k y su respectiva cantidad e
	}
	public int consultarInventario(int k) {
		return inventario.get(k);
		//se busca el producto de codigo k y devuelve la cantidad que hay de tal objeto
	}
	public void eliminarProducto(int k) {
		inventario.remove(k);
		//elimina el producto de codigo k del inventario
	}
	public void modificarProducto(int k, int v) {
		int w = inventario.remove(k);
		w -= v;
		if (w>0) {
			agregarProducto(k, w);
		}
		//se busca y elimina el elemento de codigo k y se venden v unidades del mismo luego se
		//agrega con la cantidad que queda
	}
}
// elemento e con clave k = put (k, e)
// clave es el codigo del producto 
// elemento es la cantidad de dicho producto