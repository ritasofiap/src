package io.altar.jseproject.repositories;

import io.altar.jseproject.model.Shelf;

public class ShelfRepository extends EntityRepository<Shelf>{

private static final ShelfRepository INSTANCE = new ShelfRepository();
	
	private ShelfRepository(){	
	}
	
	public static ShelfRepository getInstance(){
		
		return INSTANCE; 
	}
	
	public static void editEntity(Integer entityId, Integer shelfLocal, Integer shelfCapacity, Double shelfDailyCost) {
		
		((Shelf)ShelfRepository.getInstance().findByEntityId(entityId)).setShelfLocal(shelfLocal);
		((Shelf)ShelfRepository.getInstance().findByEntityId(entityId)).setShelfCapacity(shelfCapacity);
		((Shelf)ShelfRepository.getInstance().findByEntityId(entityId)).setShelfDailyCost(shelfDailyCost);
	}
}
