package io.altar.jseproject.textinterface;

import java.util.ArrayList;
import java.util.Scanner;


public class TextInterface {
	
	public static void main(String[] args){
		
		welcome();
	}
	
	public static int getInput(int min, int max){
			
			Scanner s = new Scanner(System.in);
			int input = 0;
			
			while(true){ //so termina qdo return
				if(s.hasNextInt()){
					input = s.nextInt();
					if(input >= min && input <= max){
						s.close();
						return input;
					}
					else{
						System.out.println("Por favor introduza um numero entre " + min + " e " + max);
					}
				}
				else{
					System.out.println("Por favor introduza um caracter numerico.");
					s.next();
				}
				}
			}
								
		
			/*while( !s.hasNextInt() ){ //enquanto nao tiver numero inteiro
				System.out.println("Por favor introduza um caracter numerico.");
				s.next(); //pedir uma nova insercao
				}
				input = s.nextInt(); //recolher o input valido
				s.close();
				return input;
			}*/
	
		
		public static void welcome(){  //screen 1
				
		System.out.println("Por favor selecione uma das seguintes opcoes:");
		System.out.println("1.Listar produtos");
		System.out.println("2.Listar prateleiras");
		System.out.println("3.Sair");
				
		int input = getInput(1,3);
		
		System.out.println("Escolheu a opcao " + input + ".");
		
		switch (input) {
		
			case 1: 
				getProductList();
				break;
			case 2: 
				getShelvesList();
				break;
			case 3: 
				welcome();
				break;
			default: 
				System.out.println("Por favor introduza um numero entre " + 1 + " e " + 3);
				break;
		}
			
		}	
		
		public static void getProductList(){   //screen 1.1
							
		//	System.out.println("Lista de produtos"); //
	
			ArrayList<Integer> productId = new ArrayList<>();
			
			productId.add(1);
			productId.add(2);
			productId.add(3);
			
			System.out.println("Lista de produtos: " + productId.toString());
			
			//novas opcoes:
			
			System.out.println("Por favor selecione uma das seguintes opcoes:");
			System.out.println("1.Criar novo produto");
			System.out.println("2.Editar um produto existente");
			System.out.println("3.Consultar o detalhe de um produto");
			System.out.println("4.Remover um produto");
			System.out.println("5.Voltar ao ecrã anterior");
			
			int input = getInput(1,5);
			
			System.out.println("Escolheu a opcao" + input + ".");//
			
			switch (input) {
			
			case 1: 
				getNewProduct();
				break;
			case 2: 
				getEditProduct();
				break;
			case 3: 
				getViewProductDetails();
				break;
			case 4: 
				getDeleteProduct();
				break;
			case 5: 
				welcome();
				break;
			default: 
			  	System.out.println("Por favor introduza um numero entre " + 1 + " e " + 5);
			  	break;
			}
					
		}	
		
		public static void getShelvesList(){   //screen 1.2
			
			System.out.println("Lista de prateleiras"); 
			
			ArrayList<Integer> shelfId = new ArrayList<>();
			
			shelfId.add(1);
			shelfId.add(2);
			shelfId.add(3);
			
			System.out.println("Lista de produtos: " + shelfId.toString());
			
			System.out.println("Por favor selecione uma das seguintes opcoes:");
			System.out.println("1.Criar nova lista");
			System.out.println("2.Editar uma prateleira existente");
			System.out.println("3.Consultar o detalhe de uma prateleira");
			System.out.println("4.Remover uma prateleira");
			System.out.println("5.Voltar ao ecrã anterior");
			
			//int input = getInput(1,5);
			
			//System.out.println("Escolheu a opcao" + input + ".");//
					
			/*switch (input) {
			
			case 1: 
				getNewShelf();
				break;
			case 2: 
				getEditshelf();
				break;
			case 3: 
				getViewShelfDetails();
				break;
			case 4: 
				getDeleteshelf();
				break;
			case 5: 
				getBack();
				break;
			default: 
				System.out.println("Por favor introduza um numero entre" + 1 + "e" + 5);
			 	break;
			}*/
							
			}	
		
		public static void getNewProduct(){  //screen 1.1.1
			
			int inputproductVal;
			double inputproductIVA;
			double inputproductPVP;
			
			//new array?
			
				
			
			
			
			System.out.println("Por favor insira os dados do novo produto.");
			
			Scanner s1 = new Scanner(System.in);
			System.out.println("Valor unitario de desconto:");
			inputproductVal = s1.nextInt();
			System.out.println("Valor unitario de desconto: " + inputproductVal);		
			//add val to array
			s1.close();
					
			Scanner s2 = new Scanner(System.in);
			System.out.println("IVA:");
			inputproductIVA = s2.nextDouble();
			System.out.println("IVA: " + inputproductIVA);
			//add IVA to array
			s2.close();
			
			Scanner s3 = new Scanner(System.in);
			System.out.println("PVP:");
			inputproductPVP = s3.nextDouble();
			System.out.println("PVP: " + inputproductPVP);
			//add PVP to array
			s3.close();
			
						
			//int input;
			
			// productVal.add(inputVal);
			// productIVA.add(inputIVA);
			// productPVP.add(inputPVP);
						
		}
		
		/*public static void getViewProductDetails(){
			return productId; //array?
			
			System.out.println("");
			product[0]
		}*/
		
		public static void getEditProduct(){
			
		}
		public static void getViewProductDetails(){
			
		}
		public static void getDeleteProduct(){
			// scan o iput do user - index
			// products = ArrayList.remove(product, index);
			// system.out.printIn("nova lista de produtos" + ArrayList.toString(products))
		}
		
		
		
		
}	
		
		
		
	
	


