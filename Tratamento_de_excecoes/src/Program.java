import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String args[]) {
		
		method1();
		
		System.out.println("End of the program");
	}
	
	public static void method1() {
		System.out.println("***Metodo 1 START***");
		method2();
		System.out.println("***Metodo 1 END ***");
	}
	
	
	
	public static void method2() {
		System.out.println("***Metodo 2 START***");
		Scanner ent = new Scanner (System.in);
		
		try {
			String[] vetor = ent.nextLine().split(" ");
			int position = ent.nextInt();
			System.out.println(vetor[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position!!");
			e.printStackTrace();//serve para ver a rota de excecoes ate chegar no problema principal
			ent.next();
		}
		catch (InputMismatchException e) {
			System.out.println("Input error!!!");
		}
		System.out.println("***Metodo 2 END ***");
	}
}
