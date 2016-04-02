/**
 *   File Name: AppBasics.java<br>
 *
 *   Siebenthal, Madina<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 2, 2016
 *
 */

package com.sqa.ms.util.helpers;

import java.util.*;

/**
 * AppBasics //ADDD (description of class)
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
public class AppBasics {
	static Scanner scanner = new Scanner(System.in);

	public static String farewellUser(String userName, String appName) {

		System.out.println("Thank you " + userName + " for using the application " + appName);
		System.out.println("Have a good day!");
		return userName;
	}

	public static String welcomeUserAndGetUsersName(String appName) {
		String userName;
		System.out.println("Welcome to the " + appName + " application");
		userName = RequestInput.getString("can I get your name please");
		return userName;
	}
}
