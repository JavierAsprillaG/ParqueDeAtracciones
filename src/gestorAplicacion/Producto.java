package gestorAplicacion;

import baseDatos.Datos;
import gestorAplicacion.Infraestructuras.Tienda;

public class Producto {
	private int codigo;
	private String nombre;
	private double precio;
	private Tienda tienda;
	//Clase Datos tendra el hash de la lista de productos
	public Producto(int cod, String nombre, double valor) {
		setCodigo(cod);
		this.setNombre(nombre);
		setPrecio(valor);
		Datos.listaProductos.put(cod, this);
	}
	public Producto(int cod, String nombre, double valor, String idTienda) {
		setCodigo(cod);
		this.setNombre(nombre);
		setPrecio(valor);
		Datos.listaProductos.put(cod, this);
		tienda = (Tienda)Datos.tiendas.get(idTienda);
	}
	public void eliminarProducto(int codig) {//Busca por el codigo en el hash para eliminar el producto de la lista
		Datos.listaProductos.remove(codig);
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Tienda getTienda() {
		return tienda;
	}
	public void setTienda(Tienda tienda) {
		this.tienda = tienda;
	}
	
}
