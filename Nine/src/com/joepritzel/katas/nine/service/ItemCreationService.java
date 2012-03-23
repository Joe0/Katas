package com.joepritzel.katas.nine.service;

import java.util.HashMap;
import java.util.Map;

import com.joepritzel.katas.nine.model.Item;

/**
 * This service creates items.
 * 
 * @author Joe Pritzel
 * 
 */
public class ItemCreationService {

	/**
	 * A mapping of SKUs to item objects.
	 */
	private final static Map<String, Item> items = new HashMap<String, Item>();

	/**
	 * Creates an Item from the SKU.
	 * 
	 * @param s
	 *            - The SKU.
	 * @return An item based on the given SKU.
	 */
	public static Item create(String s) {
		Item i = items.get(s);
		if (i == null) {
			i = new Item(s);
			items.put(s, i);
		}
		return i;
	}

}
