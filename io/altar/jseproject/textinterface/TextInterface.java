package io.altar.jseproject.textinterface;

import java.util.Scanner;
import io.altar.jseproject.test.Utils;
import io.altar.jseproject.model.Entity;
import io.altar.jseproject.model.Product;
import io.altar.jseproject.model.Shelf;
import io.altar.jseproject.repositories.ProductRepository;
import io.altar.jseproject.repositories.ShelfRepository;


public class TextInterface {	
	
	private static ProductRepository productList = ProductRepository.getInstance();
	private static ShelfRepository shelfList = ShelfRepository.getInstance();
	
		public static void welcome(){  //screen 1
				
		System.out.println("Por favor selecione uma das seguintes opcoes:");
		System.out.println("1.Listar produtos");
		System.out.println("2.Listar prateleiras");
		System.out.println("3.Sair");
				
		try (Scanner s = new Scanner(System.in)){
			int input = Utils.getInput(1,3, s);
		
		
		System.out.println("Escolheu a opcao " + input + ".");
		switch (input) {
				
			case 1: 
				ProductListId();
				break;
			case 2: 
				ShelvesListId();
				break;
			case 3: 
				welcome();
				break;
			default: 
				System.out.println("Por favor introduza um numero entre " + 1 + " e " + 3);
				s.nextInt();
			}
		}	
		}
		
//PRODUCT//	.....................................................................................................................................		
	
		public static void ProductListId(){   //screen 1.1
							
				System.out.println("Lista de produtos");
			
				if(productList.isEmpty()){
					System.out.println("A lista de produtos esta vazia.");
				}
				else{
							for (Integer key : productList.keySet()) {
							    System.out.println("ID: " + key); //key
							}
							
												
							//
							
							//for(Integer entityId : productList.keySet()){
							//	System.out.println(productList.findByEntityId(entityId).toString());
							//}
				}
										
			//System.out.println("Lista de produtos: " + productId.toString());

			/*for(Map.Entry<Integer, Product> entry:map.entrySet()){
				Product p = entry.getValue();
				System.out.println("Lista de produtos: " + p.productId);
			}*/
									
			System.out.println("Por favor selecione uma das seguintes opcoes:");
			System.out.println("1.Criar novo produto");
			System.out.println("2.Editar um produto existente");
			System.out.println("3.Consultar o detalhe de um produto");
			System.out.println("4.Remover um produto");
			System.out.println("5.Voltar ao ecra anterior");
			
			try (Scanner s = new Scanner(System.in)){
			
			int input = Utils.getInput(1,5, s);
			
			System.out.println("Escolheu a opcao " + input + ".");
			
			switch (input) {
			
			case 1: 
				NewProduct();
				break;
			case 2: 
				EditProduct();
				break;
			case 3: 
				ViewProductDetails();
				break;
			case 4: 
				RemoveProduct();
				break;
			case 5: 
				welcome();
				break;
			default: 
			  	System.out.println("Por favor introduza um numero entre " + 1 + " e " + 5);
			  	s.nextInt();
			}
		}
		}	
	
	//..................................................................................................................................
		
		public static void NewProduct(){  //screen 1.1.1
			
			try (Scanner s = new Scanner(System.in)){
				
				
				
				System.out.println("Por favor insira os dados do novo produto.");
								
				System.out.println("Valor unitario de desconto:");
				int inputproductVal = Utils.getDataInputInt(s);
				//((Product)ProductRepository.getInstance().findByEntityId(EntityId)).setProductVal(inputproductVal);
				
				System.out.println("IVA (6, 13 ou 23%):");
				double inputproductIVA = Utils.getDataInputDouble(s);
				//((Product)ProductRepository.getInstance().findByEntityId(EntityId)).setProductIVA(inputproductIVA);
				
				System.out.println("PVP:");
				double inputproductPVP = Utils.getDataInputDouble(s);
				//((Product)ProductRepository.getInstance().findByEntityId(EntityId)).setProductPVP(inputproductPVP);
			
				//int EntityId = ProductRepository.getNextEntityId(); //Index++
				
				Product newProduct = new Product(inputproductVal, inputproductIVA, inputproductPVP);
				
				productList.addEntityId(newProduct);
				
				//EntityRepository.setEntities(E newProduct);
								
			//	EntityRepository.LinkedHashMap.put
				
				//ProductRepository.getInstance().addEntityId(newProduct);
								
				System.out.println("Detalhes do Produto: "+ "ID = " + Entity.getEntityId() + " | Val = " + inputproductVal + " | IVA = " + inputproductIVA  + " | PVP = " + inputproductPVP);
				
				ProductListId();			
			}
			
			
			
			//add to hashmap?
			/*	EntityRepository.getEntities(LinkedHashMap<Int, E> product);
			
			product.put(1, new Integer(inputproductVal));
			product.put(2, new Double(inputproductIVA));
			product.put(3, new Double(inputproductPVP));
													
			}*/

		}
		
	//..................................................................................................................................
		
		public static void EditProduct(){  //screen 1.1.2
			
			if (productList.isEmpty()) {
				System.out.println("A lista de produtos esta vazia.");
				ProductListId(); //escolher outra opcao
				
			}else{
				try (Scanner s = new Scanner(System.in)){
					
					System.out.println("Por favor indique a ID do produto que deseja editar");
					
					int EntityId = Utils.getProdutInputId(s);
								
					//check if product exists (ja faz no getProdict/input
					
					/*;
				    System.out.println("ID exists in LinkedHashMap ? : " + productExists);
				    if true -> edit product
				    else -> pedir novo input
				    */		
					
					System.out.println("Escolheu o seguinte produto:");
					productList.displayEntity(EntityId);
					
					System.out.println("Por favor altere os dados do produto seleccionado.");
					
					System.out.println("Este produto tem um Valor unitario de desconto de:");
					((Product) productList.findByEntityId(EntityId)).getProductVal();
					int inputproductVal = Utils.getDataInputInt(s);
					((Product) productList.findByEntityId(EntityId)).setProductVal(inputproductVal);
					//((Product)ProductRepository.getInstance().findByEntityId(EntityId)).setProductVal(inputproductVal);
					
					System.out.println("Este produto tem um IVA de:");
					((Product) productList.findByEntityId(EntityId)).getProductIVA();
					double inputproductIVA = Utils.getDataInputDouble(s);
					((Product) productList.findByEntityId(EntityId)).setProductIVA(inputproductIVA);
					//((Product)ProductRepository.getInstance().findByEntityId(EntityId)).setProductIVA(inputproductIVA);
					
					System.out.println("Este produto tem um PVP de:");
					((Product) productList.findByEntityId(EntityId)).getProductPVP();
					double inputproductPVP = Utils.getDataInputDouble(s);
					((Product) productList.findByEntityId(EntityId)).setProductPVP(inputproductPVP);
					//((Product)ProductRepository.getInstance().findByEntityId(EntityId)).setProductPVP(inputproductPVP);
							
					ProductRepository.editEntity(EntityId, inputproductVal, inputproductIVA, inputproductPVP);
					
					//Product newProduct = new Product(EntityId, inputproductVal, inputproductIVA, inputproductPVP);
					
					System.out.println("Produto: "+ EntityId + ", Val: " + inputproductVal + ", IVA: " + inputproductIVA  + ", PVP: " + inputproductPVP);
					
					ProductListId();	
					
				}
			}		
		}
	
	//..................................................................................................................................	
		
		public static void ViewProductDetails(){ //screen 1.1.3
			
			if (productList.isEmpty()) {
				System.out.println("A lista de produtos esta vazia.");
				ProductListId(); //escolher outra opcao
				
			}else{
				try (Scanner s = new Scanner(System.in)){
					
					System.out.println("Por favor indique a ID do produto que deseja inspecionar");
					int EntityId = Utils.getProdutInputId(s);
								
					System.out.println("Escolheu o seguinte produto:");
					productList.displayEntity(EntityId);
								
					ProductListId();	
					}	
			
				}
			}
			
			
			
			//ProductRepository.getInstance().findByEntityId(entityId);
			//check if id exists
		
	//..................................................................................................................................	
		
		public static void RemoveProduct(){  //screen 1.1.4
					
			if (productList.isEmpty()) {
				System.out.println("A lista de produtos esta vazia.");
				ProductListId(); //escolher outra opcao
				
			}else{
				try (Scanner s = new Scanner(System.in)){
					
					System.out.println("Por favor indique a ID do produto que deseja remover");
					int EntityId = Utils.getProdutInputId(s);
								
					System.out.println("Escolheu o seguinte produto:");
					productList.displayEntity(EntityId);
					
					System.out.println("Confirma a remocao deste produto? s/n");
					
					while (true) {
										
						String answer = s.nextLine();
														
						if (answer.equals("s")) {
							productList.removeEntity(EntityId);
							ProductListId(); //volta a ver a lista mas agora sem este produto e escolher novas options
						} else if (answer.equals("n")) {
							ProductListId(); //para podeer escolher outro product
						} else {
							System.out.println("Resposta invalida. Por favor insira s ou n");
						}
						
						//ProductListId();
					}	

				}
			}
			
			// sysout ask product Id
			// scan inputId
				// check if exists
			// EntityRepository.getEntities(LinkedHashMap<Long, E> product);
			// EntityRepository = LinkedHashMap.remove(inputId);
			// sysout new hashmap/Lista w/o product
		
		}
		
		
		
//SHELF//	..................................................................................................................................
		public static void ShelvesListId(){   //screen 1.2
						
			if(shelfList.isEmpty()){
				System.out.println("A lista de prateleiras esta vazia.");
			}
			else{
					for (Integer key : shelfList.keySet()) {
					   System.out.println("Id = " + key); //key
					}
			}
		
			System.out.println("Lista de prateleiras"); 
			
			System.out.println("Por favor selecione uma das seguintes opcoes:");
			System.out.println("1.Criar nova lista");
			System.out.println("2.Editar uma prateleira existente");
			System.out.println("3.Consultar o detalhe de uma prateleira");
			System.out.println("4.Remover uma prateleira");
			System.out.println("5.Voltar ao ecra anterior");
			
		
			try (Scanner s = new Scanner(System.in)){
		
				int input = Utils.getInput(1,5, s);
		
				System.out.println("Escolheu a opcao " + input + ".");
		
				switch (input) {
				case 1: 
					NewShelf();
					break;
				case 2: 
					Editshelf();
					break;
				case 3: 
					ViewShelfDetails();
					break;
				case 4: 
					RemoveShelf();
					break;
				case 5: 
					welcome();
					break;
					default: 
		  	System.out.println("Por favor introduza um numero entre " + 1 + " e " + 5);
		  	s.nextInt();
				}
			}
		}	
	
	//..................................................................................................................................	
		
		public static void NewShelf(){
			try (Scanner s = new Scanner(System.in)){
				
				int EntityId = ShelfRepository.getNextEntityId(); //Index++
				
				System.out.println("Por favor insira os dados da nova prateleira.");
								
				System.out.println("Localizacao:");
				int inputshelfLocal = Utils.getDataInputInt(s);
				//((Product)ProductRepository.getInstance().findByEntityId(EntityId)).setProductVal(inputproductVal);
				
				System.out.println("Capacidade:");
				int inputshelfCapacity = Utils.getDataInputInt(s);
				//((Product)ProductRepository.getInstance().findByEntityId(EntityId)).setProductIVA(inputproductIVA);
				
				System.out.println("Custo diario:");
				double inputshelfDailyPCost = Utils.getDataInputDouble(s);
				//((Product)ProductRepository.getInstance().findByEntityId(EntityId)).setProductPVP(inputproductPVP);
			
				Shelf newShelf = new Shelf(EntityId, inputshelfLocal, inputshelfCapacity, inputshelfDailyPCost);
				
				//EntityRepository.setEntities(E newProduct);
								
			//	EntityRepository.LinkedHashMap.put
				
				//ProductRepository.getInstance().addEntityId(newProduct);
								
				System.out.println("Detalhes da Prateleira: "+ "ID = " + EntityId + " | Localizacao = " + inputshelfLocal + " | Capacidade = " + inputshelfLocal  + " | Custo Diario = " + inputshelfDailyPCost);
				
				ShelvesListId();	
			}
		}
		
	//..................................................................................................................................	
		
		public static void Editshelf(){
			
		}
			
		
	//..................................................................................................................................	
		
		public static void ViewShelfDetails(){
			if (shelfList.isEmpty()) {
				System.out.println("A lista de prateleiras esta vazia.");
				ShelvesListId(); //escolher outra opcao
				
			}else{
				try (Scanner s = new Scanner(System.in)){
					
					System.out.println("Por favor indique a ID da pratleira que deseja inspecionar");
					int EntityId = Utils.getShelfInputId(s);
								
					System.out.println("Escolheu a seguinte prateleira:");
					shelfList.displayEntity(EntityId);
								
						
					}					
				}
		}
		
	//..................................................................................................................................
		
		public static void RemoveShelf(){
			if (shelfList.isEmpty()) {
				System.out.println("A lista de pratleiras esta vazia.");
				ShelvesListId(); //escolher outra opcao
				
			}else{
				try (Scanner s = new Scanner(System.in)){
					
					System.out.println("Por favor indique a ID da prateleira que deseja remover.");
					int EntityId = Utils.getShelfInputId(s);
								
					System.out.println("Escolheu a seguinte prateleira: ");
					shelfList.displayEntity(EntityId);
					
					System.out.println("Confirma a remocao deste produto? s/n.");
					
					while (true) {
										
						String answer = s.nextLine();
														
						if (answer.equals("s")) {
							shelfList.removeEntity(EntityId);
							ShelvesListId(); //volta a ver a lista mas agora sem este prateleira e escolher novas options
						} else if (answer.equals("n")) {
							ShelvesListId(); //para podeer escolher outro shelf
						} else {
							System.out.println("Resposta invalida. Por favor insira s ou n");
						}
					}					
				}
			}
		}
		
		
		
}	
		
		
	
	


