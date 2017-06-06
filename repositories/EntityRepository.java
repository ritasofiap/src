package repositories;

	import java.util.LinkedHashMap;

import io.altar.jseproject.model.Entity;


import java.util.Collection;


	public abstract class EntityRepository<E extends Entity> {
		
		private LinkedHashMap<Long, E> entities = new LinkedHashMap<>();  //long ou integer
		
		private int index = 0;
		
		protected long getNextEntityId(){  //long ou int
			return ++index;
		}
		
		
		//read
		public E findByEntityId(long entityId){
			return entities.get(entityId);
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
		public void removeEntity(long entityId){
			entities.remove(entityId);
		}
		
		
		//show
		public Collection<E> getEntities(){
			return entities.values();
			}
				
		
		
	}
	

