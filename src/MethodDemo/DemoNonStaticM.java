package MethodDemo;

public class DemoNonStaticM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Static method in java is a method which is belong to the class (when a class is instantiated)
 * and not to the object(new instance).
 * 
 * Static method can access only static data(method or variable) and can not call a non-static data from it
 * 
 * static method can be accessed directly by the class name and does not need any object
 * 
 */
		DemoNonStaticM.mymethod();
		DemoNonStaticM obj = new DemoNonStaticM();
		
		
	}
	
	
 private static void mymethod()
 {
	 System.out.println("hello java");
 }
 
public static int addnumber()
{
	int c = 5 + 6;
	return c;
}

public static int addnumber(int a , int b)
{
	int c = a + b;
	return c;
}
 
 public  void mymethod_two()
 {
	 System.out.println("hello java");
 }

}
