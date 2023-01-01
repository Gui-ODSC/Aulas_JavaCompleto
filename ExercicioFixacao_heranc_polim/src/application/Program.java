package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
	public static void main(String args[]) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner ent = new Scanner(System.in);
		List<Product>list = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter the number of products: ");
		int number = ent.nextInt();
		
		for (int i = 0; i < number; i++) {
			System.out.println("Product #" + (i+1) + " data:");
			System.out.print("Common, used, or imported (c/u/i)? ");
			char choice = ent.next().charAt(0);
			if(choice == 'c') {
				System.out.print("Name: ");
				ent.nextLine();
				String name = ent.nextLine();
				System.out.print("Price: ");
				double price = ent.nextDouble();
				
				Product product = new Product(name, price);
				list.add(product);
				
			}else if (choice == 'i'){
				System.out.print("Name: ");
				ent.nextLine();
				String name = ent.nextLine();
				System.out.print("Price: ");
				double price = ent.nextDouble();
				System.out.print("Customs fee: ");
				double customsFee = ent.nextDouble();
				
				Product imported = new ImportedProduct(name, price, customsFee);
				list.add(imported);
			}else {
				System.out.print("Name: ");
				ent.nextLine();
				String name = ent.nextLine();
				System.out.print("Price: ");
				double price = ent.nextDouble();
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(ent.next());
				
				Product usedProduct = new UsedProduct(name, price, manufactureDate);
				list.add(usedProduct);
			}
		}
		System.out.println();
		System.out.println("PRICE TAGS: ");
		for (Product prod: list) {
			System.out.println(prod.priceTag());
		}
	}
}
