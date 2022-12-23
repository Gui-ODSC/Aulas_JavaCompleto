package TestaConta;
import java.util.Scanner;
import ContaBancaria.ContaBancaria;
public class TestaConta {
	public static void main(String [] args) {
		Scanner ent = new Scanner(System.in);
		ContaBancaria cont;
		
		System.out.print("Digite o numero da conta: ");
		int numero = ent.nextInt();
		ent.nextLine();
		System.out.print("Nome do titular: ");
		String nome = ent.nextLine();
		System.out.print("Havera deposito inicial (y/n) ? ");
		char respo = ent.next().charAt(0);
		
		if (respo == 'y') {
			System.out.print("Escolha um valor inicial: ");
			double quantidade = ent.nextDouble();
			cont = new ContaBancaria(numero, nome, quantidade);
		}else {
			cont = new ContaBancaria(numero, nome);
		}
		
		//amostra de dados
		System.out.println();
		System.out.println("Dados da Conta: ");
		System.out.println(cont.toString());
		//depósito
		System.out.println();
		System.out.print("Entre com um valor de depósito: ");
		double valordep = ent.nextDouble();
		cont.realizaDeposito(valordep);
		System.out.println("Atualizacao de Dados: ");
		System.out.println(cont.toString());
		//saque
		System.out.println();
		System.out.print("Entre com um valor de Saque: ");
		double valorSaq = ent.nextDouble();
		cont.realizaSaque(valorSaq);
		System.out.println("Atualizacao de Dados: ");
		System.out.println(cont.toString());
		
		
	}
}
