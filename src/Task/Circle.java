package Task;

public class Circle {
	int radius;
	double circleArea;
	double circumference;
	
	public void area(int r) {
		
		radius =r;
		
		circleArea = Math.PI * r * r;
		
//		System.out.println("Area of the Circle: "+circleArea );
		
	}
	
	public void circumference(int r) {
		radius =r;
		
		circumference = 2 * Math.PI * r;
		
//		System.out.println("Circumference of the circle: "+circumference);
	
	}

}
