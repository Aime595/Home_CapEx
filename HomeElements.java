/**
 * This class defines common properties and behaviors 
 * of house elements
 * @author Aime Mbakop
 *
 */
public abstract class HomeElements {
	
	/**
	 * The current cost of an element
	 */
	private double price;
	
	/**
	 * The useful life of an element
	 */
	private int usefulLife;
	
	/**
	 * The year of purchase of the element
	 */
	private int purchasedYear;
	
	/**
	 * The chosen element
	 */
	private int element;
	
	/**
	 * Estimated inflation rate
	 * We assume a 30 years average
	 */
	public static final double INFL_RATE = 0.03;
	
	/**
	 * Estimated average rate of return
	 */
	public static final double INT_RATE = 0.005;
	
	/**
	 * Value for a TV object
	 */
	public static final int TV = 1;
	
	/**
	 * Value for a fridge object
	 */
	public static final int FRIDGE = 2;
	
	/**
	 * Value for a stove object
	 */
	public static final int STOVE = 3;
	
	/**
	 * Value for a microwave object
	 */
	public static final int MICROWAVE = 4;
	
	/**
	 * Value for a roof object
	 */
	public static final int ROOF = 5;
	
	/**
	 * Value for a gutter object
	 */
	public static final int GUTTER = 6;
	
	/**
	 * Value for a downspout object
	 */
	public static final int DOWNSPOUT = 7;
	
	/**
	 * Used by subclasses to construct objects with a purchased
	 * price and the type of element
	 */
	public HomeElements(int apurchasedYear, int aelement) {
		
		this.purchasedYear = apurchasedYear;
		this.element = aelement;
	}
	
	/**
	 * return the price of an element
	 */
	public double getPrice() {
		
		return this.price;
	}
	
	/**
	 * return the useful life of an element
	 */
	public int getUsefulLife() {
		
		return this.usefulLife;
	}
	
	/**
	 * return the purchased year of an element
	 */
	public int getPurchasedYearz() {
		
		return this.purchasedYear;
	}
	
	/**
	 * return the chosen element
	 */
	public int getElement() {
		
		return this.element;
	}
	
	/**
	 * set the price of an element
	 * @param the price of the element
	 */
	public void setPrice(double aprice) {
		
		this.price = aprice;
	}
	
	/**
	 * set the useful life of an element
	 * @param the useful of the element
	 */
	public void setUsefulLife(int life) {
		
		this.usefulLife = life;
	}
	
	/**
	 * Abstract method to be implemented by subclasses
	 * @return the forecasted cost of replacement
	 */
	public abstract double calcReplCost();
	
	/**
	 * Abstract method to be implemented by subclasses
	 * @return the forecasted first year of replacement
	 */
	public abstract int calcReplYear();
	
	/**
	 * Abstract method to be implemented by subclasses
	 * @return the remaining useful life of an element
	 */
	public abstract int calcRemainingLife();
}
