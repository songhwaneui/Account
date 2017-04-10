
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
			System.out.println("���� �ѵ���150�������� �Դϴ�.");
			return 0;
		}
		
		else if (balance <m2 && m2<=balance+deposit_limit)
		{
			System.out.println("����� �ܾ��� 0���� �����");
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
		//�������� = ����*Math.pow(1+interest,time)

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
		//�������� = ����*Math.pow(1+interest,time)

		 balance = balance*bok_loan_interest;
		return balance;
	}
	
	public String toString(){
		return String.format("CheckingAccout_Balance: 100.00");
		
	}
	
	
	
	
}
