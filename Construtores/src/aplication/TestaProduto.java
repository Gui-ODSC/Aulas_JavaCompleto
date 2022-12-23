package aplication;
import java.util.Scanner;
import entities.Produto;

public class TestaProduto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int aum, dim;
		
		//leitura
		System.out.print("Digite o nome: ");
		String nome = entrada.next();
		System.out.print("Digite o preco: ");
		double preco = entrada.nextDouble();
		//System.out.print("Digite a quantidade: ");
		//int quantidade = entrada.nextInt();
		
		Produto prod = new Produto(nome, preco);
		prod.setNome("televisao");
		System.out.println("Nome atualizado: " + prod.getNome());
		prod.setPreco(550);
		System.out.println("Preco atualizado: " + prod.getPreco());
		
		//impress�o
		System.out.println("Dados do produto: " + prod.toString());
		
		System.out.println();
		System.out.print("Digite o quanto deseja acrescentar: ");
		aum = entrada.nextInt();
		prod.aumentaQuant(aum);
		
		System.out.println();
		System.out.println("Dados do produto: " + prod.toString());
		
		System.out.println();
		System.out.print("Digite o quanto deseja reduzir: ");
		dim = entrada.nextInt();
		prod.diminuiQuant(dim);
		
		System.out.println();
		System.out.println("Dados do produto: " + prod.toString());
	}

}
