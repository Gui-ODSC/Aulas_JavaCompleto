package application2;
import java.util.Scanner;

import entities2.Produto;

public class Problema2 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro: ");
		int n = ent.nextInt();
		Produto [] vetor = new Produto[n];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o nome do produto: ");
			ent.nextLine();
			String nome = ent.nextLine();
			System.out.print("Digite o preco do produto: ");
			double preco = ent.nextDouble();
			vetor[i] = new Produto(nome, preco);
		}
		double soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i].getPreco();
		}
		double media = soma / n;
		System.out.printf("A media dos precos dos produtos = %.2f" , media);
	}
}
