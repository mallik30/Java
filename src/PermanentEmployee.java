import java.util.Date;

public class PermanentEmployee extends Employee{

	Date dateOfJoining;
	
	@Override
	public void calculateSalary() {
	
		System.out.println("Contract Employee : calculateSalary()");
		
	}
}
