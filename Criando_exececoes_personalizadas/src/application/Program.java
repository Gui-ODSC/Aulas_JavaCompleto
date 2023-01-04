package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Room Number: ");
			int roomNumber = ent.nextInt();
			System.out.print("Check-in date (dd/mm/yyyy): ");
			Date checkin = sdf.parse(ent.next());
			System.out.print("Check-out date (dd/mm/yyyy): ");
			Date checkout = sdf.parse(ent.next());
			
			Reservation reser = new Reservation(roomNumber, checkin, checkout);
			System.out.print("Reservation: " + reser);
			
			//mudanca de datas
			System.out.println("\n");
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in date (dd/mm/yyyy): ");
			checkin = sdf.parse(ent.next());
			System.out.print("Check-out date (dd/mm/yyyy): ");
			checkout = sdf.parse(ent.next());
			
			reser.updateDates(checkin, checkout);
			System.out.print("Reservation: " + reser);
		}
		catch (ParseException e) {
			System.out.println("Invalid date format!");
		}
		catch (DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected erro!");
		}
	}
}
