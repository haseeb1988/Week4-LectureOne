package LivingThing_Consructor;

public class Livingthing_MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 dog d = new dog("Dyln Power");
		 System.out.print(d.getDogownername());
		
		
		 d.setDogType("Corgi");
		 
		 System.out.println(" is a owner of " + d.getDogType());
		 
		 LivingthingParent l = new LivingthingParent();  
		 Animals an = new Animals();
		 Human hu = new Human();
		
		 
		 l.communcate();
		 an.communcate();
		 hu.communcate();
		 d.communcate();
		 

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Animals an = new Animals();
//		
//		Animals ans = new Animals("lion");
//       System.out.println("Default value "+ans.getAnimalName());
//		
//        ans.setAnimalname("Cat");
//		
//         System.out.println("After set value "+ans.getAnimalName());
//		
//		
//		
//		
//		
//		Animals ans_three = new Animals("lion", "Carniwores");
//		
//		
//		
  //  String Name = 	an.getAnimalName();
    //System.out.println(Name);
	
	}

}
