package a5;

public class Cylinder {

	public static void main(String[] args) {
		
		double areaOfCylinder;
		
		Circle circle = new Circle();			
		
		Rectangle rectangle = new Rectangle();
		
		areaOfCylinder = 2 * circle.circleArea(2)+ rectangle.rectangleArea(6, circle.circleCircumference(2));
		
		System.out.println("Area of Cylinder : "+areaOfCylinder);
		
	}
			
		
}

