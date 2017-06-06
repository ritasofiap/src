package io.altar.jseproject.test;

import java.util.LinkedHashMap;
import io.altar.jseproject.model.Product;
import io.altar.jseproject.model.Shelf;

public class LinkedHashMapTest {
	public static void main(String[] args){
		
			LinkedHashMap<Integer, Product> product = new LinkedHashMap<Integer, Product>();
			product.put(1, new Product(101, 10, 10, 9.99));
			product.put(2, new Product(102, 10, 10, 10.99));
			product.put(3, new Product(103, 10, 10, 15.99));
			product.put(4, new Product(104, 10, 10, 19.99));
			
			LinkedHashMap<Integer, Shelf> shelf = new LinkedHashMap<Integer, Shelf>();
			shelf.put(1, new Shelf(101, 201, 10, 5.99));
			shelf.put(2, new Shelf(102, 202, 10, 5.99));
		
			
		}
	
	}

