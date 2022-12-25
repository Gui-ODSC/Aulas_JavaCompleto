package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {
	public static void main(String args[]) throws ParseException {
		Scanner ent = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		//Leitura dos dados do cliente
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String nameClient = ent.nextLine();
		System.out.print("Email: ");
		String emailClient = ent.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date dateBirth = sdf.parse(ent.next());
		
		//instanciação do objeto Client
		Client cl1 = new Client(nameClient, emailClient, dateBirth);
		
		//Leitura do Status
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus statusOrder = OrderStatus.valueOf(ent.next());
		
		//instanciação do order
		Order order = new Order(new Date(), statusOrder, cl1);
		
		//Leitura dos itens da lista
		System.out.print("How many items to this order? ");
		int n = ent.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter #" + (i+1) + " item data:");
			System.out.print("Product name: ");
			ent.nextLine();
			String nameProduct = ent.nextLine();
			System.out.print("Product price: ");
			double priceProduct = ent.nextDouble();
			System.out.print("Quantity: ");
			Integer quantity = ent.nextInt();
			
			//intanciação dos intens dentro do produto e ordem de produtos
			Product prod1 = new Product(nameProduct, priceProduct);
			OrderItem ord1 = new OrderItem(quantity, priceProduct, prod1);
			
			//adição do item na lista de itens
			order.addItem(ord1);
		}
		
		System.out.println();
		System.out.println(order);
	}
}
