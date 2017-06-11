package io.altar.jseproject.model;

import java.util.ArrayList;

public class Product extends Entity{

	//private int productId;
	//private tipo productShelves; array list
	private int productVal;
	private double productIVA;
	private double productPVP;
	private String productName;
	
	private ArrayList<Product> productShelves = new ArrayList<>();

	
	public Product (String productName, int productVal, double productIVA, double productPVP){
		//this.productId = productId;
		this.productName = productName;
		this.productVal = productVal;
		this.productIVA = productIVA;
		this.productPVP = productPVP;
		//this.productShelves = productShelves;
		
	}
	
	
	//ProductRepository.getInstance().addToList(this);
	
	//---Id
	/*public int getProductId() {
		return productId;
	}
	
	public Integer getEntityId() {
		return getEntityId();
	}*/
	//---

	public ArrayList<Product> getProductShelves() {   //static???
		return productShelves;
	}

	public String getProductName() {
		return productName;
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
	
	/*public void setProductId(int productId) {
	this.productId = productId;
	}*/
	
	

	public void setProductShelf(ArrayList<Product> productShelves) {
		this.productShelves = productShelves;
	}
	
	
	public void setProductName(String productName) {
		this.productName = productName;
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
		return "Product ID: "+ getEntityId() + " | Name: " + getProductName() + " | Val: " + productVal + " | IVA: " + productIVA  + " | PVP: " + productPVP + " | Prateleiras: " + productShelves;
	}
	
}