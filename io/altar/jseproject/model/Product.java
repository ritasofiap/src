package io.altar.jseproject.model;

public class Product {

	private int productId;
	//private int productShelves;
	private int productVal;
	private int productIVA;
	private int productPVP;
	
	public Product (int productId, int productVal, int productIVA, int productPVP){
		this.productId = productId;
		this.productVal = productVal;
		this.productIVA = productIVA;
		this.productPVP = productPVP;
	}
	
	public int getProductId() {
		return productId;
	}
	
	public int getProductVal() {
		return productVal;
	}
	
	public int getproductIVA() {
		return productIVA;
	}
	
	public int getproductPVP() {
		return productPVP;
	}
	
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public void setProductVal(int productVal) {
		this.productVal = productVal;
	}
	
	public void setproductIVA(int productIVA) {
		this.productIVA = productIVA;
	}
	
	public void setproductPVP(int productPVP) {
		this.productPVP = productPVP;
	}
	
}

