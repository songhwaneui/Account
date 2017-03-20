import java.util.Scanner;



public class Account
{
	
	private double money;
	
	public Account() {					
	}
	public Account(double money) {		
		this.money = money; 
	}
	public void credit(double money) {			
		this.money += money;
	}
	
	public void debit(double minus) {				
		if (money < minus) {
			System.out.println("Debit amount exceeded account balance.");
		}
		else {
			money -= minus;
		}
	}
	/*
	public void debit() {				//(�씤異�)
		//System.out.println("");		//(�겢�옒�뒪 �씠由� �꽆湲곕뒗 諛⑸쾿?)
		
		Scanner sc = new Scanner(System.in);
		double minus = sc.nextDouble();
		
		//(if臾� 援ы쁽 �븘�슂) -- (�븘�땲硫� Exception handling)
		if (money < minus) {
			System.out.println("Debit amount exceeded account balance.");
		}
		else {
			money -= minus;
		}
	}
	*/
	
	public void balance() {		
		System.out.println(this.money);
	}
	
	
	
}
