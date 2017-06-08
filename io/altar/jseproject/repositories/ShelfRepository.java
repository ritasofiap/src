package io.altar.jseproject.repositories;

import io.altar.jseproject.model.Entity;

public class ShelfRepository extends Entity{

private static final ShelfRepository INSTANCE = new ShelfRepository();
	
	private ShelfRepository(){	
	}
	
	public static ShelfRepository getInstance(){
		
		return INSTANCE; 
	}
	
}
