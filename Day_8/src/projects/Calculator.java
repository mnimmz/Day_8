package projects;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}
	
	public void add(){
		Scanner input = new Scanner(System.in);
		System.out.println(" ");
		System.out.print("Enter a number: ");
		int add1 = input.nextInt();
		
		System.out.println(" ");
		System.out.print("Enter a second number: ");
		int add2 = input.nextInt();
		
		System.out.println(" ");
		System.out.print("Results: ");
		System.out.print(add1 + add2);
	}
	
	public void subtract(){
		Scanner input = new Scanner(System.in);
		System.out.println(" ");
		System.out.print("Enter a number: ");
		int sub1 = input.nextInt();
		
		System.out.println(" ");
		System.out.print("Enter a second number: ");
		int sub2 = input.nextInt();
		
		System.out.println(" ");
		System.out.print("Results: ");
		System.out.print(sub1 - sub2);
	}
	
	public void multiply(){
		Scanner input = new Scanner(System.in);
		System.out.println(" ");
		System.out.print("Enter a number: ");
		int multi1 = input.nextInt();
		
		System.out.println(" ");
		System.out.print("Enter a second number: ");
		int multi2 = input.nextInt();
		
		System.out.println(" ");
		System.out.print("Results: ");
		System.out.print(multi1 * multi2);
	}
	
	public void divide(){
		Scanner input = new Scanner(System.in);
		System.out.println(" ");
		System.out.print("Enter a number: ");
		int divide1 = input.nextInt();
		
		System.out.println(" ");
		System.out.print("Enter a second number: ");
		int divide2 = input.nextInt();
		
		System.out.println(" ");
		System.out.print("Results: ");
		System.out.print(divide1 / divide2);
	}

}
