package io.altar.jseproject.model;

public class Product {

	private int productId;
	//private int productShelves;
	private int productVal;
	private int productIva;
	private int productVenda;
	
	public Product (int productId, int productVal, int productIva, int productVenda){
		this.productId = productId;
		this.productVal = productVal;
		this.productIva = productIva;
		this.productVenda = productVenda;
	}
	
	public int getProductId() {
		return productId;
	}
	
	public int getProductVal() {
		return productVal;
	}
	
	public int getProductIva() {
		return productIva;
	}
	
	public int getProductVenda() {
		return productVenda;
	}
	

	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public void setProductVal(int productVal) {
		this.productVal = productVal;
	}
	
	public void setProductIva(int productIva) {
		this.productIva = productIva;
	}
	
	public void setProductVenda(int productVenda) {
		this.productVenda = productVenda;
	}
	
}

