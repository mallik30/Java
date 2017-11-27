package a3;

public class Bicycle {

	int gear;
	int speed;
	int cadence;
	String name;
	
	
	
	public Bicycle(int gear, int speed, int cadence, String name) {
		this.gear = gear;
		this.speed = speed;
		this.cadence = cadence;
		this.name = name;
	}

	void changeCadence(int newValue) {
		cadence = newValue;

	}
	
	public void changeGear(int newValue) {
		gear = newValue;
		
	}
	
	public void applyBrakes(int decrement) {
		speed = speed-decrement;
	}

	
}
