package io.altar.jseproject.model;


public class Product extends Entity{

	private int productId;
	//private tipo productShelves; array list
	private int productVal;
	private double productIVA;
	private double productPVP;
	
	
	public Product (int productId, int productVal, double productIVA, double productPVP){
		this.productId = productId;
		this.productVal = productVal;
		this.productIVA = productIVA;
		this.productPVP = productPVP;
	}
	
	
	//---Id
	public int getProductId() {
		return productId;
	}
	
	public Integer getEntityId() {
		return getEntityId();
	}
	//---

	
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
	
	@Override
	public String toString(){
		return "Id: "+ getEntityId() + ", Val: " + productVal + ", IVA: " + productIVA  + ", PVP: " + productPVP;
	}
	
}