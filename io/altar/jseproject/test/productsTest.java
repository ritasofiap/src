package io.altar.jseproject.test;

import java.util.ArrayList;

public class productsTest {
	
	public static void main(String[] args) {
			
		ArrayList<String> productId = new ArrayList<>();
	
		productId.add(001, "product1");
		productId.add(002, "product2");
		productId.add(003, "product3");
		
		/*for (String value : productId) {
            System.out.println(value);
        }*/
		System.out.println(productId);
}
}

//2d arrays?

/*Product product1 = new Product(1, 10, 10, 9.99);
Product product2 = new Product(2, 10, 10, 19.99);
Product product3 = new Product(3, 10, 10, 6.99);*/

