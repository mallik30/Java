import java.util.Date;

public class TestAssociations {

	public static void main(String[] args) {
	
		SavingsAccount account = new SavingsAccount(101,5000,"active",1234);
	
		AccountOwner owner = new AccountOwner("Hary", "J", Gender.MALE, new Date(), "hary@mail.com", "23434");
		
		account.accountOwner = owner;	
	
		System.out.println("FirstName : "+account.accountOwner.getFirstName());
		System.out.println("LastName  : "+account.accountOwner.getLastName());
	
	}

}