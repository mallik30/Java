
public class TestEncapsulation {

	public static void main(String[] args) {

		SavingsAccount account = new SavingsAccount(101,5000,"active",1234);
		
		System.out.println("Balance : "+account.getBalance());	

	}

}
