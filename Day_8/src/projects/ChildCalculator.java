package projects;

import java.util.Scanner;

public class ChildCalculator extends Calculator{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner calc = new Scanner(System.in);
		System.out.print("Please select an operation from the following: 1 for add, 2 for subtract, 3 for multiply, 4 for divide. ");
		int choice = calc.nextInt();
		
		ChildCalculator select = new ChildCalculator();
		
		if (choice == 1){
			select.add();
		}
		
		else if (choice == 2){
			select.subtract();
		}
		
		else if (choice == 3){
			select.multiply();
		}
		
		else if (choice == 4){
			select.divide();
		}
		
		else {
			
		}
		
	}

}
