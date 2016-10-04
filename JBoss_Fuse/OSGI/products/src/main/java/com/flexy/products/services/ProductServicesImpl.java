package com.flexy.products.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.flexy.products.model.Product;
import com.flexy.products.repository.IProductDao;

public class ProductServicesImpl implements IProductServices {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductServicesImpl.class);
	
	private IProductDao productDao;

	public IProductDao getProductDao() {
		return productDao;
	}

	public void setProductDao(IProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public Map<String, List<Product>> getAllProducts() {
		Map<String, List<Product>> allProducts = new HashMap<String, List<Product>>();
		try {
			allProducts = productDao.listProducts();
		}catch(Exception e) {
			System.out.println("Exception occurred : "+e);
			LOGGER.error("Exception occurred : ",e);
			e.printStackTrace();
		}
		return allProducts;
	}

}
