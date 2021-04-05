package LivingThing_Consructor;

public class dog extends Animals {
	
	private String dogType;
	private String dogownername;
	private String size;
	
	public dog(String dogownerName)
	{
		this.dogownername = dogownerName;
	}
	public dog(String dogType, String dogownername, String size) {
		super();
		this.dogType = dogType;
		this.dogownername = dogownername;
		this.size = size;
	}
	
	
	public String getDogType() {
		return dogType;
	}
	public void setDogType(String dogType) {
		this.dogType = dogType;
	}
	public String getDogownername() {
		return dogownername;
	}
	public void setDogownername(String dogownername) {
		this.dogownername = dogownername;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	
	
	
	

}
