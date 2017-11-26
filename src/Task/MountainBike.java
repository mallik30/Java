package Task;

public class MountainBike extends Bicycle{

	public int seatHeight;

	public MountainBike(int gear, int speed, int cadence, String name, int seatHeight) {
		super(gear, speed, cadence, name);
		this.seatHeight = seatHeight;
	}
	
	public void printDetails() {
		
	System.out.println("Name : "+name+ "\nSpeed : "+ speed+ "\nGear : "+gear+"\nCadence : "+cadence);	
		
	}
	
	public void setHeight(int newValue) {
		seatHeight = newValue;
	}
	
	
	
}
