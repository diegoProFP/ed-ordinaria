package modelo;

public class Helado extends Postre{

	private boolean tieneToppings;
	private BolaHelado[] bolas = new BolaHelado[3];
	
	/**
	 * @return the tieneToppings
	 */
	public boolean isTieneToppings() {
		return tieneToppings;
	}
	/**
	 * @param tieneToppings the tieneToppings to set
	 */
	public void setTieneToppings(boolean tieneToppings) {
		this.tieneToppings = tieneToppings;
	}
	
	public int getNumeroBolas() {
		return this.bolas.length;
	}
	/**
	 * @return the bolas
	 */
	public BolaHelado[] getBolas() {
		return bolas;
	}
	/**
	 * @param bolas the bolas to set
	 */
	public void setBolas(BolaHelado[] bolas) {
		this.bolas = bolas;
	}
	
	
}


