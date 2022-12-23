package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {
	public static void main(String args[]) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner ent = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		//Entrada com dados do departamento/instanciação do Department
		System.out.print("Enter department's name: ");
		String departmentName = ent.nextLine();
		Department department = new Department(departmentName);
		
		//Entrada com dados do Trabalhador/ Instanciação do Worker
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = ent.nextLine();
		System.out.print("Level: ");
		String workerLevel = ent.nextLine();
		System.out.print("Base Salary: ");
		double baseSalary = ent.nextDouble();
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, department);
		
		//Quantidade de contratos do trabalhador
		System.out.print("How many contracts to this worker? ");
		int num_contrac = ent.nextInt();
		
		//Laço de preenchimento de contratos/ instanciação de HourContract
		for (int i = 0; i < num_contrac; i++) {
			System.out.println("Enter contract #" + (i+1) + " data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(ent.next());
			System.out.print("Value per hour: ");
			double valorPerHour = ent.nextDouble();
			System.out.print("Duration: ");
			int hours = ent.nextInt();
			HourContract contract = new HourContract(contractDate, valorPerHour, hours);
			worker.addContract(contract);//chama classe worker, puxa método de add, e instancia contract criado acima
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = ent.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for: " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
	}
}
