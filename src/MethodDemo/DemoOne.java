package MethodDemo;

public class DemoOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoOne obj = new DemoOne();
		System.out.println(obj.addNumbers());
		obj.displayMyName();
		 int abc =   obj.addNumbers(100, 200, 300);
		//System.out.println(obj.addNumbers(100, 200));
		  System.out.println(abc);
		  int[] myarray = {1,5,6,7,44,11,55,99,77,4,22,5,6,3,10};
		  int toFind = 101;
		  
		  obj.findElementFromArray(myarray, toFind);
	}
	
	
	void findElementFromArray(int[] num, int toFind)
	{
		 boolean found = false;

		   
		    for(int n = 0; n < num.length; n++  ) {
		      if (num[n] == toFind) {
		        found = true;
		        break;
		      }
		    }
		    
		    if(found)
		      System.out.println(toFind + " is found.");
		    else
		      System.out.println(toFind + " is not found.");
	}
	
	
	
	
	public int addNumbers()
	{
		int c = 5 + 6;
		return c;
	}
	
	public int addNumbers(int a, int b)
	{
		int c = a + b;
		return c;
	}
	
	public double addNumbers(double a, double b)
	{
		double c = a + b;
		return c;
	}
	
	public int addNumbers(int a, int b, int d)
	{
		int c = a + b + d;
		return c;
	}
	
	public void gotoTheMoon(double dayCount) { 
	
	}
	public int gotoTheMoon(int daycount) {
		
		 int c = 0;
		 return c;
	}

	
	
	
	
	
	public void displayMyName()
	{
		int c = 5 + 10;
		System.out.println(c);
	}
// Method overloading: different parameter data type or different number of parameter  

}
