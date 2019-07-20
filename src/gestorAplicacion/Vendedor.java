package gestorAplicacion;
//import java.util.Iterator;


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
	
	public Cliente buscarCliente(Cliente a) {
		return a.listaClientes.get(cedula);
		//se recibe un objeto tipo cliente, busca si la cedula del cliente ingresado
		//se encuentra en la lista de clientes, en caso afirmativo devuelve el cliente
		//en caso de que no este esta cedula registrada entonces retorna null
	}
	/*public Cliente buscarcliente(){
		Iterator<Cliente> nombreIterator = listaClientes.iterator();
		while(nombreIterator.hasNext()){
			Cliente Cliente_A_Buscar = nombreIterator.next();
			if (Cliente_A_Buscar.getnombre().equals(nombre)  && Cliente_A_Buscar.getcedula().equals(cedula) ) {
				return(Cliente_A_Buscar);
			}			
		}
		return (null);		
	}*/
	
	
	
}
