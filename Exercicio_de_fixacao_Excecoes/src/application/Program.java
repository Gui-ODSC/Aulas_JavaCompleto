package application;

import java.text.ParseException;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainExceptions;

public class Program {
	public static void main(String args[]) {
		Scanner ent = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data ");
			System.out.print("Number: ");
			int number = ent.nextInt();
			System.out.print("Holder: ");
			ent.nextLine();
			String holder = ent.nextLine();
			System.out.print("Initial balance: ");
			double balance = ent.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = ent.nextDouble();
			
			Account account = new Account(number, holder, balance, withdrawLimit);
			
			System.out.println(" ");
			System.out.print("Enter amount withdraw: ");
			double withDraw = ent.nextDouble();
			account.withdraw(withDraw);
			
			System.out.println(account);
		}
		catch (DomainExceptions e){
			System.out.println("Withdraw error: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected error!");
		}
	}
}
