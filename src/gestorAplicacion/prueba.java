package gestorAplicacion;

import java.util.*;
public class prueba {
	public static void main (String[] args) { 
		Scanner entrada=new Scanner(System.in);
		String a=entrada.nextLine();
		String b=entrada.nextLine();
		ArrayList<Cliente> listaClientesprueba = new ArrayList<Cliente>();
		Cliente Cliente10 = new Cliente ("nombre", "cedula", "tel");
		//System.out.print(Cliente10.toString()+" ");
		for(int i = 0; i < 5; ++i) {
			Cliente Cliente1 = new Cliente ("nombre", "cedula", "tel");	
			listaClientesprueba.add(Cliente1);
			if (i==4) {
				Cliente Cliente2 = new Cliente ("carlos", "12", "5");	
				listaClientesprueba.add(Cliente2);
			}
			
		}
		
		//Iterator<Cliente> nombreIterator = listaClientesprueba.iterator();
		//while(nombreIterator.hasNext()){
			//Cliente elemento = nombreIterator.next();
			//System.out.print(elemento.toString()+" / ");
		//}
		Iterator<Cliente> nombreIterator2 = listaClientesprueba.iterator();
		while(nombreIterator2.hasNext()){
			Cliente Cliente_A_Buscar = nombreIterator2.next();
			if (Cliente_A_Buscar.getnombre().equals(a)  && Cliente_A_Buscar.getcedula().equals(b) ) {
				System.out.print("si, ");
			}
			else {
				System.out.print("no, ");
			}
		}
		//boolean N=Cliente.verificar_registro(a,b);
		//System.out.print(N);
		System.out.print(listaClientesprueba);
	}

}
