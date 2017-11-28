package a5;

public class Circle {
	
	double area;
	double circumference;
	
	public double circleArea(int r) {
			
		area = Math.PI * r * r;
		
		return area;
		
	}
	
	public double circleCircumference(int r) {
		
		circumference = 2 * Math.PI * r;
		
		return circumference;
	
	}

}
