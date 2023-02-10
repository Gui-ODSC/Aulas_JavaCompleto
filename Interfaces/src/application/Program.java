package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxServices;
import model.services.RentalService;

public class Program {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner ent = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String carModel = ent.nextLine();
		System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(ent.nextLine(), fmt);
		System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
		LocalDateTime finish = LocalDateTime.parse(ent.nextLine(), fmt);
		
		CarRental cR = new CarRental(start, finish, new Vehicle(carModel));
		
		System.out.print("Entre com o preço por hora: ");
		double pricePerHour = ent.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		double pricePerDay = ent.nextDouble();
		
		RentalService rT = new RentalService(pricePerHour, pricePerDay, new BrazilTaxServices());
		
		rT.processInvoice(cR);
		
		System.out.println("FATURA: ");
		System.out.println("Pagamento basico: " + String.format("%.2f", cR.getInvoice().getBasicPayment()));
		System.out.println("Imposto: " + String.format("%.2f", cR.getInvoice().getTax()));
		System.out.println("Pagamento Total: " + String.format("%.2f", cR.getInvoice().TotalPayment()));

		
	}
}