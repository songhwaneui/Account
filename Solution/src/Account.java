import java.util.Scanner;



public class Account
{
	
	private double money;
	
	public void balance() {		
		System.out.println(this.money);
	}
		
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
	
	

	
}
