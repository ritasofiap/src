package io.altar.jseproject.textinterface;

import java.util.ArrayList;
import java.util.Scanner;
import io.altar.jseproject.test.Utils;
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
							
			
			
				if(productList.isEmpty()){
					System.out.println("A lista de produtos esta vazia. Por favor selecione outra opcao. \n");
				}
				else{
					System.out.println("Lista de produtos: ");
					
							for (Integer key : productList.keySet()) {
							   // System.out.println("ID: " + key); //key
								
								productList.displayEntity(key);
							}
											
							//for(Integer entityId : productList.keySet()){
							//	System.out.println(productList.findByEntityId(entityId).toString());
							//}
				System.out.println("\n");
				}

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
			
			System.out.println("Escolheu a opcao " + input + ".\n");
			
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
				
				/*if(shelfList.isEmpty()){
					System.out.println("A lista de prateleiras esta vazia. Pretende ainda assim criar um produto primeiro? s/n \n");
				*/
				
				System.out.println("Por favor insira os dados do novo produto.");
				
				
				System.out.println("Inserir nome do produto:");
				String inputproductName = Utils.getDataInputName(s);
												
				System.out.println("Valor unitario de desconto:");
				int inputproductVal = Utils.getDataInputInt(s);
				
				System.out.println("IVA (6, 13 ou 23%):");
				double inputproductIVA = Utils.getDataInputIVA(s);
				
				System.out.println("PVP:");
				double inputproductPVP = Utils.getDataInputDouble(s);
							
					
				//if(!shelfList.isEmpty()){
				System.out.println("ID da prateleira onde deseja expor o produto:");  //checkar se existe prateleira onde colocar o produto, mas n e obrigatorio existiram prateleiras!
				int inputproductShelf = Utils.getProductShelfInput(s); 			
				
				
				
				Product newProduct = new Product(inputproductName, inputproductVal, inputproductIVA, inputproductPVP);
				
								
				productList.addEntityId(newProduct);
				
								
				ArrayList<Product> productShelves = new ArrayList<>(); //null?
				productShelves.add(newProduct);
				
				//ProductRepository.getInstance().addEntityId(newProduct);
					
				//for (Integer key : productList.keySet()) {
					   // System.out.println("ID: " + key); //key
					 //   productList.displayEntity(key);
					//}
				
				int index = productList.getEntityIndex(newProduct); 
				
				System.out.println("Detalhes do Produto: " + "Product ID: " + index + " | Product Name: "+ inputproductName + " | Val: " + inputproductVal + " | IVA: " + inputproductIVA  + " % " + " | PVP = " + inputproductPVP + "€" +  " | Prateleiras: " + inputproductShelf + "\n");
				
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
				ProductListId(); //pa escolher outra opcao
				
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
	
					System.out.println("Nome original: " + ((Product) productList.findByEntityId(EntityId)).getProductName() + " | Novo nome do produto:");
				
						String inputproductName = Utils.getDataInputName(s);
						((Product) productList.findByEntityId(EntityId)).setProductName(inputproductName);
						
					
					System.out.println("Val original: " + ((Product) productList.findByEntityId(EntityId)).getProductVal() + " | Novo Val do produto:");
						int inputproductVal = Utils.getDataInputInt(s);
						((Product) productList.findByEntityId(EntityId)).setProductVal(inputproductVal);
					
				
					System.out.println("IVA original: " + ((Product) productList.findByEntityId(EntityId)).getProductIVA() + " | Novo IVA (6, 13 ou 23%) do produto:");
						double inputproductIVA = Utils.getDataInputDouble(s);
								//if else 6 13 23
						((Product) productList.findByEntityId(EntityId)).setProductIVA(inputproductIVA);
				
					System.out.println("PVP original: " + ((Product) productList.findByEntityId(EntityId)).getProductPVP() + " | Novo PVP:");
						double inputproductPVP = Utils.getDataInputDouble(s);
						((Product) productList.findByEntityId(EntityId)).setProductPVP(inputproductPVP);
					
							
					ProductRepository.editEntity(EntityId, inputproductName, inputproductVal, inputproductIVA, inputproductPVP);
					
			
					System.out.println("Detalhes do Produto: " + "Product ID: " + EntityId + " | Product Name: "+ inputproductName + " | Val: " + inputproductVal + " | IVA: " + inputproductIVA + " % " + " | PVP = " + inputproductPVP + "€");
				
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
										
						String answer = s.next();
														
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
				System.out.println("A lista de prateleiras esta vazia. Por favor selecione outra opcao. \n");
			}
			else{
					for (Integer key : shelfList.keySet()) {
					   System.out.println("ID = " + key); //key
					   
					   shelfList.displayEntity(key);
					}
					System.out.println("\n");
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
				
			//	int EntityId = ShelfRepository.getNextEntityId(); //Index++
				
				System.out.println("Por favor insira os dados da nova prateleira.");
								
				System.out.println("Localizacao:");
				int inputshelfLocal = Utils.getDataInputInt(s);
				
				
				System.out.println("Capacidade:");
				int inputshelfCapacity = Utils.getDataInputInt(s);
				
				System.out.println("Custo diario:");
				double inputshelfDailyPCost = Utils.getDataInputDouble(s);
				
				
				System.out.println("ID do produto a apresentar na prateleira:");
				int inputshelfProduct = Utils.getShelfProductInput(s); //check se ha produtos!!
			
							
				Shelf newShelf = new Shelf(inputshelfLocal, inputshelfCapacity, inputshelfDailyPCost);
				
				
				shelfList.addEntityId(newShelf);
								
				
				//Shelf.getShelfProduct().add(newShelf);

				//ArrayList<Shelf> shelfProduct = null;
				ArrayList<Shelf> shelfProduct = new ArrayList<>(); 
				shelfProduct.add(newShelf);
				
				int index = shelfList.getEntityIndex(newShelf); 
							
				System.out.println("Detalhes da Prateleira: "+ "Shelf ID: " + index + " | Localizacao: " + inputshelfLocal + " | Capacidade: " + inputshelfCapacity  + " | Custo Diario: " + inputshelfDailyPCost + "€ " + " ! Produto disponivel na prateleira: " + inputshelfProduct + "\n");
				
				//" | Produto na prateleira: " + inputshelfProduct
				
				ShelvesListId();	
			}
		}
		
			
		
	//..................................................................................................................................	
		
		public static void Editshelf(){
			
			if (shelfList.isEmpty()) {
				System.out.println("A lista de prateleiras esta vazia.");
				ShelvesListId(); //pa escolher outra opcao
				
			}else{
				try (Scanner s = new Scanner(System.in)){
					
					System.out.println("Por favor indique a ID da prateleira que deseja editar");
					
					int EntityId = Utils.getShelfInputId(s);
				
					System.out.println("Escolheu a seguinte prateleira:");
						shelfList.displayEntity(EntityId);
					
					System.out.println("Por favor altere os dados da prateleira seleccionada.");
	
									
					System.out.println("Localizacao original: " + ((Shelf) shelfList.findByEntityId(EntityId)).getShelfLocal() + " | Nova localizacao:");
						int inputshelfLocal = Utils.getDataInputInt(s);
						((Shelf) shelfList.findByEntityId(EntityId)).setShelfLocal(inputshelfLocal);
					
				
					System.out.println("Capacidade original: " + ((Shelf) shelfList.findByEntityId(EntityId)).getShelfCapacity() + " | Nova capacidade:");
						int inputshelfCapacity = Utils.getDataInputInt(s);
								//if else 6 13 23
						((Shelf) shelfList.findByEntityId(EntityId)).setShelfCapacity(inputshelfCapacity);
				
					System.out.println("Custo diario original: " + ((Shelf) shelfList.findByEntityId(EntityId)).getShelfDailyCost() + " | Novo Custo diario:");
						double inputshelfDailyPCost = Utils.getDataInputDouble(s);
						((Shelf) shelfList.findByEntityId(EntityId)).setShelfDailyCost(inputshelfDailyPCost);
					
							
					ShelfRepository.editEntity(EntityId, inputshelfLocal, inputshelfCapacity, inputshelfDailyPCost);
					
			
					System.out.println("Detalhes doa Prateleira: " + "Prateleira ID: " + EntityId + " | Localizacao: " + inputshelfLocal + " | Capacidade: " + inputshelfCapacity  + " | Custo diario: " + inputshelfDailyPCost + "€");
				
					ShelvesListId();
				}
			}
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
								
					ShelvesListId();	
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
										
						String answer = s.next();
														
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
		
		