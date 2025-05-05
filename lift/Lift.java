package lift;

public class Lift {
	
	private int liftId;
	private int currentPosition=0;
	
	void setLiftId(int liftId) {
		this.liftId = liftId;
	}
	
	void setCurrentPosition(int currentPostion) {
		this.currentPosition = currentPostion;
	}
	
	int getLiftId() {
		return liftId;
	}
	int getCurrentPosition() {
		return currentPosition;
	}
	
	
	
}