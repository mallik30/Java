public class JuniorSavingsAccount extends SavingsAccount{

	String guardianName;

	//parameterized constructor
	public JuniorSavingsAccount(int accountNo, float balance, String status, int pin, String guardianName) {
		super(accountNo, balance, status, pin);
		this.guardianName = guardianName;
	}
	
	void printDetails () {		
		System.out.println("Account No: "+accountNo);
		System.out.println("Balance : "+balance);
	}
	
	@Override
	public void withdraw(int withdrawalAmount, int pin) {
		if (this.pin == pin) {
			
			if(withdrawalAmount <= 10000) {
				
				withdraw(withdrawalAmount);
				
			}else {
				System.err.println("Withdrawal limit exceeded");
			}
			
		}else {			
			System.err.println("invalid Pin");
		}	
		
	
	}
	
}
