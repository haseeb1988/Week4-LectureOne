package banking;

public class SavingAccount {
	private double initialbalace;
	private double currentbalance;
	private double interest;
	private String currency;
	private double tax;
	private int accountid;
	
	public SavingAccount(double balance, double interest)
	{
		this.initialbalace = balance;
		this.interest = interest;
		this.currentbalance = balance;
	}
	
	public double getSavingAccount()
	{
		return this.currentbalance;
	}
	
	public void setDeposite(double amount)
	{
		this.currentbalance = this.currentbalance + amount;
		
	}
	
	public void calculateBalance()
	{
		currentbalance = currentbalance + interest;
	}
	
	public void setWithdraw(double amount)
	{
		this.currentbalance = currentbalance - amount;
	}
	

	
}
