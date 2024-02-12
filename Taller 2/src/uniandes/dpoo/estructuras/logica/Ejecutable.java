package uniandes.dpoo.estructuras.logica;

public class Ejecutable {
	public static void main(String[] args) {
		SandboxConjuntos conjuntos = new SandboxConjuntos();SandboxListas listas = new SandboxListas();SandboxMapas mapas = new SandboxMapas();
		SandboxArreglos arreglo = new SandboxArreglos();
		int[] valores = {5,4,3,2,2};
		Object[] objetos = {conjuntos, listas, mapas };
		arreglo.agregarCadena("DoS");
		arreglo.agregarCadena("dos");
		arreglo.agregarCadena("doz");
		arreglo.agregarCadena("dos");
		arreglo.agregarCadena("Mos");
		arreglo.agregarCadena("Tos");
		
		arreglo.agregarEntero(1);
		arreglo.agregarEntero(2);
		arreglo.agregarEntero(3);
		arreglo.agregarEntero(4);
		arreglo.agregarEntero(5);
		
		arreglo.generarEnteros(10, 20, 90);
		imprimirPantalla(arreglo);
		
		}
		
	
	
	public static void imprimirPantalla( SandboxArreglos arreglo) {
		if(true) {
			for(int i=0; i<arreglo.getCopiaEnteros().length;i++) {
				System.out.print(String.valueOf(arreglo.getCopiaEnteros()[i]) + " ");
			}
		System.out.println("");
		}
		if(false) {
			for(int i=0; i<arreglo.getCopiaCadenas().length;i++) {
				System.out.print(String.valueOf(arreglo.getCopiaCadenas()[i]) + " ");
			}
		System.out.println("");
		}
	}
	
	public static void imprimirEnteros(int[] arreglo) {
		if(true) {
			for(int i=0; i<arreglo.length;i++) {
				System.out.print(String.valueOf(arreglo[i]) + " ");
			}
		System.out.println("");
	}
}
	 public static int generarEnteros( int cantidad, int minimo, int maximo )
	    {
	    	int random = minimo + (int)(Math.random()*(maximo -minimo));
	    	
	    	return random;
	    }
}

