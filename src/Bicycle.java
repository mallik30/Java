
public class Bicycle {
	//fields or instance variables or non-static variables
	int gear;
	int speed;
	int cadence;
	String name;
	
	void changeCadence(int newValue) {
		cadence = newValue;
		speed = speed + 2;
	}
	
	void changeGear(int newValue) {
		gear = newValue;
		
	}
	
	void applyBrakes(int decrement) {
		speed = speed-decrement;
	}
	
	void printDetails() {
		System.out.println("Name : "+name+"\nSpeed : "+speed+"\nGear : "+gear+"\nCadence : "+cadence);
	}

}
