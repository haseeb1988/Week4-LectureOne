package LivingThing_Abstraction;

public abstract class studentAbstract {
	protected String firstName;
	protected String lastName;
	protected float gpa;
	protected int rollnum;
	
	public abstract void displayInfo();
	public abstract String[] getName();
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public float getGpa() {
		return gpa;
	}
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	public int getRollnum() {
		return rollnum;
	}
	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}

	
	
	
}
