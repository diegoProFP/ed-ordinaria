package servicios;
import modelo.Flan;
import modelo.Helado;
import modelo.Postre;

/**
 * @author Jorge Sacristan
 * Esta clase ser� la interfaz de CajaRegistradora
 * y contiene los m�todos con sus correspondientes par�metros
 * a realizar de cada clase
 */
public interface InterfazCajaRegistradora {
	
	/**
	 * A�ade un postre de la clase Postre
	 * @param un nuevo postre de la clase Postre
	 * @see Postre se refiere a la clase Postre
	 */
	void anyadirPostre(Postre nuevo);
	
	/**
	 * Calcula el precio del helado
	 * @param unHelado nuevo helado de la clase Helado
	 * @return devuelve el precio del helado
	 */
	double calcularPrecioHelado(Helado unHelado);
	
	/**
	 * Calcula el precio del flan
	 * @param unFlan un nuevo flan de la clase Flan
	 * @return devuelve el precio del flan
	 */
	double calcularPrecioFlan(Flan unFlan);
	
	/**
	 * Aumenta el dinero total de la caja seg�n el precio del postre 
	 * @param precioPostre contiene el precio del postre elegido
	 */
	void incrementaCaja(double precioPostre);
	
}
