package Listas1;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class Lista1 {
	public static void main(String[] args) {
		List <String> lista = new ArrayList<>();
		
		lista.add("Baiano");
		lista.add("Bruno");
		lista.add("Bob");
		lista.add("Marcia");
		lista.add(2, "Moana");
		
		System.out.println("Tamanho da Lista: " + lista.size());
		
		for (String pessoa : lista) {
			System.out.println(pessoa);
		}
		
		System.out.println("-----------------------");
		lista.remove(1);
		lista.removeIf(pessoa -> pessoa.charAt(0) == 'M');//função lâmbida = remove pessoas que começam com a letra 'M'.
		
		for (String pessoa : lista) {
			System.out.println(pessoa);
		}
		
		System.out.println("-----------------------");
		System.out.println("Index Of Bob: " + lista.indexOf("Bob"));
		System.out.println("Index Of Bob: " + lista.indexOf("Marco"));//quando elemento não está na lista
		
		
		System.out.println("-----------------------");
		//List <String> resultado = lista.stream().filter(pessoa -> pessoa.charAt(0) == 'B').collect(Collector.toList());//erro no colector
		
		System.out.println("-----------------------");
		String nome = lista.stream().filter(pessoa -> pessoa.charAt(0) == 'B').findFirst().orElse(null);
		System.out.println(nome);
	}
}
