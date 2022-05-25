package servicios;

import java.util.ArrayList;
import java.util.List;

import modelo.BolaHelado;
import modelo.Flan;
import modelo.Helado;
import modelo.Postre;

public class CajaRegistradora implements InterfazCajaRegistradora {

	private double precioBasePorBola = 0.75d;
	private double precioBasePorFlan = 1.00d;
	private double extraPorToppings = 0.50d;
	private double extraPorChocolate = 1.50d;
	private double extraPorCaramelo = 0.25d;
	private double extraPorFlanHuevo = 1d;
	private List<Postre> postres = new ArrayList<>();
	private double totalCaja = 0d;

	@Override
	public void anyadirPostre(Postre nuevo) {
		double precioPostre = 0d;

		if (!postreYaPresente(nuevo)) {

			if (nuevo instanceof Helado unHelado) {
				precioPostre = calcularPrecioHelado(unHelado);
			} else if (nuevo instanceof Flan unFlan) {
				precioPostre = calcularPrecioFlan(unFlan);
			}

			incrementaCaja(precioPostre);

			this.postres.add(nuevo);
		}

	}

	@Override
	public double calcularPrecioHelado(Helado unHelado) {
		double precioHelado = unHelado.getNumeroBolas() * precioBasePorBola;
		if (unHelado.isTieneToppings()) {
			precioHelado += extraPorToppings;
		}

		if (unHelado.getNumeroBolas() > 0 && encuentraBola("Chocolate", unHelado.getBolas())) {
			precioHelado += extraPorChocolate;
		}

		return precioHelado;

	}

	@Override
	public double calcularPrecioFlan(Flan unFlan) {
		double precioFlan = precioBasePorFlan;
		if (unFlan.isDeHuevo()) {
			precioFlan += extraPorFlanHuevo;
		}

		if (unFlan.isConCaramelo()) {
			precioFlan += extraPorCaramelo;
		}
		return precioFlan;
	}

	@Override
	public void incrementaCaja(double precioPostre) {
		this.totalCaja += precioPostre;
	}

	private boolean encuentraBola(String sabor, List<BolaHelado> bolas) {

		boolean saborEncontrado = false;

		for (BolaHelado bolaHelado : bolas) {
			if (bolaHelado != null && bolaHelado.getSabor().equalsIgnoreCase(sabor)) {
				saborEncontrado = true;
			}
		}
		return saborEncontrado;
	}

	private boolean postreYaPresente(Postre postre) {
		return this.postres.stream().anyMatch(p -> p.getNombre().equalsIgnoreCase(postre.getNombre()));
	}

	/**
	 * @return the postres
	 */
	public List<Postre> getPostres() {
		return postres;
	}

	/**
	 * @return the totalCaja
	 */
	public double getTotalCaja() {
		return totalCaja;
	}

}
