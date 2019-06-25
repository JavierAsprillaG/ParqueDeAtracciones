package gestorAplicacion;

import java.util.*;
public class prueba {
	public static void main (String[] args) { 
		ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
		Cliente Cliente10 = new Cliente (0, "nombre", "cedula", "tel");
		//System.out.print(Cliente10.toString()+" ");
		for(int i = 0; i < 5; ++i) {
			Cliente Cliente1 = new Cliente (i, "nombre", "cedula", "tel");	
			listaClientes.add(Cliente1);
		}
		
		Iterator<Cliente> nombreIterator = listaClientes.iterator();
		while(nombreIterator.hasNext()){
			Cliente elemento = nombreIterator.next();
			//System.out.print(elemento.toString()+" / ");
		}
		for (int i = 0 ; i < listaClientes.size() ; i++) {
            if (listaClientes[i] == Cliente.saldo) {
                return true;
        }
		System.out.print(listaClientes);
	}

}
