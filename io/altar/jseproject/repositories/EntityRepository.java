package io.altar.jseproject.repositories;


import java.util.LinkedHashMap;
import java.util.Set;

import io.altar.jseproject.model.Entity;
//import io.altar.jseproject.model.Product;
import io.altar.jseproject.model.Product;
import io.altar.jseproject.model.Shelf;

import java.util.Collection;


public abstract class EntityRepository<E extends Entity> {
	
	private LinkedHashMap<Integer, E> entities = new LinkedHashMap<>();  //long ou integer
				
	/*EntityRepository(LinkedHashMap<Integer, E> entities) {
		super();
		this.entities = entities;
	}*/


	 public void setEntities(LinkedHashMap<Integer, E> entities) {
		this.entities = entities;
	}
	
	
	private int index = 0; //tava static
	
	public int getNextEntityId(){  //long ou int  //tava static
		return ++index;
	}
	
	
	//read
	public E findByEntityId(Integer entityId){
		return entities.get(entityId);
	}
	
	
	//show
	public void displayEntity(Integer key){
		System.out.println(entities.get(key).toString());
	}
	
	//get product/shelf id 
	/*public E get(Integer entityId){
		return entities.get(entityId);
	}*/
	
	public Collection<E> getEntities(){
		return entities.values();
	}
	
	
	//add
	public void addEntityId(E entity){
		int newEntityId = getNextEntityId();
		entity.setEntityId(newEntityId);
		entities.put(entity.getEntityId(), entity);		
	}
	
	/*	
	public void addEntityId(E entity){
		int newEntityId = getNextEntityId();
		entity.setEntityId(newEntityId);
		entities.put(newEntityId, entity);		
	}
	*/
	
	public int getEntityIndex(E entity){
		return index;  
	}
	
	//remove
	public void removeEntity(Integer entityId){
		entities.remove(entityId);
	}
	
		
	//check if empty
	public boolean isEmpty(){
		return entities.isEmpty();
	}
	
	//entity key
	public Set<Integer> keySet(){
		return entities.keySet();
	}
	
			
	//
	public boolean containsKey(Integer key){
		return entities.containsKey(key);
	}
	

	//edit
	public void editEntity(E entity){
		entities.put(index, entity);  //getId()
	}
	
	
	public static void editEntity(Integer entityId, String productName, Integer productVal, Double productIVA, Double productPVP) {
		
		((Product)ProductRepository.getInstance().findByEntityId(entityId)).setProductName(productName);
		((Product)ProductRepository.getInstance().findByEntityId(entityId)).setProductVal(productVal);
		((Product)ProductRepository.getInstance().findByEntityId(entityId)).setProductIVA(productIVA);
		((Product)ProductRepository.getInstance().findByEntityId(entityId)).setProductPVP(productPVP);
	}
	
		
	public static void editEntity(Integer entityId, Integer shelfLocal, Integer shelfCapacity, Double shelfDailyCost) {
		
		((Shelf)ShelfRepository.getInstance().findByEntityId(entityId)).setShelfLocal(shelfLocal);
		((Shelf)ShelfRepository.getInstance().findByEntityId(entityId)).setShelfCapacity(shelfCapacity);
		((Shelf)ShelfRepository.getInstance().findByEntityId(entityId)).setShelfDailyCost(shelfDailyCost);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//...
public String getList(String listType){
	String text = String.format("Lista de entidades:", listType);
	if (!entities.isEmpty()) {
		for (Integer EntityId : entities.keySet()) {
			text += entities.get(EntityId).toString();
		}
	} else {
		text += "Empty";
	}
	return text;
}
	
	
	
}
