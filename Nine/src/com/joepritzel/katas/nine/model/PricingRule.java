package com.joepritzel.katas.nine.model;

/**
 * Represents a rule to determine the price for Items.
 * 
 * @author Joe Pritzel
 * 
 */
public interface PricingRule {

	/**
	 * Gets the total price for the given number of items.
	 * 
	 * @param amount
	 *            - The number of items.
	 * @return The total.
	 */
	public int apply(int amount);

}
