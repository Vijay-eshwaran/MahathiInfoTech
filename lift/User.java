package lift;
import java.util.*;

public class User {
	Scanner sc = new Scanner(System.in);
	
	LiftImplemention liftSystem = new LiftImplemention();
	ArrayList<Lift> lifts = new ArrayList<>();
	
	private String name;
	
	void setName(String name){
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	void liftCreate() {
		System.out.println("Enter no of Lift : ");
		int liftCount = sc.nextInt();
		
		
		
		for(int i=0;i<liftCount;i++) {
			System.out.println("Enter Lift ID : ");
			int liftId = sc.nextInt();
			
			lifts.add(new Lift());
			
			lifts.get(i).setLiftId(liftId);
		}
		sc.nextLine();
	}
	

	void alLiftPositions() {
		
		System.out.println("");
		for(Lift lift : lifts) {
			liftSystem.liftCurrentFloors(lift);
		}
	}
	
	void liftSystem() {
		
		
		while(true) {
			System.out.println(getName()+" is using the lift");
			System.out.print("Enter Lift System (Y/N) : ");
			char ch = sc.nextLine().charAt(0);
			
			if(ch == 'Y' || ch == 'y') {
				System.out.println("Enter Current floor : ");
				int curFloor = sc.nextInt();
				System.out.println("Enter Destination floor : ");
				int desFloor = sc.nextInt();
				
				
				System.out.println("Choose Lift ID : ");
				int liftId = sc.nextInt();
				
				for(Lift lift : lifts) {
					if(lift.getLiftId() == liftId) {
						
						liftSystem.move(lift, desFloor, curFloor);
						
					}
				}
			}
			else if(ch == 'N' || ch == 'n') {
				System.out.println("Thank you, "+getName());
				break;
			}
			else {
				System.out.println("Invalid input");
			}
			sc.nextLine();
	
		}
				
	}
}
