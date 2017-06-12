package io.altar.jseproject.model;

import java.util.ArrayList;

public class Shelf extends Entity{

	//private int shelfId;
	private int shelfLocal;
	private int shelfCapacity;
	//private int shelfProduct;
	private double shelfDailyCost;
	
	private ArrayList<Shelf> shelfProduct = new ArrayList<>();  //valera a pena se cada prateleira so pode ter 1 produto??

//Localizacao - topo, meio, fundo top middle bottom shelf (string)
	
	public Shelf (int shelfLocal, int shelfCapacity, double shelfDailyCost){
		//this.shelfId = shelfId;
		this.shelfLocal = shelfLocal;
		this.shelfCapacity = shelfCapacity;
		this.shelfDailyCost = shelfDailyCost;
		
		//this.shelfProduct = shelfProduct;
	}
	
	/*public int getShelfId() {
		return shelfId;
	}
	*/
	
	public void getShelfProduct(ArrayList<Shelf> shelfProduct) {
		this.shelfProduct = shelfProduct;
	}	
	
	
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
	
	public void setShelfProduct1(ArrayList<Shelf> shelfProduct) {
		this.shelfProduct = shelfProduct;
	}


	
	@Override
	public String toString(){
		return "Shelf ID: "+ getEntityId() + " | Localization: " + shelfLocal + " | Capacity: " + shelfCapacity  + " | Daily Cost: " + shelfDailyCost + " | Product on display: " + shelfProduct.toString();
	}
	
	
	
}