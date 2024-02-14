package uniandes.dpoo.estructuras.logica;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre mapas.
 *
 * Todos los métodos deben operar sobre el atributo mapaCadenas que se declara como un Map.
 * 
 * En este mapa, las llaves serán cadenas y los valores serán también cadenas. La relación entre los dos será que cada llave será igual a la cadena del valor, pero invertida.
 * 
 * El objetivo de usar el tipo Map es que sólo puedan usarse métodos de esa interfaz y no métodos adicionales provistos por la implementación concreta (HashMap).
 * 
 * No pueden agregarse nuevos atributos.
 */
public class SandboxMapas
{
    /**
     * Un mapa de cadenas para realizar varias de las siguientes operaciones.
     * 
     * Las llaves del mapa son cadenas, así como los valores.
     * 
     * Las llaves corresponden a invertir la cadena que aparece asociada a cada llave.
     */
    public Map<String, String> mapaCadenas;

    /**
     * Crea una nueva instancia de la clase con las dos listas inicializadas pero vacías
     */
    public SandboxMapas( )
    {
        mapaCadenas = new HashMap<String, String>( );
    }

    /**
     * Retorna una lista con las cadenas del mapa (los valores) ordenadas lexicográficamente
     * @return Una lista ordenada con las cadenas que conforman los valores del mapa
     */
    public List<String> getValoresComoLista( )
    {
    	List<String> listaCadenas = new ArrayList<String>();
    	for(Map.Entry<String,String> a: mapaCadenas.entrySet()) {
    		listaCadenas.add(a.getValue());
    		for(int i = 0;i<listaCadenas.size();i++) {
        		int index = i;
        		while(index>0 && listaCadenas.get(index).compareTo(listaCadenas.get(index-1))<=0) {
        			String ant = listaCadenas.get(index-1);
        			listaCadenas.set(index-1, listaCadenas.get(index));
        			listaCadenas.set(index, ant);
        			index--;
        		}
    	}
       
    }
    return listaCadenas;
    }
    

    /**
     * Retorna una lista con las llaves del mapa ordenadas lexicográficamente de mayor a menor
     * @return Una lista ordenada con las cadenas que conforman las llaves del mapa
     */
    public List<String> getLlavesComoListaInvertida( )
    {
    	List<String> listaCadenas = new ArrayList<String>();
    	for(Map.Entry<String,String> a: mapaCadenas.entrySet()) {
    		listaCadenas.add(a.getKey());
    		for(int i = 0;i<listaCadenas.size();i++) {
        		int index = i;
        		while(index>0 && listaCadenas.get(index).compareTo(listaCadenas.get(index-1))>=0) {
        			String ant = listaCadenas.get(index-1);
        			listaCadenas.set(index-1, listaCadenas.get(index));
        			listaCadenas.set(index, ant);
        			index--;
        		}
    	}
       
    }
    return listaCadenas;
    }

    /**
     * Retorna la cadena que sea lexicográficamente menor dentro de las llaves del mapa .
     * 
     * Si el mapa está vacío, debe retornar null.
     * @return
     */
    public String getPrimera( )
    {
    	String result = null;
    	List<String> llaves = getLlavesComoListaInvertida();
    	if(!mapaCadenas.isEmpty()) result = llaves.getLast();
        return result;
    }

    /**
     * Retorna la cadena que sea lexicográficamente mayor dentro de los valores del mapa
     * 
     * Si el conjunto está vacío, debe retornar null.
     * @return
     */
    public String getUltima( )
    {
    	String result = null;
    	List<String> llaves = getValoresComoLista();
    	if(!mapaCadenas.isEmpty()) result = llaves.getLast();
        return result;
    }

    /**
     * Retorna una colección con las llaves del mapa, convertidas a mayúsculas.
     * 
     * El orden de las llaves retornadas no importa.
     * @return Una lista de cadenas donde todas las cadenas están en mayúsculas
     */
    public Collection<String> getLlaves( )
    {
    	Collection<String> cadenas = new ArrayList<String>();
    	for(Map.Entry<String,String> a: mapaCadenas.entrySet()) {
    		cadenas.add(a.getKey().toUpperCase());
        }
     
    return cadenas;
    }

    /**
     * Retorna la cantidad de *valores* diferentes en el mapa
     * @return
     */
    public int getCantidadCadenasDiferentes( )
    {
        return mapaCadenas.size();
    }

    /**
     * Agrega un nuevo valor al mapa de cadenas: el valor será el recibido por parámetro, y la llave será la cadena invertida
     * 
     * Este método podría o no aumentar el tamaño del mapa, dependiendo de si ya existía la cadena en el mapa
     * 
     * @param cadena La cadena que se va a agregar al mapa
     */
    public void agregarCadena( String cadena )
    {
    	String cadenaR = "";
    	for(int i = 0; i<cadena.length();i++) {
    		cadenaR = cadena.charAt(i) + cadenaR;
    	}
    	mapaCadenas.put(cadenaR, cadena);
    }

    /**
     * Elimina una cadena del mapa, dada la llave
     * @param cadena La llave para identificar el valor que se debe eliminar
     */
    public void eliminarCadenaConLLave( String llave )
    {
    	mapaCadenas.remove(llave);

    }

    /**
     * Elimina una cadena del mapa, dado el valor
     * @param cadena El valor que se debe eliminar
     */
    public void eliminarCadenaConValor( String valor )
    {
    	String cadenaR = ""; 
    	for(int i = 0; i<valor.length();i++) {
    		cadenaR = valor.charAt(i) + cadenaR;
    	}
    	mapaCadenas.remove(cadenaR);
    }

    /**
     * Reinicia el mapa de cadenas con las representaciones como Strings de los objetos contenidos en la lista del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Una lista de objetos
     */
    public void reiniciarMapaCadenas( List<Object> objetos )
    {
    	mapaCadenas.clear();
    	for(Object a: objetos) {
    		agregarCadena(a.toString());
    	}

    }

    /**
     * Modifica el mapa de cadenas reemplazando las llaves para que ahora todas estén en mayúsculas pero sigan conservando las mismas cadenas asociadas.
     */
    public void volverMayusculas( )
    {
    	Map<String,String> copia = new HashMap<String,String>(mapaCadenas);
    	String valor = "";
    	for(Map.Entry<String,String> a: copia.entrySet()) {
    		valor = a.getValue();
    		mapaCadenas.remove(a.getKey());
    		mapaCadenas.put(a.getKey().toUpperCase(), valor);
        }
    }

    /**
     * Verifica si todos los elementos en el arreglo de cadenas del parámetro hacen parte del mapa de cadenas (de los valores)
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si todos los elementos del arreglo están dentro de los valores del mapa
     */
    public boolean compararValores( String[] otroArreglo )
    {
    	int j = 0;
    	boolean cent = true;
    	while(cent && j<otroArreglo.length) 
    	{
    		String valor = otroArreglo[j];
    		String cadenaR = "";
        	for(int i = 0; i<valor.length();i++) {
        		cadenaR = valor.charAt(i) + cadenaR;
        	}
        	if(!mapaCadenas.containsKey(cadenaR)) cent = false;
    		j++;
    	}
    	
        return cent;
    }

}
