package com.learn.product.bo;

import com.learn.product.dto.Product;
import com.learn.product.dao.ProductDAO;
import com.learn.product.dao.ProductDAOImpl;


public class ProductBOImpl implements ProductBO {

	private static ProductDAO dao = new ProductDAOImpl();
	
	@Override
	public void create(Product product) {
		dao.create(product);
	}
	
	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

	

}
