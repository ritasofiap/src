package io.altar.jseproject.repositories;

import io.altar.jseproject.model.Product;

public class ProductRepository extends EntityRepository<Product> {
	
	private static final ProductRepository INSTANCE = new ProductRepository();
	
	private ProductRepository(){	
			
	}
		
	public static ProductRepository getInstance(){
		
		return INSTANCE; 
	}
	
	public static void editEntity(Integer entityId, Integer productVal, Double productIVA, Double productPVP) {
		
		((Product)ProductRepository.getInstance().findByEntityId(entityId)).setProductVal(productVal);
		((Product)ProductRepository.getInstance().findByEntityId(entityId)).setProductIVA(productIVA);
		((Product)ProductRepository.getInstance().findByEntityId(entityId)).setProductPVP(productPVP);
	}


	
}
