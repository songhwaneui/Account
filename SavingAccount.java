
public class SavingAccount extends Account {
	
	private double interest;
	private   static int time=0;

	
	
	SavingAccount(double balance, double interest)
	{
		super(balance);
		this.interest = interest;
	}
	
	@Override
	double debit(double m)
	{
		if(time>12)
		{
			balance = balance -m;
			return balance;
		}else
		{
			System.out.println("아직 출금할수 없습니다.");
			return 0;
		}

	}
	
	@Override
	public double getWithdrawableAccount(){
		if(time<12)
			return 0;
		else
			return balance;
		
	}
	
	@Override
	public void passTime(int t){
		time=time+t;
		if(time==12)
		{
		double bok_loan_interest = Math.pow(1+interest,time);
		balance=balance*bok_loan_interest;
		}
	}
	

}
