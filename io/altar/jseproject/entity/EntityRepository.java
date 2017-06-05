package io.altar.jseproject.entity;

import java.util.HashMap;
import java.util.Map;

import io.altar.jseproject.model.Entity;

public abstract class EntityRepository<E extends Entity> {
	private Map<Integer, E> entities = new HashMap<>();  //long ou integer
	
	private int index = 0;
	
	protected Integer getNextId(){
		return ++index;
	}
	
	
	//read
	public E findById(Integer id){
		return entities.get(id);
	}
	
	//add
	
	//edit
	
	//remove
	
	
	
	
	
	
	
}
