/**
 *   File Name: warmUpJunit.java<br>
 *
 *   Siebenthal, Madina<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 31, 2016
 *
 */

package com.sqa.ms.util.helpers;

import static org.junit.Assert.*;
import java.util.Scanner;

import org.junit.*;

/**
 * warmUpJunit //ADDD (description of class)
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
public class warmUpJunit {
	Scanner scanner = new Scanner(System.in);

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	// Get a double value from the user
	public static double getDouble(String question) {

	}

	// Get a char value from the user
	public static char getChar(String question) {

	}

	// Get a char value from the user, must be an acceptable value
	public static char getChar(String question, char... c) {

	}

	// Get a String from the user, must be an acceptable value
	public static String getString(String question, String... s) {

	}

	// Get a int from the user, must be in acceptable range value
	public static int getInt(String question, int... acceptableNumbers) {

	}

	// Get a int from the user, must be in acceptable range value
	public static int getIntWithRange (String question, intMin, intMax){

	}

	// Get a int from the user, must be in acceptable range value
	public static int getStringWithoutWorkds(String question, String... InvalidWords) {

	}

	// Create your own helper method that you may find useful

}
