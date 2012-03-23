package com.joepritzel.katas.nine.rule;

import com.joepritzel.katas.nine.model.PricingRule;

/**
 * Rule for items with a SKU of A.
 * 
 * @author Joe Pritzel
 * 
 */
public class ARule implements PricingRule {

	@Override
	public int apply(int amount) {
		int total = amount / 3 * 130;
		total += amount % 3 * 50;
		return total;
	}

}
