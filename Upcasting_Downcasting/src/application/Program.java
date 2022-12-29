package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
	public static void main(String args[]) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING == converter objeto da subclasse para superclasse
		
		Account acc1 = bacc; // não da problema pois uma bacc "é um " Account;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		//DOWNCASTING == converter objeto da superclasse para subclasse
		//É necessário testar com "instanceof" se os objetos correspondem aos seus respectivos tipos
		
		BusinessAccount bacc4 = (BusinessAccount)acc2;//realizar casting de forma manual
		bacc4.loan(100.0);
		
		//BusinessAccount bacc5 = (BusinessAccount)acc3;  possível erro indetectável pelo compilador, como evitar
		//testa se a acc3 é realemente do tipo BusinessAccount
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount bacc5 = (BusinessAccount)acc3;
			bacc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount sacc6 = (SavingsAccount)acc3;
			sacc6.updateBalance();
			System.out.println("Update!");
		}
	}
}