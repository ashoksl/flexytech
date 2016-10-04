package com.flexy.products.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.flexy.products.model.Product;

public class ProductDaoImpl implements IProductDao {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductDaoImpl.class);
	
	@Override
	public Map<String, List<Product>> listProducts() {
		List<Product> products = new ArrayList<>();
		LOGGER.info("Generating product details in listProducts");
		products.add(new Product("111","iPhone","Apple"));
		products.add(new Product("123","Apache","TVS"));
		products.add(new Product("123","JIO","Reliance"));
		Map<String, List<Product>> productsMap = new HashMap<String, List<Product>>();
		productsMap.put("products", products);
		return productsMap;
	}

}
