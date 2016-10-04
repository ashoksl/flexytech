package com.flexy.products.repository;

import java.util.List;
import java.util.Map;

import com.flexy.products.model.Product;

public interface IProductDao {
	
	public Map<String, List<Product>> listProducts();
	
}
