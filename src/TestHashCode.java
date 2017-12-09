import com.java.Item;

public class TestHashCode {

	public static void main(String[] args) {

		String s1 = new String("Good Morning");
		String s2 = new String("Good Morning");
		
		System.out.println(s1 == s2);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
//		Item item1 = new Item(101, "iPhone", 200);
//		Item item2 = new Item(101, "iPhone", 200);
//		
//		System.out.println(item1.hashCode());
//		System.out.println(item2.hashCode());

	}

}
