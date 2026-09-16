package de.mohammed.my_app.model;

import java.util.List;

public class ProductResponse {
	
	private String id;
	private String name;
	private String description;
	private Integer priceIncent;
	private List<String> tag;
	
	public ProductResponse(
			  String id
			, String name
			, String description
			, Integer priceIncent
			, List<String> tag) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.priceIncent = priceIncent;
		this.tag = tag;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public Integer getPriceIncent() {
		return priceIncent;
	}

	public List<String> getTags() {
		return tag;
	}
	
}
