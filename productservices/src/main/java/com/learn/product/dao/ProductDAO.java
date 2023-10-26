package com.learn.product.dao;

import com.learn.product.dto.Product;

public interface ProductDAO {

	void create(Product product);
	
	void read(int id);
	
	void update(Product product);
	
	void delete(int id);
	
}
