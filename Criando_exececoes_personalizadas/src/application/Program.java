package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner ent = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room Number: ");
		int roomNumber = ent.nextInt();
		System.out.print("Check-in date (dd/mm/yyyy): ");
		Date checkin = sdf.parse(ent.next());
		System.out.print("Check-out date (dd/mm/yyyy): ");
		Date checkout = sdf.parse(ent.next());
		
		//testar se a data de checkout é posterior a data de checkin
		if (!checkout.after(checkin)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		}else {
			Reservation reser = new Reservation(roomNumber, checkin, checkout);
			System.out.print("Reservation: " + reser);
			
			//mudanca de datas
			System.out.println("\n");
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in date (dd/mm/yyyy): ");
			checkin = sdf.parse(ent.next());
			System.out.print("Check-out date (dd/mm/yyyy): ");
			checkout = sdf.parse(ent.next());
			
			String error = reser.updateDates(checkin, checkout);
			if (error != null) {
				System.out.println("Error in reservation: " + error);
			}else {
				System.out.print("Reservation: " + reser);
			}
		}
	}
}
