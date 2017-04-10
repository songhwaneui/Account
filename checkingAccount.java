
public class checkingAccount extends Account{
	
	private double deposit_limit;
	private double interest;
	private double loan_interest;
	double result;
	
	checkingAccount(double balance,double deposit_limit, double interest, double loan_interest){
		super(balance);
		this.deposit_limit = deposit_limit;
		this.interest = interest;
		this.loan_interest=loan_interest;
		
	}

	@Override
	double debit(double m2) 
	{
		if(m2>balance+deposit_limit)
		{
			System.out.println("대출 한도는150만원까지 입니다.");
			return 0;
		}
		
		else if (balance <m2 && m2<=balance+deposit_limit)
		{
			System.out.println("출금후 잔액이 0보다 적어요");
			balance = balance - m2;
			return balance;
		}
		
		else
		{
			balance = balance - m2;
			return m2;
		}
		
	}
	
	@Override
	public double getWithdrawableAccount(){
		result= balance + deposit_limit;
		if(result<0)
			result =0;
		 return result;
	}
	
	@Override
	public void passTime(int time){
		
		double bok_loan_interest = Math.pow(1+loan_interest,time);
		//복리이자 = 원금*Math.pow(1+interest,time)

		 balance = balance*bok_loan_interest;
	}
	

	public boolean isBankrupted(){
		if(result<=0)
			return true;
		else
		return false;
	}
	
	
	public double nextMonth(){
		if(balance>0)
		{
			balance=balance+balance*interest;
			return balance;
		}
		else
		{
			balance=balance+balance*loan_interest;
			return balance;
		}
		
		
	}
	
	@Override
	public double EstimateValue(int month){

		double bok_loan_interest = Math.pow(1+loan_interest,month);
		//복리이자 = 원금*Math.pow(1+interest,time)

		 balance = balance*bok_loan_interest;
		return balance;
	}
	
	public String toString(){
		return String.format("CheckingAccout_Balance: 100.00");
		
	}
	
	
	
	
}
