package lift;

import java.util.Scanner;

public class LiftImplemention implements LiftServices{
	
	
	
	@Override
	public void move(Lift obj, int des,int cur) {
		
		
		if(des == cur) {
			
			System.out.println("Lift "+obj.getLiftId()+" : "+" at "+obj.getCurrentPosition());
			if(!(cur == obj.getCurrentPosition())) {
				System.out.println("Lift "+obj.getLiftId()+" : "+" moving from "+obj.getCurrentPosition()+" To "+cur);
				obj.setCurrentPosition(cur);
				System.out.println("Lift "+obj.getLiftId()+" : "+" at "+obj.getCurrentPosition());
			}
			else {
				System.out.println("Lift "+obj.getLiftId()+" : "+"Already at "+cur);
			}
			
			System.out.println("Same Floor");
			return;
		}
		
		System.out.println("Lift "+obj.getLiftId()+" : "+" at "+obj.getCurrentPosition());
		
		if(!(cur == obj.getCurrentPosition())) {
			System.out.println("Lift "+obj.getLiftId()+" : "+" moving from "+obj.getCurrentPosition()+" To "+cur);
			obj.setCurrentPosition(cur);
			System.out.println("Lift "+obj.getLiftId()+" : "+" at "+obj.getCurrentPosition());
		}
		else {
			System.out.println("Lift "+obj.getLiftId()+" : "+"Already at "+cur);
		}
		
		
		
		
		System.out.println("Lift "+obj.getLiftId()+" : "+" moving from "+obj.getCurrentPosition()+" To "+des);
		
		System.out.println("Lift "+obj.getLiftId()+" : "+" Reached Destination at "+des);
		
		obj.setCurrentPosition(des);
		
		
	}

	@Override
	public void liftCurrentFloors(Lift obj) {
		
		System.out.println("Lift "+obj.getLiftId()+" is in "+obj.getCurrentPosition());
		
	}

	
}
