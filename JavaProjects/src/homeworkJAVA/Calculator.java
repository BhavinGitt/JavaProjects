package homeworkJAVA;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Enter number 1 for addition:  ");
		System.out.println("Enter number 2 for substraction:  ");
		System.out.println("Enter number 3 for multiplication:  ");
		System.out.println("Enter number 4 for division:  ");
	System.out.println("************************************");	
		Scanner input=new Scanner(System.in);
		int cal =input.nextInt();
		
		if (cal>0 && cal <5) {
			System.out.println("Please enter first digit :");
			double num1 =input.nextDouble();
			System.out.println("************************************");	
			System.out.println("Please enter second digit :");
			double num2 =input.nextDouble();
			System.out.println("************************************");	
			
			switch(cal) {
			case 1: 
				System.out.println("your answer for addition :"+(num1+num2));
				break;
			case 2: 
				System.out.println("your answer for substraction :"+(num1-num2));
				break;
			case 3: 
				System.out.println("your answer for multiplication :"+(num1*num2));
				break;
			case 4: 
				System.out.println("your answer for division :"+(num1/num2));
				break;
			default:
				System.out.println("you have Entered Invalid numbers");
				
			}
		}
		else {System.out.println("Invalid Input of operation please, enter the number in between 1 to 4 only!!!");}
	
	
	}
	

}
