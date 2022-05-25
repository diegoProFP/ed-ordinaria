package servicios;

import modelo.BolaHelado;
import modelo.Helado;

public class PruebaCajaRegistradora {

	public static void main(String[] args) {

		CajaRegistradora caja = new CajaRegistradora();
		
		Helado miHelado = new Helado();
		miHelado.setNombre("Super heladaco de Fresa");

		miHelado.anyadeBola(new BolaHelado("Fresa"));
		miHelado.anyadeBola(new BolaHelado("Chocolate"));
		miHelado.anyadeBola(new BolaHelado("Pitufo"));
		
		miHelado.setTieneToppings(true);
		
		System.out.println("El precio del Helado es: " + caja.calcularPrecioHelado(miHelado));
		System.out.println("El helado es: " + miHelado);
		
	}

}
