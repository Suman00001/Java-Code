package school;

import java.util.Scanner;

public class lepyear {

	public static void main(String[] args) {
		System.out.println("Enter the Year : ");
		Scanner sc = new Scanner(System.in);
		float year= sc.nextFloat();
		float div=year%4;
		float div1=(year%100);
		float div2=(year%400);
		
		if(((div==0)&&(div1!=0))||(div2==0)) {
			
			System.out.println("The Year Is Leapyear");
		}
		else {
			System.out.println("The Year Is  Not Leapyear");
		}
		
	}
} 