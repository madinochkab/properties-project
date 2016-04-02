/**
 *   File Name: RequestInput.java<br>
 *
 *   Siebenthal, Madina<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 30, 2016
 *
 */

package com.sqa.ms.util.helpers;

import java.util.*;

/**
 * RequestInput //ADDD (description of class)
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
public class RequestInput {
	private static Scanner scanner;

	// Get a char value from the user
	/**
	 * @param question
	 * @return
	 */
	public static char getChar(String question) {
		String input;
		scanner = new Scanner(System.in);
		System.out.println("enter a character type char");
		input = scanner.nextLine();
		char resultValue = input.charAt(0);
		System.out.println("your character is " + resultValue);
		return resultValue;

	}

	/**
	 * @param question
	 * @param c
	 * @return
	 */
	// Get a char value from the user, must be an acceptable value
	public static char getChar(String question, char... c) {
		return 0;

	}

	/**
	 * @param question
	 * @return
	 */
	public static double getDouble(String question) {
		String input = null;
		scanner = new Scanner(System.in);
		System.out.println("type in your double type number");
		input = scanner.nextLine();
		Double resultValue = Double.parseDouble(input);
		System.out.println("your double number is " + resultValue);
		return resultValue;

	}

	// Get a int from the user, must be in acceptable range value
	/**
	 * @param question
	 * @param acceptableNumber
	 * @return
	 */
	public static int getInt(String question, int... acceptableNumber) {
		String input = null;
		int resultValue;
		boolean validInt = false;
		scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.print(question);
				input = scanner.nextLine();
				resultValue = Integer.parseInt(input);
				for (int i = 0; i < acceptableNumber.length; i++) {
					if (resultValue == acceptableNumber[i]) {
						validInt = true;
					}

				}
				if (!validInt) {
					throw new InvalidAcceptableNumberException();
				}
				return resultValue;
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("you have not provided valid int type(" + input);
				continue;
			} catch (InvalidAcceptableNumberException e) {
				System.out.println("you have not provided valid numbr");
			}
		}

	}

	/**

	 */

	public static String getString(String question) {
		// Local variable to hold temporary number
		String input;
		scanner = new Scanner(System.in);
		// Ask the user a question to get relative input
		System.out.print(question);
		// Set the number based on what the user enters on their
		// keyboard
		input = scanner.nextLine();
		// Return input user has entered
		return input;
	}

	// Get a String from the user, must be an acceptable value
	/**
	 * @param question
	 * @param acceptableWords
	 * @return
	 */
	public static String getString(String question, String... acceptableWords) {
		String input = null;
		String resultValue;
		boolean validWord = false;
		scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.print(question);
				input = scanner.nextLine();
				resultValue = input;
				for (int i = 0; i < acceptableWords.length; i++) {
					if (resultValue.trim().replace(" ", "").equalsIgnoreCase(acceptableWords[i])) {
						validWord = true;
					}

				}
				if (!validWord) {
					throw new InvalidAcceptableWordException();
				}
				return resultValue;
			} catch (InvalidAcceptableWordException e) {
				System.out.println("you have not provided valid word " + input);
			}
		}

	}

	// Create your own helper method that you may find useful

}
