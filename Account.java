
public class Account
{
	
	protected double money;
	
	public Account (double money)	
	{
		this.money=money;
	}
	
	//잔액확인
	public double getBalance()
	{
		return money;
	}
	
	//잔액수정
	
	
	
	//입급
	double credit(double x)
	{
		money = money +x;
		return money;
	}
	
	

	//출금
	double debit(double y)
	{
		if(money<y)
		{
			System.out.println("Debit amount exceeded account balance");
			return 0;
		}
		else
		{		
			money=money-y;
			return money;
		}
		
		
	}
	
	

	
}
