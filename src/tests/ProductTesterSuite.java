/**
 * @author Bobby - rfparsons
 * CIS175 - Spring 2022
 * Jan 23, 2022
 */
package tests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author Bobby
 *
 */
public class ProductTesterSuite {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(ProductTester.class);
		
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
			
		System.out.println(result.wasSuccessful());
		}

}
