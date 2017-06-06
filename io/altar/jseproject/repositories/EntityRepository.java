package io.altar.jseproject.repositories;
package io.altar.jseproject.model.Entity;

import java.util.LinkedHashMap;
import java.util.Colection;


public abstract class EntityRepository<E extends Entity> {
	
	private LinkedHashMap<long, E> entities = new LinkedHashMap<>();  //long ou integer
	
	private int index = 0;
	
	protected long getNextEntityId(){  //long ou int
		return ++index;
	}
	
	
	//read
	public E findByEntityId(long Id){
		return entities.get(entityId);
	}
	
	
	//show
	public Collection<E> getEntities(){
		return entities.values();
	}
	
	
	//add
	public void addEntityId(E object){
		long newEntityId = getNextEntityId();
		object.setEntityId(newEntityId);
		entities.put(newEntityId, object);		
	}
	
	
	
	//edit
	public void editEntity(E object){
		entities.put(object.getEntityId(), object);  //getId()
	}
	
	
	//remove
	public void removeEntity(long Id){
		entities.remove(entityId);
	}
		
}
