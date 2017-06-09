package io.altar.jseproject.repositories;


import java.util.LinkedHashMap;
import java.util.Set;

import io.altar.jseproject.model.Entity;
//import io.altar.jseproject.model.Product;

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
	
	
	
	
	//edit
	public void editEntity(E entity){
		
		entities.put(index, entity);  //getId()
	}
	//public void alterElement(){}
	
	
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
