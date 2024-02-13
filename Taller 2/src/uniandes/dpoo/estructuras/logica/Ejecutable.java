package uniandes.dpoo.estructuras.logica;

import java.util.Collection;
import java.util.Iterator;


public class Ejecutable {
	public static void main(String[] args) {
		SandboxConjuntos conjunto = new SandboxConjuntos();
		conjunto.agregarCadena("All");
		conjunto.agregarCadena("America");
		conjunto.agregarCadena("Tomas");
		
		String[] otroArreglo = {"All","America"};
		System.out.println(conjunto.compararElementos(otroArreglo));
		}
		
	
	
	public static <V,T extends Collection<V>> void imprimirPantalla(Collection<V> a) {
		Iterator<V> iter = a.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next().toString()+ " ");	
		}
		System.out.println("");
		
		
		
		
		
	}
}

