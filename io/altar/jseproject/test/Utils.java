package io.altar.jseproject.test;

import java.util.Scanner;

import io.altar.jseproject.model.Entity;
import io.altar.jseproject.model.Product;
import io.altar.jseproject.model.Shelf;
import io.altar.jseproject.repositories.EntityRepository;
import io.altar.jseproject.repositories.ProductRepository;
import io.altar.jseproject.repositories.ShelfRepository;

public abstract class Utils {
	
	public static int getInput(int min, int max, Scanner s){
		
		int input = 0;
					
		while(true){ //so termina qdo return
			if(s.hasNextInt()){
				input = s.nextInt();
				if(input >= min && input <= max){
					//s.close();
					return input;
				}
				else{
					System.out.println("Por favor introduza um numero entre " + min + " e " + max);
				}
			}
			else{
				System.out.println("Por favor introduza um caracter numerico.");
			}
			}
		}
	
	//LinkedHashMap<Integer, E> entities = new LinkedHashMap<>();
	public static int getProdutInputId(Scanner s){
		
		int EntityId = 0;
		EntityRepository<? extends Entity> entities = null;
		entities = (EntityRepository<Product>)ProductRepository.getInstance();
		
		while (true) {
			EntityId = s.nextInt();
			if(EntityId == 0 || entities.containsKey(EntityId)) { //check if exists
				return EntityId;
			}else{
				System.out.println("Por favor escolha um ID valido.");
			}
		}
	}
	
public static int getShelfInputId(Scanner s){
		
		int EntityId = 0;
		EntityRepository<? extends Entity> entities = null;
		entities = (EntityRepository<Shelf>)ShelfRepository.getInstance();
		
		while (true) {
			EntityId = s.nextInt();
			if(EntityId == 0 || entities.containsKey(EntityId)) { //check if exists
				return EntityId;
			}else{
				System.out.println("Por favor escolha um ID valido.");
			}
		}
	}
	
	public static String getDataInputName(Scanner s) {	
	
		String inputString = "";		
	
		while(true){ 
			if(s.hasNext()){
				inputString = s.next();
				return inputString;
			}
			else{
				System.out.println("Por favor introduza um nome valido.");
			}
		}
	}	




	
	public static int getDataInputInt(Scanner s) {	
	
		int inputInt = 0;		
		while(true){ //so termina qdo return
			if(s.hasNextInt()){
				inputInt = s.nextInt();
				return inputInt;
			}
			else{
				System.out.println("Por favor introduza um caracter numerico.");
			}
		}
	}	
	
	public static double getDataInputDouble(Scanner s) {	
		
		double inputDouble = 0;		
		while(true){ //so termina qdo return
			if(s.hasNextDouble()){
				inputDouble = s.nextDouble();
				return inputDouble;
			}
			else{
				System.out.println("Por favor introduza um caracter numerico.");
			}
		}
	}
	
	public static double getDataInputIVA(Scanner s) {	
		
		double inputDouble = 0;		
		while(true){ //so termina qdo return
			if(s.hasNextDouble()){
				inputDouble = s.nextDouble();
				
				if(inputDouble == 6 || inputDouble == 13 || inputDouble == 23){
				
				return inputDouble;
				}else{
					System.out.println("Por favor introduza um valor de IVA de 6, 13 ou 23%.");
				}
			}
			else{
				System.out.println("Por favor introduza um caracter numerico.");
			}
		}
	}
	
	
}




