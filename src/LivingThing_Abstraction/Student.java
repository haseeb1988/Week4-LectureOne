package LivingThing_Abstraction;

public class Student extends studentAbstract  implements collage {
    private  String ProgramName = "Java Deve";
	
    @Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("Hi my name is " + super.firstName + " " + super.lastName);
		System.out.println("My roll number is " + super.rollnum);
		System.out.println("i got " + super.gpa + "gpa");
		System.out.println(this.ProgramName);
	}

	@Override
	public String[] getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCourseName() {
		// TODO Auto-generated method stub
		System.out.println("Java Dev");
	}

	@Override
	public void setInstructorName() {
		// TODO Auto-generated method stub
		System.out.println("haseeb");
	}

	@Override
	public void setIAName() {
		// TODO Auto-generated method stub
		System.out.println("Jenny");
	}

	@Override
	public void setcourseDuration() {
		// TODO Auto-generated method stub
		System.out.println("14 week");
	}

	@Override
	public void setProgramOffer() {
		// TODO Auto-generated method stub
		System.out.println("by TekSystem");
	}
	
	public void displaycollage()
	{
		 System.out.println(collage); 
	}
	

}
