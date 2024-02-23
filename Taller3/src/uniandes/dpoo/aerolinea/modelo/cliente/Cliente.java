package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.List;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente {
	
	private List<Tiquete> tiquetesUsados;
	private List<Tiquete> tiquetesSinUsar;
	
	public Cliente() {}
	public String getTipoCliente() {
		return null;
	}
	public String getIdentificador() {
		return null;
	}
	public void agregarTiquete(Tiquete tiquete) {
		//TODO
	}
	public int calcularValorTotalTiquetes() {
		//TODO
		return 0;
	}
	public void usarTiquetes(Vuelo vuelo) {
		//TODO
	}
	
	

}
