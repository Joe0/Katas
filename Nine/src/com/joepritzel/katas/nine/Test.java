package com.joepritzel.katas.nine;

import com.joepritzel.katas.nine.service.Checkout;

/**
 * This is the test class.
 * 
 * @author Joe Pritzel
 * 
 */
public class Test {

	/**
	 * @param args
	 *            - Unused
	 */
	public static void main(String[] args) {

		assert_equal(0, price(""));
		assert_equal(50, price("A"));
		assert_equal(80, price("AB"));
		assert_equal(115, price("CDBA"));

		assert_equal(100, price("AA"));
		assert_equal(130, price("AAA"));
		assert_equal(180, price("AAAA"));
		assert_equal(230, price("AAAAA"));
		assert_equal(260, price("AAAAAA"));

		assert_equal(160, price("AAAB"));
		assert_equal(175, price("AAABB"));
		assert_equal(190, price("AAABBD"));
		assert_equal(190, price("DABABA"));
		
		System.out.println("Test completed");
	}

	/**
	 * Creates a new Checkout, and scans each character.
	 * 
	 * @param a
	 *            - The string to check.
	 * @return The total.
	 */
	private static int price(String a) {
		Checkout co = new Checkout();
		for (String s : a.split("")) {
			co.scan(s);
		}
		return co.getTotal();
	}

	/**
	 * Asserts that the parameters are equal.
	 * 
	 * @param a
	 *            - The expected value.
	 * @param price
	 *            - The actual value.
	 */
	private static void assert_equal(int a, int price) {
		if (a != price) {
			System.out.printf("%d != %d%n", a, price);
		}
	}

}
