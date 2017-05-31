package io.altar.jseproject.model;

public class Shelf {

	private int shelfId;
	private int shelfLocal;
	private int shelfCapacity;
	//private int shelfProducts;
	private int shelfDailyPCost;

	public Shelf (int shelfId, int shelfLocal, int shelfCapacity, int shelfDailyPCost){
		this.shelfId = shelfId;
		this.shelfLocal = shelfLocal;
		this.shelfCapacity = shelfCapacity;
		this.shelfDailyPCost = shelfDailyPCost;
	}
	
	
	public int getShelfId() {
		return shelfId;
	}
	
	public int getShelfLocal() {
		return shelfLocal;
	}
	
	public int getshelfCapacity() {
		return shelfCapacity;
	}
	
	public int getshelfDailyPCost() {
		return shelfDailyPCost;
	}
	

	public void setShelfId(int shelfId) {
		this.shelfId = shelfId;
	}
	public void setShelfLocal(int shelfLocal) {
		this.shelfLocal = shelfLocal;
	}
	public void setshelfCapacity(int shelfCapacity) {
		this.shelfCapacity = shelfCapacity;
	}
	public void setshelfDailyPCost(int shelfDailyPCost) {
		this.shelfDailyPCost = shelfDailyPCost;
	}
	
	
}

