
public class TestSavingsAccount {

	public static void main(String[] args) {

		SavingsAccount account = new SavingsAccount(101,5000,"active",1234);
			
		//method call or method invocation
		account.withdraw(2000,1234);
		
//		account.accountNo = 101;
//		account.balance = 5000;
//		account.status = "active";
//		account.pin = 1234;
	
		account.printDetails();

		System.out.println("Interest Rate : "+SavingsAccount.getInterestrate());
				
		System.out.println();
		SavingsAccount account2 = new SavingsAccount(102,10000,"active",2345);
	
//		account2.accountNo = 102;
//		account2.balance = 10000;
//		account2.status = "active";
//		account2.pin = 2345;
	
		account2.printDetails();

	}

}
