
public class SavingAccount extends Account {
	
	private double interest;
	private int time=0;

	
	
	SavingAccount(double balance, double interest)
	{
		super(balance);
		this.interest = interest;
	}
	
	@Override
	double debit(double m) throws Exception
	{
		if(m<0||m>balance)
		{
			throw new Exception();
		}
		
		if(time>=12)
		{
			balance = balance -m;
			return balance;
		}
		else if(time<12)
		{
			
				throw new Exception();
			
			
		}
			else
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
	@Override
	public double EstimateValue(int month){
		double bok_loan_interest = Math.pow(1+interest,month);
		balance=balance*bok_loan_interest;
		return balance;
	}
	
	public String toString(){
		return String.format("SavingsAccout_Balance: 100.00");
		
	}
}
