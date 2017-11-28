package a5;

public class Rectangle extends Circle{

	double areaOfRectangle;
	
	public double rectangleArea(int height, double circumference) {
		
		areaOfRectangle = height * circumference;
		
		return areaOfRectangle;
		
	}
	
}
