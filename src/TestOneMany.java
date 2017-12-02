import com.java.Bid;
import com.java.Item;

public class TestOneMany {

	public static void main(String[] args) {
		
		Item item = new Item(101,"iPhone",200);
		
		Bid[] bidsArray = new Bid[3];	
	
		bidsArray[0] = new Bid(99901,210);
		bidsArray[1] = new Bid(99902,240);
		bidsArray[2] = new Bid(99903,205);
		
		item.setBids(bidsArray);
		
		for (Bid bid : bidsArray) {
			System.out.println("BidId     : "+bid.getId());
			System.out.println("BidAmount : "+bid.getBidAmount());
			System.out.println();
			
		}
		
	}

}
