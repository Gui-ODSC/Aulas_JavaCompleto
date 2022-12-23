package exercicio2;
import java.util.Scanner;

public class Soma_Vetor {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Digite um numero inteiro: ");
		int n = ent.nextInt();
		
		double soma = 0;
		double media = 0;
		double[] vetor = new double[n];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = ent.nextDouble();
		}
		System.out.println();
		System.out.print("Vetores = ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + "  ");
			soma += vetor[i];
		}
		System.out.printf("\nSOMA = %.2f", soma);
		media = soma / n;
		System.out.printf("\nMEDIA = %.2f", media);
	}
}
