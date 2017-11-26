package Task;

public class Bicycle {

	int gear;
	int speed;
	int cadence;
	String name;
	
	
	
	public Bicycle(int gear, int speed, int cadence, String name) {
		super();
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
	
	public void printDetails() {
		System.out.println("Name : "+name+"\nSpeed : "+speed+"\nGear : "+gear+"\nCadence : "+cadence);
	}

	
}
