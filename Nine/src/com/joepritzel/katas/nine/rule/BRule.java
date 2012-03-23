package com.joepritzel.katas.nine.rule;

import com.joepritzel.katas.nine.model.PricingRule;

/**
 * Rule for items with a SKU of B.
 * 
 * @author Joe Pritzel
 * 
 */
public class BRule implements PricingRule {

	@Override
	public int apply(int amount) {
		int total = amount / 2 * 45;
		total += amount % 2 * 30;
		return total;
	}

}
