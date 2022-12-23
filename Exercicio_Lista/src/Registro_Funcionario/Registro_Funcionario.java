package Registro_Funcionario;
import java.util.Scanner;
import Funcionario.Funcionario;
import java.util.ArrayList;
import java.util.List;

public class Registro_Funcionario {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		Funcionario fun;
		List<Funcionario> listaFunc = new ArrayList<>();
		System.out.print("Quantos funcionarios serao registrados: ");
		int n = ent.nextInt();
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Funcionario " + (i + 1));
			System.out.print("Id: ");
			int id = ent.nextInt();
			System.out.print("Nome: ");
			ent.nextLine();
			String nome = ent.nextLine();
			System.out.print("Salario: ");
			double salario = ent.nextDouble();
			fun = new Funcionario(id, nome, salario);
			listaFunc.add(fun);
			System.out.println();
		}
		
		System.out.print("Digite o Id do funcionario que recebera aumento: ");
		int verifId = ent.nextInt();
		int posi = posicao(listaFunc, verifId);
		if (posi == -1) {
			System.out.println("Esse id não existe!!");
		}else {
			System.out.print("Insira a porcentagem: ");
			double porcent = ent.nextDouble();
			listaFunc.get(posi).aumentaSalario(porcent);
		}
		System.out.println();
		System.out.println("Lista de Empregados: ");
		for (Funcionario func : listaFunc) {
			System.out.println(func);
		}
	}
	
	public static int posicao (List<Funcionario> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return -1;
	}
}
