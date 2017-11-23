
abstract public class Employee {

	int id;
	String name;
	String designation;
	String email;
	Gender gender;
	
	abstract public void calculateSalary();
	
	public void getDetails() {
		
		System.out.println("Id :"+id);
		System.out.println("Name :"+name);
		System.out.println("Email :"+email);
		
		
	}
	
}
