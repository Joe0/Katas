package com.joepritzel.katas.nine.rule;

import com.joepritzel.katas.nine.model.PricingRule;

/**
 * Rule for items with a SKU of C.
 * 
 * @author Joe Pritzel
 * 
 */
public class CRule implements PricingRule {

	@Override
	public int apply(int amount) {
		return amount * 20;
	}

}
