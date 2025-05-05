package calculator;

public class Main {

	public static void main(String[] args) throws CalculatorException {
		// TODO Auto-generated method stub
		
		Calculator c = new Calculator();
		try {
		c.system();
		}
		catch(Exception e){
			System.err.println(e.getMessage());
			
		}
	}

}
