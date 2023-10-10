package school;
import java.util.Scanner;


public class pass_fail {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Number Mathematics: ");
			float number1 = sc.nextFloat();
			System.out.println("Enter the Second Number Physics: ");
			float number2 = sc.nextFloat();
			System.out.println("Enter the Second Number Chemistry: ");
			float number3 = sc.nextFloat();
			
			float reasult=(number1+number2+number3)/3;
			
			if(number1>25) {
				if(number2>25) {
					
				}
				if(number3>25) {
					
				}
			
			System.out.println("Your are Pass");
			}
			else{
				System.out.println("Your are Fail");
			}
			System.out.println("Your percentage is : "+reasult);
		}


	}
}