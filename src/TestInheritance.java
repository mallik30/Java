
public class TestInheritance {

	public static void main(String[] args) {
		
		JuniorSavingsAccount account = new JuniorSavingsAccount(101,5000,"active",1234,"Hary");

		System.out.println("Account No: "+account.accountNo);
		System.out.println("Balance :"+account.getBalance());
		System.out.println("Guardian name: "+account.guardianName);
		
	}

}
