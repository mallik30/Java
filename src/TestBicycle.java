
public class TestBicycle {

	public static void main(String[] args) {
		
		Bicycle bicycle = new Bicycle();
	
		
	
		bicycle.changeGear(2);
		bicycle.changeCadence(10);
		bicycle.name="Hero";
		
		bicycle.printDetails();
		
		System.out.println();
		
		Bicycle bicycle2 = new Bicycle();
		
		bicycle2.changeGear(3);
		bicycle2.changeCadence(20);
		bicycle2.name="Phenix";
		
		bicycle2.printDetails();
	
	
	}

}
 