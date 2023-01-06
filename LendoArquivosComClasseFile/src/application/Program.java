package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static void main(String args[]) {
		
		File file = new File("c:\\temp\\in.txt");
		Scanner ent = null;
		try {
			ent = new Scanner(file);//vai tentar abrir o arquivo
			while (ent.hasNextLine()) {//testa se tem outra linha no arquivo
				System.out.println(ent.nextLine());//le a linha e ja printa na tela
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if (ent != null) {
				ent.close();
			}
		}
	}
}
