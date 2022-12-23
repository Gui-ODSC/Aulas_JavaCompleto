import java.util.Scanner;
public class Negativos {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = ent.nextInt();
		
		int [] vetor = new int[n];
		if (n > 10) {
			System.out.println("Numero invalido");
		}else {
			for (int i= 0; i < n; i++) {
				System.out.println("Digite um numero: ");
				vetor[i] = ent.nextInt();
			}
			System.out.println();
			System.out.println("Numeros Negativos:");
			for (int i = 0; i < vetor.length; i++) {
				if (vetor[i] < 0) {
					System.out.println(vetor[i]);
				}
			}
		}
		
	}
}
