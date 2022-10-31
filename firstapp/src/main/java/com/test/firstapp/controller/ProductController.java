package com.test.firstapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.test.firstapp.model.Product;
import com.test.firstapp.service.ProductService;

@RestController
	@RequestMapping("/api/v1/products")
	public class ProductController {

	    @Autowired
	    private ProductService service;

	    @PostMapping
	    public Product addProduct(@RequestBody Product product) {
	        return service.saveProduct(product);
	    }

	    @GetMapping
	    public List<Product> findAllProducts() {
	        return service.getProducts();
	    }

	    @GetMapping("{id}")
	    public Product findProductById(@PathVariable int id) {
	        return service.getProductById(id);
	    }

	    @PutMapping
	    public Product updateProduct(@RequestBody Product product) {
	        return service.updateProduct(product);
	    }

	    @DeleteMapping("{id}")
	    public String deleteProduct(@PathVariable int id) {
	        return service.deleteProduct(id);
	    }
	
}