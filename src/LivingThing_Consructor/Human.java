package LivingThing_Consructor;

public class Human extends LivingthingParent {
 protected String Name;
 protected String address;
 protected  String senseofhumor;
 protected boolean maritalStatus;
 protected String natinality;
 protected String cooking;
 
 public Human()
 {
	super(); 
 }

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getSenseofhumor() {
	return senseofhumor;
}

public void setSenseofhumor(String senseofhumor) {
	this.senseofhumor = senseofhumor;
}

public boolean isMaritalStatus() {
	return maritalStatus;
}

public void setMaritalStatus(boolean maritalStatus) {
	this.maritalStatus = maritalStatus;
}

public String getNatinality() {
	return natinality;
}

public void setNatinality(String natinality) {
	this.natinality = natinality;
}

public String getCooking() {
	return cooking;
}

public void setCooking(String cooking) {
	this.cooking = cooking;
}
 
 
 
 
 
}
