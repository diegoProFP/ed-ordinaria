package servicios;

import modelo.Flan;
import modelo.Helado;
import modelo.Postre;

public interface InterfazCajaRegistradora {

	void anyadirPostre(Postre nuevo);
	
	double calcularPrecioHelado(Helado unHelado);
	
	double calcularPrecioFlan(Flan unFlan);
	
	void incrementaCaja(double precioPostre);
	
}
