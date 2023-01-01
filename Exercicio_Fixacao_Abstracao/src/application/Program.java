package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {
	public static void main (String args[]) {
		Scanner ent = new Scanner(System.in);
		List<TaxPayer>list = new ArrayList<>();
		
		
		System.out.print("Enter the number of the tax payers: ");
		int number = ent.nextInt();
		
		for(int i = 0; i < number; i++) {
			System.out.println("Tax payer #" + (i +1) + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char choice = ent.next().charAt(0);
			System.out.print("Name: ");
			ent.nextLine();
			String name = ent.nextLine();
			System.out.print("Anual Income: ");
			double anualIncome = ent.nextDouble();
			
			if (choice == 'i') {
				System.out.print("Health expenditures: ");
				double healthExp = ent.nextDouble();
				
				TaxPayer individual = new Individual(name, anualIncome, healthExp);
				list.add(individual);
			}else {
				System.out.print("Number of employees: ");
				int numberEmployees = ent.nextInt();
				
				TaxPayer company = new Company(name, anualIncome, numberEmployees);
				list.add(company);
			}
		}
		
		double sum = 0.0;
		System.out.println();
		System.out.println("TAXES PAID: ");
		for (TaxPayer tax : list) {
			System.out.println(tax.getName() + ": $" + String.format("%.2f", tax.tax()));
			sum += tax.tax();
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $" + String.format("%.2f", sum));
	}
}
