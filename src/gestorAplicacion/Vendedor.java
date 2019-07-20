package gestorAplicacion;
import java.util.Iterator;

public class Vendedor extends Empleado{
	int ingresos=0;
	public Vendedor(String nom, String ced, String tel,String tip, int suel, String lug){
		super(nom, ced, tel, tip, suel, lug);		
	}
	
	public Empleado crearvendedor(){
		return super.crearEmpleado();
	}
	
	public int solicitarproducto(Tienda a, int b){
		return a.consultarInventario(b);
	}
	
	public void reportarbalance(Registro a, int ing){
		ing=ingresos;
		a.setingresos(ing);
	}
	
	public int Vender(Tienda a, int k, int v, int pre) {
		return ingresos += a.modificarProducto(k, v, pre);
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
