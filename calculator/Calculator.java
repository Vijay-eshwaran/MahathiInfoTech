package calculator;

import java.util.*;

class CalculatorException extends Exception {
	
	CalculatorException(String e){
		super(e);
	}

}

public class Calculator {
	
	Scanner sc = new Scanner(System.in);
	
	ArrayList<Integer> values = new ArrayList<>();
	
	void system() throws CalculatorException {
		
		int ch;
		
		do {
			System.out.println("========================================================");
			System.out.println("========================================================");
			System.out.print("CALCULATOR SYSTEM\n1.ADD\n2.SUBRACT\n3.DIVIDE\n4.MULTIPLY\nEnter option : ");
			if(sc.hasNextInt()) {
				ch = sc.nextInt();
				sc.nextLine();
			}
			else {
				throw new CalculatorException("Mismatch Exception");
			}
			
			
			
			System.out.print("Enter no of values ( or enter 'back' to go back to opration) : ");
			String n = sc.nextLine();
			
			if(n.equalsIgnoreCase("back")) {
				continue;
			}
			

			for(int i=0;i<Integer.parseInt(n);i++) {
				
				System.out.print("value "+(i+1)+" : ");
				values.add(sc.nextInt());
				
			}
			System.out.println("========================================================");
			switch(ch) {
			
			case 1 :
				add();
				break;
			case 2:
				subract();
				break;
			case 3:
				divide();
				break;
			case 4:
				multiply();
				break;
				
			}
			System.out.println("========================================================");
			System.out.println("Do u want to Continue \nenter '1' (yes)\nenter '0' (no) \n:- ");
			if(sc.hasNextInt()) {
				ch = sc.nextInt();
			}
			else {
				throw new CalculatorException("Mismatch value");
			}
			
			
			if(ch == 1) {
				
			}
			else if(ch == 0){
				System.out.println("THANK YOU");
				System.out.println("========================================================");
				System.out.println("========================================================");
				break;
			}
			else {
				throw new CalculatorException("Invalid option");
			}
		
		
		}while(true);
		
		
	}

	private void add() {
		
		int sum=values.get(0);
		
		for(int i=1;i<values.size();i++) {
			sum+=values.get(i);
		}
		System.out.println("Add result : "+ sum );
		
		System.out.println("========================================================");
		
		
	}
	private void subract() {
		
		int sum=values.get(0);
		
		for(int i=1;i<values.size();i++) {
			sum-=values.get(i);
		}
		System.out.println("Subract result : "+ sum );
		System.out.println("========================================================");
		
		
	}
	private void multiply() {
	
		int sum=values.get(0);
		
		for(int i=1;i<values.size();i++) {
			sum*=values.get(i);
		}
		System.out.println("Multiply result : "+ sum );
		System.out.println("========================================================");
	
	
}
	private void divide() {
	
		int sum=values.get(0);
		
		for(int i=1;i<values.size();i++) {
			sum/=values.get(i);
		}
		System.out.println("Divide result : "+ sum );
		System.out.println("========================================================");
	
	
}

}
