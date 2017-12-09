import com.java.Item;

public class TestEquals {

	public static void main(String[] args) {
		
//		Item item1 = new Item(101, "iPhone", 200);
//		Item item2 = new Item(101, "iPhone", 200);
//	
//		System.out.println(item1 == item2);

		// output: false 
		//'==' is same as equals
		
//		String s1 = new String("Good Morning");
//		String s2 = new String("Good Morning");
//	
//		System.out.println(s1.equals(s2));
		
		// output: true
		
		Item item1 = new Item(101, "iPhone", 200);
		Item item2 = new Item(101, "iPhone", 200);
		Item item3 = new Item(101, "iPhone", 200); //checking rule 3
	
		System.out.println(item1.equals(item2));
		
		// output will be false
		//it will become true after adding overriding method in item class
		
		//Rules of "equals"

		System.out.println("Rule 1: reflexive");
		System.out.println(item1.equals(item1));
		
		System.out.println("Rule 2: symmetric");
		System.out.println(item1.equals(item2));
		System.out.println(item2.equals(item1));
		
		System.out.println("Rule 3: transitive");
		System.out.println(item1.equals(item2));
		System.out.println(item2.equals(item3));
		System.out.println(item1.equals(item3));
		
		System.out.println("Rule 4: consistent");
		System.out.println(item1.equals(item2));
		System.out.println(item1.equals(item2));
		System.out.println(item1.equals(item2));
		
		System.out.println("Rule 5: ");
		System.out.println(item1.equals(null));
		
	}

}
