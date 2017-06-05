package io.altar.jseproject.model;

import java.util.LinkedHashMap;

public class Shelf {

	private int shelfId;
	private int shelfLocal;
	private int shelfCapacity;
	//private int shelfProducts;
	private double shelfDailyPCost;

	
	LinkedHashMap<Integer, Shelf> map = new LinkedHashMap<Integer, Shelf>();
	
	Shelf s1 = new Shelf(101, 201, 10, 5.99);
	
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
	
	
}

