package io.altar.jseproject.entity;


import java.util.LinkedHashMap;

import io.altar.jseproject.model.Product;

public class ProductRepository extends EntityRepository<Product> {
	
	private static final ProductRepository INSTANCE = new ProductRepository();
	
	private ProductRepository(){	
		
		LinkedHashMap<Integer, Product> map = new LinkedHashMap<Integer, Product>();
		
		Product p1 = new Product(101, 10, 10, 9.99);
		Product p2 = new Product(102, 10, 10, 10.99);
		Product p3 = new Product(103, 10, 10, 15.99);
		Product p4 = new Product(104, 10, 10, 19.99);
	}
		
	public static ProductRepository getInstance(){
		
		return INSTANCE; 
	}
	
}
