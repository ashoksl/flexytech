package com.flexy.products.services;

import java.util.List;
import java.util.Map;

import com.flexy.products.model.Product;

public interface IProductServices {
	
	public Map<String, List<Product>> getAllProducts();
	
}
