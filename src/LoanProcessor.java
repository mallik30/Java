
public class LoanProcessor {

	public void processLoan(SavingsAccount account) {
		System.out.println("AccountNo : "+account.accountNo);
	
	    System.out.println("Loan processed successfully..");
	    
	    account.withdraw(100);
	    
	    System.out.println("processing fee deducted");
	    
	    account.deposit(20000);
	    
	    System.out.println("Loan amount credited");
	}
	
	
}
