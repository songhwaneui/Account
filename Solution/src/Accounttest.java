import java.util.Scanner;



public class Accounttest {
	
	public static void main(String[] args) {
		
		double input;
		

		Account account1 = new Account(50.00);
		Account account2 = new Account();
	
		System.out.print("account1 balance: ");
		account1.balance();
		System.out.print("account2 balance: ");
		account2.balance();
		
		

		System.out.print("Enter withdrawl amount for account1: ");
		Scanner sc = new Scanner(System.in);
		input = sc.nextDouble();
		account1.debit(input);
		
		System.out.print("account1 balance: ");
		account1.balance();
		System.out.print("account2 balance: ");
		account2.balance();
		
		

		System.out.print("Enter withdrawl amount for account2: ");
		sc = new Scanner(System.in);		//(�씠誘� sc 媛앹껜瑜� 留뚮뱾�뿀�쑝�땲 �꽑�뼵 �깮�왂)
		input = sc.nextDouble();
		account2.debit(input);
		
		System.out.print("account1 balance: ");
		account1.balance();
		System.out.print("account2 balance: ");
		account2.balance();
		
	}

}