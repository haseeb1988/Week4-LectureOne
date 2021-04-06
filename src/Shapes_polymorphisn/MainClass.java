package Shapes_polymorphisn;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes s = new Shapes();
		Circle c = new Circle(5);
		Rectangle r = new Rectangle(6, 8);
		
		
		System.out.println(s.getArea());
		System.out.println(c.getArea());
		System.out.println(r.getArea());
		
		
	}

}
