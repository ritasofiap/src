package io.altar.jseproject.model;

import java.util.LinkedHashMap;

public class Product extends Entity{

	private int productId;
	//private tipo productShelves; array list
	private int productVal;
	private double productIVA;
	private double productPVP;
	
	
	//array products?	
	LinkedHashMap<Integer, Product> map = new LinkedHashMap<Integer, Product>();
	
	Product p1 = new Product(101, 10, 10, 9.99);
	Product p2 = new Product(102, 10, 10, 10.99);
	Product p3 = new Product(103, 10, 10, 15.99);
	Product p4 = new Product(104, 10, 10, 19.99);
	
	
	public Product (int productId, int productVal, double productIVA, double productPVP){
		this.productId = productId;
		this.productVal = productVal;
		this.productIVA = productIVA;
		this.productPVP = productPVP;
	}
	
	public int getProductId() {
		return productId;
	}
	
	public double getProductVal() {
		return productVal;
	}
	
	public double getProductIVA() {
		return productIVA;
	}
	
	public double getProductPVP() {
		return productPVP;
	}
	
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public void setProductVal(int productVal) {
		this.productVal = productVal;
	}
	
	public void setProductIVA(double productIVA) {
		this.productIVA = productIVA;
	}
	
	public void setProductPVP(double productPVP) {
		this.productPVP = productPVP;
	}
	
	
}



