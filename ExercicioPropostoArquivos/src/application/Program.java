package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String args[]) throws ParseException, NumberFormatException{
		Scanner ent = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		System.out.println("Enter file path: ");
		String strFile = ent.nextLine();
		
		File sourceFile = new File(strFile);
		
		//criação da subpasta
		boolean succes = new File(sourceFile.getParent() + "\\out").mkdir();
		
		String targetFileStr = sourceFile.getParent() + "\\out\\summary.csv ";
			
		try (BufferedReader br = new BufferedReader(new FileReader(strFile))){
			String line = br.readLine();
			while (line != null) {
				
				String[] fields = line.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				
				Product prod = new Product(name, price, quantity);
				list.add(prod);
				
				line = br.readLine();
			}
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){
				for (Product item: list) {
					bw.write(item.getName() + ", " + String.format("%.2f", item.total()));
					bw.newLine();
				}
				
				System.out.println(targetFileStr + " created");
			}
			catch (IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}
		}
		catch(IOException e) {
			System.out.println("Error writing file: " + e.getMessage());
		}
		catch (NumberFormatException e) {
			System.out.println("ola mundo");
		}
	}
}
