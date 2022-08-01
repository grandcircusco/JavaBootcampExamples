package co.grandcircus.example.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.grandcircus.example.model.Product;

@Controller
public class ProductController {
	
	private static final List<Product> PRODUCTS = Collections.unmodifiableList(Arrays.asList(
			new Product("Airplane", 7, "toy"),
			new Product("Blocks", 25, "toy"),
			new Product("Crayons", 5, "art"),
			new Product("Easel", 55, "art"),
			new Product("Kitchen Set", 120, "toy"),
			new Product("Paint", 12, "art")
	));

	@RequestMapping("/products")
	public String showProducts(@RequestParam(required=false) String cat, Model model) {
		List<Product> myProducts;
		if (cat == null || cat.isBlank()) {
			myProducts = PRODUCTS;
		} else {
			myProducts = PRODUCTS.stream().filter(product -> product.getCategory().equals(cat)).toList();
		}
		model.addAttribute("products", myProducts);
		return "product-list";
	}
	
	@RequestMapping("/products-search")
	public String showProductsSearchForm() {
		return "product-search-form";
	}
}
