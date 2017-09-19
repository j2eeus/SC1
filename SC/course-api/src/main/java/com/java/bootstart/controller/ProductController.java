package com.java.bootstart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.bootstart.POJO.Product;
import com.java.bootstart.POJO.ProductService;
@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/products")
	public List<Product> getAllProducts(){
		return  productService.getAllProducts();
	}
	
/*	@RequestMapping("/products/{id}")
	public Product getProduct(@PathVariable String id){
		return productService.getProduct(id);
	}*/
	
	@RequestMapping(method=RequestMethod.POST, value="/products")
	public void addProduct(@RequestBody Product product){
		productService.addProduct(product);
	}
	
	@RequestMapping("/getProduct")
	public List<Product> getProduct(){
		return productService.getAllProducts();
	}
}
