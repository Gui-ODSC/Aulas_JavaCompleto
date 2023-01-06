package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
	public static void main(String args[]) {
		
		String[] lines = new String[] {"Good Morning", "Good Afternoon", "Good Night"};
		
		String path = "c:\\temp\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for (String ln : lines) {//para cada linha do vetor
				bw.write(ln);//escrever mensagem do vetor no arquivo
				bw.newLine();//passa para a proxima linha
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
//desse modo cria o arquivo e grava os dados

//inserir novos dados sem recriar o arquivo 
//basta = try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true)))