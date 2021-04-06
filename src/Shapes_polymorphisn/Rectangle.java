package Shapes_polymorphisn;

public class Rectangle extends Shapes {
	private double width;
	private double height;
	
	public Rectangle(double w, double h) 
	{
		this.height = h;
		this.width = w;
	}
	
	@Override
	public double getArea()
	{
		double area =  width * height;
		return area;
	}
}
