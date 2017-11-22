
public class TestObjectBenifits {

	public static void main(String[] args) {
		
		SavingsAccount account = new SavingsAccount(101,5000,"active",1234);
		
		LoanProcessor loanProcessor = new LoanProcessor();
		
		loanProcessor.processLoan(account);
		
		System.out.println("final balance : "+account.getBalance());
		
	}

}
