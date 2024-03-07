package uniandes.dpoo.aerolinea.modelo;

import java.util.Collection;
import java.util.Map;

import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Vuelo {
	
	private String fecha;
	private Ruta ruta;
	private Avion avion;
	private Map<String,Tiquete> tiquetes;
	
	public Vuelo(Ruta ruta, String fecha, Avion avion) {
		this.fecha = fecha; 
		this.avion = avion;
		this.ruta = ruta;
	}

	public String getFecha() {
		return fecha;
	}

	public Ruta getRuta() {
		return ruta;
	}

	public Avion getAvion() {
		return avion;
	}

	public Collection<Tiquete>	getTiquetes() {
		return tiquetes.values();
	}

	public int venderTiquetes(Cliente cliente, CalculadoraTarifas calculadora, int cantidad) {
		//TODO
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		boolean ig = obj.getClass() == this.getClass();
		if(ig) { 
			Vuelo comp = ((Vuelo) obj);
			ig = this.getRuta().getCodigoRuta() == comp.getRuta().getCodigoRuta();
		}
		return ig;
		
	}
	
	
	

}
