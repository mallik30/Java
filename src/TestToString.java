import java.lang.reflect.Method;

import com.java.Item;

public class TestToString {

	public static void main(String[] args) {
		
//		String s1 = new String("Hello World");
//		
//		System.out.println(s1.toString());
//		
		Item item1 = new Item(101, "iPhone",200);
		
//		System.out.println(item1.toString()); //both prints same values
		System.out.println(item1);	//both prints same values

		
	}

}
