package io.altar.jseproject.model;

public class Shelf {

	private int shelfId;
	private String shelfLocal;
	private int shelfCapacity;
	//private int shelfProducts;
	private int shelfPrice;

	public Shelf (int shelfId, String shelfLocal, int shelfCapacity, int shelfPrice){
		this.shelfId = shelfId;
		this.shelfLocal = shelfLocal;
		this.shelfCapacity = shelfCapacity;
		this.shelfPrice = shelfPrice;
	}
	
	
	public int getShelfId() {
		return shelfId;
	}
	
	public String getShelfLocal() {
		return shelfLocal;
	}
	
	public int getshelfCapacity() {
		return shelfCapacity;
	}
	
	public int getShelfPrice() {
		return shelfPrice;
	}
	

	public void setShelfId(int shelfId) {
		this.shelfId = shelfId;
	}
	public void setShelfLocal(String shelfLocal) {
		this.shelfLocal = shelfLocal;
	}
	public void setshelfCapacity(int shelfCapacity) {
		this.shelfCapacity = shelfCapacity;
	}
	public void setShelfPrice(int shelfPrice) {
		this.shelfPrice = shelfPrice;
	}
	
	
}

