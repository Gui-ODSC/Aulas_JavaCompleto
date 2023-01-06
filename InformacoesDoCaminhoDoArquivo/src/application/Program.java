package application;

import java.io.File;
import java.util.Scanner;

public class Program {
	public static void main(String args[]) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Enter a file path: ");
		String strPath = ent.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("GetName: " + path.getName());//somente o nome do arquivo
		System.out.println("GetParent: " + path.getParent());//somente o nome da pasta
		System.out.println("GetPath: " + path.getPath());//o arquivo de todo o caminho
	} 
}
