package com.flexy.userproducts.services;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.flexy.products.model.Product;
import com.flexy.products.services.IProductServices;

public class UserProductServiceImpl implements UserProductService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserProductServiceImpl.class);
	
	private IProductServices productServices;
	
	public IProductServices getProductServices() {
		return productServices;
	}

	public void setProductServices(IProductServices productServices) {
		this.productServices = productServices;
	}

	@Override
	public Map<String, List<Product>> getAllProduct() {
		LOGGER.info("Method Entry Get all Products 666");
		Map<String, List<Product>> products = productServices.getAllProducts();
		return products;
	}

}
