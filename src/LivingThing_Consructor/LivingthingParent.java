package LivingThing_Consructor;

public class LivingthingParent {
	
	protected String eat;
	protected int height;
	protected float weight = 0.0f;
	protected String walk;
	protected int age;
	protected boolean cansee ;
	protected String communcate;
	protected boolean feeling;
	protected int legs;
	
	public LivingthingParent()
	{
		
	}
	public LivingthingParent(String eat, int height, String walk, int age, boolean cansee, String communcate,
			boolean feeling, int legs) {
	
		this.eat = eat;
		this.height = height;
		this.walk = walk;
		this.age = age;
		this.cansee = cansee;
		this.communcate = communcate;
		this.feeling = feeling;
		this.legs = legs;
		
	}

	public String getEat() {
		return eat;
	}

	public void setEat(String eat) {
		this.eat = eat;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getWalk() {
		return walk;
	}

	public void setWalk(String walk) {
		this.walk = walk;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isCansee() {
		return cansee;
	}

	public void setCansee(boolean cansee) {
		this.cansee = cansee;
	}

	public String getCommuncate() {
		return communcate;
	}

	public void setCommuncate(String communcate) {
		this.communcate = communcate;
	}

	public boolean isFeeling() {
		return feeling;
	}

	public void setFeeling(boolean feeling) {
		this.feeling = feeling;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	
	
	
}
