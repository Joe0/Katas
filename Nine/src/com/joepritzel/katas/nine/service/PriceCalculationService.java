package com.joepritzel.katas.nine.service;

import java.util.HashMap;
import java.util.Map;

import com.joepritzel.katas.nine.model.Item;
import com.joepritzel.katas.nine.model.PricingRule;
import com.joepritzel.katas.nine.rule.*;

/**
 * Calculates the price of items.
 * 
 * @author Joe Pritzel
 * 
 */
public class PriceCalculationService {

	/**
	 * Maps Items to Pricing rules.
	 */
	private static final Map<Item, PricingRule> rules = new HashMap<Item, PricingRule>();

	static {
		bindRule(ItemCreationService.create("A"), new ARule());
		bindRule(ItemCreationService.create("B"), new BRule());
		bindRule(ItemCreationService.create("C"), new CRule());
		bindRule(ItemCreationService.create("D"), new DRule());
	}

	/**
	 * Binds a rule to the given item.
	 * 
	 * @param item
	 *            - The item.
	 * @param rule
	 *            - The rule.
	 */
	public static void bindRule(Item item, PricingRule rule) {
		rules.put(item, rule);
	}

	/**
	 * Calculates the price of a given number of Items.
	 * 
	 * @param item
	 *            - The item.
	 * @param amount
	 *            - The amount.
	 * @return The total.
	 */
	public static int calculate(Item item, int amount) {
		PricingRule rule = rules.get(item);
		if (rule == null) {
			return 0;
		}

		return rule.apply(amount);
	}

}
