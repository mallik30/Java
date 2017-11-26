package Task;

public class Cylinder extends Circle{

	double areaOfCylinder;
	int height;
	double circleArea;
	
		
	public Cylinder(double areaOfCylinder, int height, double circleArea) {
		super();
		this.areaOfCylinder = areaOfCylinder;
		this.height = height;
		this.circleArea = circleArea;
	}

	@Override
	public void area(int r) {
		// TODO Auto-generated method stub
		super.area(r);
	}

	@Override
	public void circumference(int r) {
		// TODO Auto-generated method stub
		super.circumference(r);
	}

	public void cylinderArea(int r,int h) {
		
		//areaOfCylinder = 2 * Math.PI * r * r + h * 2 * Math.PI * r; 
		height = h;
			
		areaOfCylinder = 2 * circleArea + h *circumference;
		
		System.out.println("Area of Cylinder: "+areaOfCylinder);		
		
	}
}
