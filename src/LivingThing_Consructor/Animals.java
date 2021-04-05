package LivingThing_Consructor;

public class Animals extends LivingthingParent {
	
	protected String AnimalType = "unknown";
	//private int height = 6;
//	private String color = "unknown";
//	private float weight = 0.0f;
	protected float lifeexp = 0.0f;
	protected String zone = "world";
	//private String eat = "food";
	protected static String Zoo = "USA";
	protected String Animalowner = "unknown";
	protected String color;
	private String AnimalName;
	
	public Animals()
	{
		super();
	}
	public Animals(String animalName)
	{
		this.AnimalName = animalName;
	}
	public Animals(String animalName, String AnimalType)
	{
		
	}
	
	public String getAnimalName() // getter
	{
		//String AnimalName = "Cat";
		return this.AnimalName;
	}
	
	public void setAnimalname(String animalName)
	{
	 	this.AnimalName = animalName;
	}
	
	public String getAnimalType() // getter
	{
		return this.AnimalType;
	
	}
	
	
}
