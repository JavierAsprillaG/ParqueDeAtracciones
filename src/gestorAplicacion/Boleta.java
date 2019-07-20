package gestorAplicacion;
public class Boleta {
    private String categoria;
    private int ID;
    private int valor;
    private Cliente usuario;
    public Boleta(String cat,int id,int val) { 
    	this.categoria = cat;
    	this.ID = id;
    	this.valor = val;
    	this.usuario = null;
    }
    public Boleta crearboleta(String cat,int id,int val) {
    	return new Boleta(cat, id, val);
}
    public boolean pagodeboleta(Cliente a, Boleta b) {
    	if(a.getSaldo() >= b.valor) {
    		a.setsaldo(a.getSaldo()-b.valor);
    		b.setUsuario(a);
    		return true;
    	}
    	else {
    		return false;
    	}
    	/*primero se verifica si el saldo es suficiente para efectuar la compra en caso de ser suficiente se retira el valor de la 
    	boleta del saldo del cliente, despues se le asigna el cliente a la boleta y se retorna true indicando que la transaccion fue
    	exitosa, en caso de no ser suficiente se retorna false indicando que no se pudo comprar la boleta*/ 
    }
    
    public void setUsuario(Cliente usuario) {
		this.usuario = usuario;
	}
    
    public String getCategoria() {
		return categoria;
	}
    
    public int getID() {
		return ID;
	}
    
    public Cliente getUsuario() {
		return usuario;
	}
    
    public int getValor() {
		return valor;
	}
    
    public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
    
    public void setID(int iD) {
		ID = iD;
	}
    
    public void setValor(int valor) {
		this.valor = valor;
	}
    
}
