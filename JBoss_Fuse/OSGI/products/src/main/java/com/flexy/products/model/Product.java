package com.flexy.products.model;

public class Product {
	
	public Product() {
		
	}
	
	public Product(String productId,String productName,String companyName) {
		this.productId = productId;
		this.productName = productName;
		this.companyName = companyName;
	}
	
    public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	private String productId;
	
	private String productName;

    private String companyName;
    
}
