package com.learn.product.bo;

import com.learn.product.dto.Product;

public interface ProductBO {

	void create(Product product);
	
	Product findProduct(int id);
	
}
