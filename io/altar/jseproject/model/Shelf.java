package io.altar.jseproject.model;



public class Shelf extends Entity{

	private int shelfId;
	private int shelfLocal;
	private int shelfCapacity;
	//private int shelfProducts;
	private double shelfDailyPCost;

	public Shelf (int shelfId, int shelfLocal, int shelfCapacity, double shelfDailyPCost){
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
	
	public double getshelfDailyPCost() {
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
	public void setshelfDailyPCost(double shelfDailyPCost) {
		this.shelfDailyPCost = shelfDailyPCost;
	}
	
	
	@Override
	public String toString(){
		return "Id: "+ getEntityId() + ", Localization: " + shelfLocal + ", Capacity: " + shelfCapacity  + ", Daily Cost: " + shelfDailyPCost;
	}
	
	
	
}