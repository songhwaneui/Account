

public class checkingAccount extends Account  {
	private double deposit_limit;
	private double interest;
	private double loan_interest;
	
	
	public checkingAccount(double money,double deposit_limit, double interest, double loan_interest)
	{
		super(money);
		this.deposit_limit=deposit_limit;
		this.interest=interest;
		this.loan_interest=loan_interest;
		
	}
	
	
	@Override
	double debit(double x)
	{
		if(x>deposit_limit)
		{
			System.out.println("한도는 천만원까지입니다.");
		}
		if(money<x&&x<=deposit_limit)
		{
			System.out.println("출금후잔액이 0보다 적습니다.");
			 money=money-x;
			return money;//money=money-x; 왜안되는지 q
		}
		else
		{		
			money=money-x;
			return money;
		}
		
	}
	
	//NextMonth
	public double nextMonth(){
		if(money>0)
		{
			money=money+money*interest;
			return money;
		}
		else
		{
			money=money+money*loan_interest;
			return money;
		}
		
		
	}
		
}
