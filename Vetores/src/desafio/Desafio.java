package desafio;
import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Quantos quartos serao alugados: ");
		int n = ent.nextInt();
		
		String[] nome = new String [10];
		String[] email = new String[10];
		int [] quarto = new int [10];
		
		System.out.println();
		if (n > 10) {
			System.out.println("Numero indisponivel");
		}else {
			for (int i = 0; i < n; i++) {
				System.out.println("Aluguel " + (i + 1) + " :");
				System.out.print("Nome: ");
				ent.nextLine();
				String nomeres = ent.nextLine();
				System.out.print("Email: ");
				String emailres = ent.nextLine();
				System.out.print("Quarto: ");
				int quartores = ent.nextInt();
				nome [quartores] = nomeres;
				email [quartores] = emailres;
				quarto [quartores] = quartores;
				System.out.println();
			}
			System.out.println();
			System.out.println("Quartos alugados:");
			for (int i = 0; i < 10; i++) {
				if (nome[i] != null) {
					System.out.println(quarto[i] + " : " + nome[i] + ", " + email[i]);
				}
			}
		}
		
	}
}
