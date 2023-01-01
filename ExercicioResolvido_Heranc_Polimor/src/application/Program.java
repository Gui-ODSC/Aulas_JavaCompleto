package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {
	public static void main(String args[]) {
		Scanner ent = new Scanner(System.in);
		List<Employee>list = new ArrayList<>();
		Employee employee;
		
		//Leitura da quantidade de funcionarios
		System.out.print("Enter the number of employees: ");
		int number = ent.nextInt();
		
		//laço de repetição para a leitura dos funcionários
		for (int i = 0; i < number; i++) {
			System.out.println("Employee #" + (i + 1) + " data: ");
			System.out.print("Outsourced (y/n)? ");
			char ch = ent.next().charAt(0);
			System.out.print("Name: ");
			ent.nextLine();
			String name = ent.nextLine();
			System.out.print("Hours: ");
			int hours = ent.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = ent.nextDouble();
			//verificação de leitura de adicional
			if (ch == 'y') {
				System.out.print("Addicional Charge: ");
				double addcharge = ent.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, addcharge);
				list.add(emp);
			}else {
				Employee empStandard = new Employee(name, hours, valuePerHour);
				list.add(empStandard);
			}
		}
		System.out.println();
		System.out.println("PAYMENTS: ");
		for (Employee emp: list) {
			System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
		}
	}
}
