package com.savvydude.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.savvydude.dao.ProductDao;
import com.savvydude.model.Product;

@Repository
	public class ProductDaoImpl implements ProductDao {
	@Autowired
	private ProductDao productDao;
	@Autowired
	private SessionFactory sessionFactory;
		public ProductDaoImpl(){
			System.out.println("CREATING INSTANCE FOR PRODUCTDAOIMPL");
		}
		
		public Product saveProduct(Product product) {
					
			Session session = sessionFactory.openSession();
			System.out.println(product.getpId());
			session.save(product); 
			session.flush();
			session.close();
			System.out.println(product.getpId());
			return product;	
		}

	}