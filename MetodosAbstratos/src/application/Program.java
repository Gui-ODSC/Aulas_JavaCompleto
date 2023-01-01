package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {
	public static void main(String args[]) {
		Scanner ent = new Scanner(System.in);
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int number = ent.nextInt();
		
		for (int i=0; i < number; i++) {
			System.out.println("Shape #" + (i+1) + " data: ");
			System.out.print("Rectangle or Circle (r/c): ");
			char choice = ent.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			ent.nextLine();
			String color = ent.nextLine();
			if (choice == 'r') {
				System.out.print("Width: ");
				double width = ent.nextDouble();
				System.out.print("Height: ");
				double height = ent.nextDouble();
				
				Shape rectangle = new Rectangle(Color.valueOf(color), width, height);
				list.add(rectangle);
			}else {
				System.out.print("Radius: ");
				double radius = ent.nextDouble();
				
				Shape circle = new Circle(Color.valueOf(color), radius);
				list.add(circle);
			}
		}
		System.out.println();
		System.out.println("SHAPE AREAS: ");
		for (Shape shape: list) {
			System.out.println(String.format("%.2f", shape.area()));
		}
	} 
}
