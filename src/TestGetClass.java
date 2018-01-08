import java.lang.reflect.Method;

import com.java.Item;

public class TestGetClass {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		
		Class class1 = Class.forName("com.java.Item");
		
		Item item = (Item)class1.newInstance();
		
		
		
//		Item item1 = new Item(101, "iPhone",200);
//		
//		Class class1 = item1.getClass();
//		
////		System.out.println("Class Name : "+class1.getName());
////		System.out.println();
//		
//		System.out.println(" Methods List: ");
//	
//		Method[] methodArr = class1.getMethods();
//	
//		for (Method method : methodArr) {
//			
//			System.out.println(method.getName());
//		}
	}

}
