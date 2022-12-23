package application;
import java.util.Scanner;
//para criar veto = (double [] vetor = new double [n];)

public class Problema1 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int n = ent.nextInt();
		double[] vetor = new double[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Digite a altura: ");
			vetor[i] = ent.nextDouble();
		}
		
		double soma = 0;
		for (int i = 0; i < n;i++) {
			soma += vetor[i];
		}
		double media = soma / n;
		System.out.printf("Media = %.2f", media);
	}
}