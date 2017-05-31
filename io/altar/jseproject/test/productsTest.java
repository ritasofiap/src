package io.altar.jseproject.test;

import java.awt.List;
import java.util.ArrayList;

import io.altar.jseproject.model.Product;

public class productsTest {
	
	public static void main(String[] args) {
			
		List<Product> products = new ArrayList();
	
		Product product1 = new Product("Product1", 10, 10, 9.99);
		Product product2 = new Product("Product2", 10, 10, 19.99);
		Product product3 = new Product("Product3", 10, 10, 6.99);

	}
		
}

//2d arrays?



//exemplo array
int[] nyInts = {1, 4, 5, 6, 7, 20};

/*for(int i=0; i< myInts.lenght; i++){
	System.out.println(myInts[i]);
	
}*/

for(int myInt : myInts){  //este for each e'equivalente ao for de cima! mais simples de ler
	System.out.println(myInt);
	}

//por cada elemento do array crio um myint