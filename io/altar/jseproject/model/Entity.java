package io.altar.jseproject.model;

public class Entity {

		protected static Integer entityId;
		
		public static Integer getEntityId(){
	
		
		return entityId;
		}
		
		public void setEntityId(int entityId){
			Entity.entityId = entityId;
		}

		
}