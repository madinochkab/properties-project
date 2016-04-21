/**
 *   File Name: AppBasicsTests.java<br>
 *
 *   Siebenthal, Madina<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 2, 2016
 *
 */
//
package com.sqa.ms.util.helpers;

//looks like double
import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * AppBasicsTests //ADDD (description of class)
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
public class AppBasicsTests {
	private static Scanner scanner = new Scanner(System.in);
	static String appName = "MS test";
	static String userName;

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

	/**
	 * Test method for
	 * {@link com.sqa.ms.util.helpers.AppBasics#farewellUser(java.lang.String, java.lang.String)}
	 * .
	 */
	@Test
	public void testFarewellUser() {
		AppBasics.farewellUser(userName, appName);
	}

	/**
	 * Test method for
	 * {@link com.sqa.ms.util.helpers.AppBasics#welcomeUserAndGetUsersName(java.lang.String)}
	 * .
	 */
	@Test
	public void testWelcomeUser() {

		userName = AppBasics.welcomeUserAndGetUsersName(appName);
	}

}
