
package exercicio3;
import java.util.Scanner;
public class Alturas {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas: ");
		int n = ent.nextInt();
		
		String [] nome = new String[n];
		int [] idade = new int[n];
		double [] altura = new double[n];
		double soma = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + " pessoa: ");
			System.out.print("Nome: ");
			ent.nextLine();
			nome[i] = ent.nextLine();
			System.out.print("Idade: ");
			idade[i] = ent.nextInt();
			System.out.print("Altura: ");
			altura[i] = ent.nextDouble();
		}
		for (int i = 0; i < idade.length; i++) {
			soma += altura[i];
		}
		System.out.println();
		System.out.printf("Altura Media: %.2f", soma / idade.length);
		int cont = 0;
		for (int i = 0; i < idade.length; i++) {
			if (idade[i] < 16) {
				cont += 1;
			}
		}
		double porcentagem = (cont * 100)/ n;
		System.out.println("\nPessoas com menos de 16 anos: " + porcentagem + "%");
		
		for (int i = 0; i < idade.length; i++) {
			if (idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}
	}
}
