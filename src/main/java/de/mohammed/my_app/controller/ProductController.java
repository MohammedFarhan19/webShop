package de.mohammed.my_app.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import de.mohammed.my_app.model.ProductResponse;
import de.mohammed.my_app.repository.ProductRepository;

@RestController
public class ProductController {
	
	ProductRepository productRepository = new ProductRepository();

	@GetMapping("/products")
	public List<ProductResponse> getAllProducts(@RequestParam(required = false) String tag) {
		return productRepository.findAll(tag);
	}
}
