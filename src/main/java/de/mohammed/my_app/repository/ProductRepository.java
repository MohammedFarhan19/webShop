package de.mohammed.my_app.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import de.mohammed.my_app.model.ProductResponse;

public class ProductRepository {
	
	List<ProductResponse> products = Arrays.asList(
			new ProductResponse("1", "AMD Ryzen 9 5950x", "nice processor", 79900,
					Arrays.asList("AMD", "Processor")),
			
			new ProductResponse("2", "Intel Core i9", "another Processor 2", 37900,
					Arrays.asList("Intel", "Processor")),
			
			new ProductResponse("3", "NVIDIA GeForce GTX", "Grafik karte", 74900,
					Arrays.asList("NVIDIA2_changed", "Graphik")));

	/*
	 * Methode zum Ausgeben all Products
	 */
	public List<ProductResponse> findAll(String tag) {
		if (tag == null) {
			return products;
		} else {
			tag = tag.toLowerCase();
			List<ProductResponse> filtered = new ArrayList<>();
			for (ProductResponse p : products) {

				if (lowercaseTags(p).contains(tag)) {
					filtered.add(p);
				}
			}
			return filtered;
		}
	}

	/*
	 * Methode um alles to lowercase 
	 */
	private List<String> lowercaseTags(ProductResponse p) {
		List<String> lowercaseTags = new ArrayList<>();
		for (String t : p.getTags()) {
			lowercaseTags.add(t.toLowerCase());
		}
		return lowercaseTags;
	}
}
