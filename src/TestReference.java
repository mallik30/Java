
public class TestReference {

	public static void main(String[] args) {
	
		SavingsAccount account = new JuniorSavingsAccount(101,5000,"active",1234,"Hary");
		
		account.withdraw(2000,1234);
		
		JuniorSavingsAccount juniorSavingsAccount = (JuniorSavingsAccount)account;
		
		
		
		
	}

}
