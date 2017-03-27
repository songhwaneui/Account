import java.util.Scanner;



public class Accounttest {
	
	public static void main(String[] args) {
		
	//	Account account1 = new Account(100);//
		//Account account2 = new Account(100);//  이거 없애야함 중복됨
		checkingAccount ckaccount1 = new checkingAccount(100,1000,0.01,0.07);
		checkingAccount ckaccount2 = new checkingAccount(100,1000,0.01,0.07);
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("account1 balance: "+ckaccount1.getBalance() );
		
		System.out.println("account2 balance: "+ckaccount2.getBalance() );
		
		
		
		//입금
		System.out.println("Enter deposit amount for account1: ");
		double x = input.nextDouble();
		ckaccount1.credit(x);
		System.out.println("account1 balance: "+ckaccount1.getBalance() );
		System.out.println("account2 balance: "+ckaccount2.getBalance() );
		
		//출금
		System.out.println("Enter withdrawal amount for account2: ");
		double y = input.nextDouble();
	
		System.out.println("account1 balance: "+ckaccount1.getBalance() );
		System.out.println("account2 balance: "+ckaccount2.debit(y) );
		
		//next month!
		System.out.println();
		
		System.out.println("next month!");
		
		System.out.println("account1 balance: "+ckaccount1.nextMonth());
			System.out.println("account2 balance: "+ckaccount2.nextMonth());
		
		
		
	}


		
	}

