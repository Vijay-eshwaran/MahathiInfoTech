package lift;

public interface LiftServices {

	abstract void move(Lift obj, int des, int cur);
	abstract void liftCurrentFloors(Lift obj);
}
