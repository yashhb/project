package com.savvydude.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.savvydude.dao.ProductDao;
import com.savvydude.model.Product;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductDao productDao;
	public ProductServiceImpl()
	{
		System.out.println("Creating instance for productservice");
	}
/*	public Product saveProduct(Product product)
	{
		return productDao.saveProduct(product);
	}*/
/*	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}*/
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return productDao.saveProduct(product);
	}

}