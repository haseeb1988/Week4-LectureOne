package banking;

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount sav = new SavingAccount(2, 2);
		System.out.println("opening bal: "+sav.getSavingAccount());
		
		sav.setDeposite(4);
		
		System.out.println("After deposite amount: " +sav.getSavingAccount());
		
		sav.calculateBalance();
		
		System.out.println("Total bal: "+sav.getSavingAccount());
		
		sav.setWithdraw(1);
		
		System.out.println(sav.getSavingAccount());
		
		
	}

}
