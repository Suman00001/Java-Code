package school;

import java.util.Scanner;

public class StarPaternPrint {

	public static void main(String[] args) {
		System.out.println("How many line do you want?");
		Scanner sc= new Scanner(System.in);
		int input=sc.nextInt();
	// 1st Case (Normal Star Print)
		System.out.println("Case 1 : ");
		for (int i = 1; i<=input; i++) {
		
			for (int j = 1; j<=i; j++) {
				
				System.out.print("*");
			
			}
			System.out.println();
		}
		
	// 2nd Case (Normal Star Print with space)
		System.out.println("Case 2 : ");
	for (int i = 1; i<=input; i++) {
		
		for (int j = 1; j<=i; j++) {
			
			System.out.print(" * ");
		
		}
		System.out.println();
	}
	
	
	// 3rd Case (Reverse Star Print)
	System.out.println("Case 3 : ");
	
	for (int i =1 ; i<=input; i++) {
		
		for (int j = input; j>=i; j--) {
			
			System.out.print(" * ");
		
		}
		System.out.println(" ");
	}

	
	//4th case (Bothside Star Print)
	System.out.println("Case 4 : ");
	
	for (int i = 1; i<=input; i++) {
		
		for (int j = 1; j<=i; j++) {
			
			System.out.print(" * ");
		
		}
		System.out.println();
	}
	//for middle line
	for(int i=0;i<=input;i++) {
	System.out.print(" * ");
	}
	
	System.out.println();
	
	for (int i =1 ; i<=input; i++) {
		
		for (int j = input; j>=i; j--) {
			
			System.out.print(" * ");
		
		}
		System.out.println(" ");
	}
	
	
	}
}
