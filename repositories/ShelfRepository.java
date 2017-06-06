package repositories;

import io.altar.jseproject.model.Entity;

//package io.altar.jseproject.model.shelf;

	public class ShelfRepository extends Entity{

	private static final ShelfRepository INSTANCE = new ShelfRepository();
		
		private ShelfRepository(){	
		}
		
		public static ShelfRepository getInstance(){
			
			return INSTANCE; 
		}
		
	}

