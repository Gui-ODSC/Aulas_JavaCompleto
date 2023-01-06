package application;

import java.io.File;
import java.util.Scanner;

public class Program {
	public static void main(String args[]) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Enter a folder path: ");
		String strPath = ent.nextLine();
		
		File path = new File(strPath);//recebe o arquivo que o usuário digitou
		
		//para identificar diretórios
		File[] folders = path.listFiles(File::isDirectory);//lista de pastas ordenadas, pegando apenas os arquivos reconhecidos como pastas
		System.out.println("Folders: ");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		System.out.println();
		//para pegar somente os arquivos
		File[] files = path.listFiles(File::isFile);
		System.out.println("Files: ");
		for (File file : files) {
			System.out.println(file);
		}
		
		//criação de subpasta a partir da pasta temp
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created succesfully!!!");
	}
}
