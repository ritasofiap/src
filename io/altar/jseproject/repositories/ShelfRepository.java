package io.altar.jseproject.repositories;
package io.altar.jseproject.model.shelf;

public class ShelfRepository extends Entity{

private static final ShelftRepository INSTANCE = new ShelfRepository();
	
	private ShelfRepository(){	
	}
	
	public static ShelfRepository getInstance(){
		
		return INSTANCE; 
	}
	
}
