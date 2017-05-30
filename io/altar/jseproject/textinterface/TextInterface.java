package io.altar.jseproject.textinterface;

import java.util.Scanner;

public class TextInterface {
	
	public static void main(String[] args){
		welcome();
	}
	
		private static void inputValidation(){
			
			int input;
			Scanner s = new Scanner(System.in);
					
			while( !s.hasNextInt() ){ //enquanto nao tiver numero inteiro
				System.out.println("Por favor introduza um caracter numerico.");
				s.next(); //pedir uma nova insercao
				}
				input = s.nextInt(); //recolher o input valido
				s.close();
				System.out.println(input);
			}
	
		
		public static void welcome(){ 
		
		int input;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Por favor selecione uma das seguintes opcoes:");
		System.out.println("1.Listar produtos");
		System.out.println("2.Listar prateleiras");
		System.out.println("3.Sair");
				
		inputValidation();
	
		switch (input) {
		
			case 1: getProductList();
			case 2: getShelvesList();
			case 3: getExit();
				break;
			default: break;
		}
			
		/*if (input == 1)
		{
			input = getProductList();
		}
		else
			if (input == 2)
			{
				input = getShelvesList();
			}
			else
				if (input == 3)
				{
					input = getExit();
				}*/
		
		System.out.println("Escolheu a opcao" + input + ".");
		
		}	

		
			
		public static void getProductList(){   //screen 1
			
			int input;
			Scanner s = new Scanner(System.in);
			
			System.out.println("Por favor selecione uma das seguintes opcoes:");
			System.out.println("1.Criar novo produto");
			System.out.println("2.Editar um produto existente");
			System.out.println("3.Consultar o detalhe de um produto");
			System.out.println("4.Remover um produto");
			System.out.println("5.Voltar ao ecrã anterior");
			
			inputValidation();
			
			switch (input) {
			
			case 1: getNewProduct();
			case 2: getEditProduct();
			case 3: getViewProductDetails();
			case 4: getDeleteProduct();
			case 5: getBack();
				break;
			default: break;
			}
						
			System.out.println("Escolheu a opcao" + input + ".");
			
			}	
		
		public static void getShelvesList(){   //screen 2
			
			int input;
			Scanner s = new Scanner(System.in);
			
			System.out.println("Por favor selecione uma das seguintes opcoes:");
			System.out.println("1.Criar nova lista");
			System.out.println("2.Editar uma prateleira existente");
			System.out.println("3.Consultar o detalhe de uma prateleira");
			System.out.println("4.Remover uma prateleira");
			System.out.println("5.Voltar ao ecrã anterior");
			
			inputValidation();
			
			switch (input) {
			
			case 1: getNewShelf();
			case 2: getEditshelf();
			case 3: getViewShelfDetails();
			case 4: getDeleteshelf();
			case 5: getBack();
				break;
			default: break;
			}
						
			System.out.println("Escolheu a opcao" + input + ".");
			
			}	
		
		public static void getExit(){   //screen 3=sair
			
			}
		
		
		
		public static void getViewProductDetails(){
			System.out.println("Detalhes do produto:" + );
		}
				
		
		
		
	
	


