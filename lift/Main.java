package lift;

import java.util.Scanner;

public class Main {
	public static void main(String[] aa) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter user-name : ");
		String name = sc.nextLine();
		
		User u1 = new User();
		u1.setName(name);
		u1.liftCreate();
		u1.liftSystem();
		System.out.println();
		u1.alLiftPositions();
		
	}

}
