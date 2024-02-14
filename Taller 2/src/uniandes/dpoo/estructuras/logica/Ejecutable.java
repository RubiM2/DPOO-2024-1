package uniandes.dpoo.estructuras.logica;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;


public class Ejecutable {
	public static void main(String[] args) {
		SandboxListas listas = new SandboxListas();
		List<Integer> ent = listas.getCopiaEnteros();
		listas.agregarEntero(1);
		listas.agregarEntero(2);
		listas.agregarEntero(3);
		listas.agregarEntero(4);
		Ilista(listas.getCopiaEnteros());
		Ilista(ent);
	}
		
	
	
	public static <V> void Ilista(Collection<V> a) {
		Iterator<V> iter = a.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next().toString()+ " ");	
		}
		System.out.println("");
	}
	
	public static void Iarr(int[] js) {	
		for(int i =0; i<js.length;i++) {
    		System.out.print(String.valueOf(js[i]) + " ");
    	}
		System.out.println("");
	}
}

