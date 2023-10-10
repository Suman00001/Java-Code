package school;

import java.util.Random;
import java.util.Scanner;

public class rock_paper_ciger_game {

	public static void main(String[] args) {
		System.out.print("\n\tEnter \"1\"-->\"Rock\";");
		System.out.print("\tEnter\"2\" -->\"Paper\";");
		System.out.println("\tEnter\"3\" -->\"Scissors\"");
	//Take input
		System.out.println("\nYour Turn : ");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		
	//To show More Accurate
		if(input==1) {
			System.out.print("\t(Rock)");
		}
		else if(input==2) { 
			System.out.print("\t(Paper)");
		}
		else if(input==3) {
			System.out.print("\t(Scissors)");
		}
		else {
		System.out.println("\t#!Wrong Key!#");
		
		}
	//Generting Random Number
		
		Random rand=new Random();
		int random=rand.nextInt(3)+1;
		System.out.println("\nComputer's  Turn : "+"\n"+random);
		
	//To show More Accurate
				if(random==1) {
					System.out.println("\t(Rock)");
				}
				if(random==2) {
					System.out.println("\t(Paper)");
				}
				if(random==3) {
					System.out.println("\t(Scissors)");
				}
				
				
	//Main Logic
		
		if(input==1 && random==1 ||input==2 && random==2||input==3 && random==3) {
			System.out.println("\t\t!! Match Draw !!");	
			
		}
		else if(input==1 && random==2||input==2 && random==3||input==3 && random==1) {
			System.out.println("\t\t!! Computer Win !!");	
			
		}
		else if(input==1 && random==3 ||input==2 && random==1||input==3 && random==2) {
			System.out.println("\t\t!! You Win !!");}	
			
			else{
				System.out.println("\t\t!! You Enter Wrong Key !!");
			}
	}
			
//The part did'nt required	,because we use || function there
		
		/*else if(input==2 && random==2) {
			System.out.println("\t\t!! Match Draw !!");	
			
		}
		else if(input==3 && random==3) {
			System.out.println("\t\t!! Match Draw !!");	
			
		}*/
		
		}
		/*else if(input==2 && random==1) {
			System.out.println("\t\t!! You Win !!");	
			
		}
		else if(input==2 && random==3) {
			System.out.println("\t\t!! Computer Win !!");	
			
		}

		else if(input==3 && random==1) {
			System.out.println("\t\t!! Computer Win !!");	
			
		}
		else if(input==3 && random==2) {
			System.out.println("\t\t!! You Win !!");	
			
		}*/
		
		

