package io.altar.jseproject.model;

public class Product {

	private int productId;
	//private tipo productShelves;
	private int productVal;
	private double productIVA;
	private double productPVP;
	
	
	//array products?
	
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



