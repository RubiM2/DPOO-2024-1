package uniandes.dpoo.estructuras.logica;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class Ejecutable {
	public static void main(String[] args) {
		SandboxMapas mapa = new SandboxMapas();
		
		mapa.agregarCadena("e");
		mapa.agregarCadena("c");
		mapa.agregarCadena("b");
		mapa.agregarCadena("d");
		mapa.agregarCadena("f");
		mapa.agregarCadena("a");
		mapa.agregarCadena("e");
		Imap(mapa.mapaCadenas);
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
	public static <V,T> void Imap(Map<V,T> mapa) {
		for(Map.Entry<V, T> pareja: mapa.entrySet()) {
			System.out.println(pareja.getKey().toString() + ":" + pareja.getValue() + " ");
			
		}
	}
}



