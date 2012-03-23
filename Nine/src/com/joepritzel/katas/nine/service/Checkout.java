package com.joepritzel.katas.nine.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.joepritzel.katas.nine.model.Item;

/**
 * Represents a single customer's trascation.
 * 
 * @author Joe Pritzel
 * 
 */
public class Checkout {

	private List<Item> items = new ArrayList<Item>();

	/**
	 * Scans a single item.
	 * 
	 * @param s
	 *            - The item SKU.
	 */
	public void scan(String s) {
		items.add(ItemCreationService.create(s));
	}

	/**
	 * @return The current total.
	 */
	public int getTotal() {
		Map<Item, Integer> amounts = new HashMap<Item, Integer>(0);
		
		// Calculates amount of each item
		for (Item i : items) {
			Integer prevAmount = amounts.put(i, 1);
			if(prevAmount != null) {
				amounts.put(i, prevAmount + 1);
			}
		}
		
		int total = 0;
		// Calculates total
		for (Entry<Item, Integer> e : amounts.entrySet()) {
			total += PriceCalculationService
					.calculate(e.getKey(), e.getValue());
		}
		return total;
	}

}
