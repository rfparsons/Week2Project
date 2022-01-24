/**
 * @author Bobby - rfparsons
 * CIS175 - Spring 2022
 * Jan 23, 2022
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Product;
import model.Product.invalidDiscountException;

/**
 * @author Bobby
 *
 */
public class ProductTester {
	Product gizmo;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		gizmo = new Product("Gizmo 3000", 19.99, 25);
	}

	@Test
	public void testName() {
		assertTrue("Gizmo 3000" == gizmo.getName());
	}

	@Test
	public void testDiscount() {
		assertEquals(14.99, gizmo.getPriceWithDiscount(), 0.01);
	}
	
	@Test(expected = Product.invalidDiscountException.class)
	public void testDiscountError() throws invalidDiscountException {
		gizmo.setDiscount(101);
	}
}
