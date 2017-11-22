package Task;

public class OrderObject {

	String orderName;    // properties
	int orderNumber; 
	String customerName; //yes , sorry i forgot to add address,, okay
	double orderPrice;	
	int pin;
	
	
	public OrderObject(String orderName, int orderNumber, String customerName, double orderPrice, int pin) {
		this.orderName = orderName;
		this.orderNumber = orderNumber;
		this.customerName = customerName;
		this.orderPrice = orderPrice;
		this.pin = pin;
	}

	
	void printDetails() {
		
		System.out.println("Order Name : "+this.orderName+ "\nOrderNumber : "+this.orderNumber+ "\nCustomer Name : "+this.customerName);
		
	}
	//method(int)
	void cashPayment(double cash) {
		
		if(cash >= this.orderPrice) {
		
			this.orderPrice = cash - this.orderPrice;
			
			System.out.println("Cash Payment Successful!");
			
			System.out.println("Cash returned " + this.orderPrice + " Thank You for Shopping "+this.customerName);
			
		}else {
			
			System.err.println("Insufficient Cash");
			
		}	
	}
	//method(int,int)				//method overloading
	void ccPayment(int pin, int balance) {
		
		if(this.pin == pin) {	
			
			System.out.println("Credit card Payment Successful!");
			
			System.out.println("Thank you for Shopping " + this.customerName);
			
		}else {
			
			System.err.println("Invalid Pin");
			
		}
	}
	//method(int)
	void ccPayment(int balance) {
		
		if(this.orderPrice <= balance) {
			
			System.out.println("Credit card Payment Processing");
			
			ccPayment(pin,balance);
			
		}else {
		
			System.err.println(" No sufficient funds");
			
		}				
	}	
}
