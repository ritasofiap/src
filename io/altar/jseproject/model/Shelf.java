package io.altar.jseproject.model;



public class Shelf extends Entity{

	//private int shelfId;
	private int shelfLocal;
	private int shelfCapacity;
	//private int shelfProducts;
	private double shelfDailyCost;

	public Shelf (int shelfLocal, int shelfCapacity, double shelfDailyCost){
		//this.shelfId = shelfId;
		this.shelfLocal = shelfLocal;
		this.shelfCapacity = shelfCapacity;
		this.shelfDailyCost = shelfDailyCost;
	}
	
	
	/*public int getShelfId() {
		return shelfId;
	}
	*/
	public int getShelfLocal() {
		return shelfLocal;
	}
	
	public int getShelfCapacity() {
		return shelfCapacity;
	}
	
	public double getShelfDailyCost() {
		return shelfDailyCost;
	}
	

	/*public void setShelfId(int shelfId) {
		this.shelfId = shelfId;
	}*/
	
	public void setShelfLocal(int shelfLocal) {
		this.shelfLocal = shelfLocal;
	}
	public void setShelfCapacity(int shelfCapacity) {
		this.shelfCapacity = shelfCapacity;
	}
	public void setShelfDailyCost(double shelfDailyCost) {
		this.shelfDailyCost = shelfDailyCost;
	}
	
	
	@Override
	public String toString(){
		return "Shelf ID: "+ getEntityId() + " | Localization: " + shelfLocal + " | Capacity: " + shelfCapacity  + " | Daily Cost: " + shelfDailyCost;
	}
	
	
	
}