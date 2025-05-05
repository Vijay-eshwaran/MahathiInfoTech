package lift;

import java.util.*;

public class Main {
	public static void main(String[] aa) {

		Scanner sc = new Scanner(System.in);
        HashMap<String, User> users = new HashMap<>();

        while (true) {
            System.out.print("Enter user-name (or type 'exit' to quit): ");
            String name = sc.nextLine().trim();

            if (name.equalsIgnoreCase("exit")) {
                System.out.println("Exiting lift system...");
                break;
            }

            User user;
            if (users.containsKey(name)) {
                user = users.get(name);
                System.out.println("Welcome back, " + name + "!");
            } else {
                user = new User();
                user.setName(name);
                
                users.put(name, user);
                System.out.println("New user created: " + name);
            }
            user.liftCreate();
            user.liftSystem();
            user.alLiftPositions();

            System.out.println("-------------------------------\n");
        }
		
	}

}
