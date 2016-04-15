/**
 *   File Name: MyMathTests.java<br>
 *
 *   Siebenthal, Madina<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 13, 2016
 *
 */

package com.sqa.ms.util.helpers.math;

import java.util.*;

import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.*;
import org.junit.runners.Parameterized.*;

import com.sqa.ms.util.helpers.*;

/**
 * MyMathTests //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Siebenthal, Madina
 * @version 1.0.0
 * @since 1.0
 *
 */
@RunWith(Parameterized.class)
public class MultiplicationTests {
	/**
	 * @return
	 */
	// creating data set
	@Parameters
	public static Object[][] getData() {
		Object[][] data = { { new double[] { 2.0, 3.0, 4.0, 2.0 }, 48.0 }, { new double[] { 2.0, 1.0, 5.0 }, 10.0 },
				{ new double[] { 3.0, 1.5, }, 4.5 }, { new double[] { 0.0, 5.0, 15.0, 10.0 }, 0.0 },
				{ new double[] { 1.0, 2.0, 2.5, 3.0, 6.0 }, 90.0 }, { new double[] { 1.5, 5.5, 0.0 }, 0.0 } };

		return data;

	}

	private double expectedResult;

	private double num;
	private double[] numbers;
	private double power;

	/**
	 * @param num
	 * @param power
	 * @param expectedResult
	 */
	public MultiplicationTests(double[] numbers, double expectedResult) {
		// super();
		this.numbers = numbers;
		// this.power = power;
		this.expectedResult = expectedResult;
	}

	@Test
	public void testMultiplication() {
		double actualResult = MyMath.multNumbers(this.numbers);
		String numbersString = Arrays.toString(this.numbers);
		// error message to only highlight failed test cases
		String errorMessage = String.format(
				"Error. The result of multilying all numbers %s is actually  %.2f not expected ", numbersString,
				actualResult);

		// generic message for failed and passed tests
		String message = String.format("the result of multilying all members %s together is %.2f ", numbersString,
				actualResult);
		System.out.println(message);
		Assert.assertEquals(errorMessage, this.expectedResult, actualResult, 0);
	}

}
