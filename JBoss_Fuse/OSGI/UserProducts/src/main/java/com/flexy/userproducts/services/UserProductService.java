package com.flexy.userproducts.services;

import java.util.List;
import java.util.Map;

import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.flexy.products.model.Product;

@WebService(serviceName = "usersProductsServices")
public interface UserProductService {
	
	@GET
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces({ MediaType.APPLICATION_JSON })
    @Path("/allproduct")
    public Map<String,List<Product>> getAllProduct();
	
}
