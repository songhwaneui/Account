
public abstract class Account {
	
	protected double balance;
	
	Account(double money){
		this.balance=money;
	}

	double getBalance()
	{
		return balance;
	}
	
	double credit(double m)
	{
		balance = balance+m;
		return balance;
	}
	
	
	double debit(double m2)
	{
		balance = balance-m2;
		return balance;
	}
	
	public abstract double getWithdrawableAccount();
	
	public abstract void passTime(int time);
	
}
