package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
	public static void main(String args[]) {
		
		String path = "c:\\temp\\ina.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			//esquema de leitura
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException e){
			System.out.println("Error: " + e.getMessage());
		}
	}
}
