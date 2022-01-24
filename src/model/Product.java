/**
 * @author Bobby - rfparsons
 * CIS175 - Spring 2022
 * Jan 23, 2022
 */
package model;

/**
 * @author Bobby
 *
 */
public class Product {
	private String name;
	private double price;
	private double discount;
	
	/**
	 * 
	 */
	public Product() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param price
	 * @param discount
	 */
	public Product(String name, double price, double discount) {
		super();
		this.name = name;
		this.price = price;
		this.discount = discount;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the discount
	 */
	public double getDiscount() {
		return discount;
	}

	/**
	 * @param discount the discount to set (0-100)
	 * @throws invalidDiscountException 
	 */
	public void setDiscount(double discount) throws invalidDiscountException {
		if (discount <= 100 && discount >= 0) {
			this.discount = discount;
		}
		else {
			throw new invalidDiscountException();
		}
	}
	
	public double getPriceWithDiscount() {
		return price - (price * (discount / 100));
	}
	
	public class invalidDiscountException extends Exception {
		public invalidDiscountException() {}
	}
}
