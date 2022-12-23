package ExercicioResolvido;
import java.util.Scanner;

public class Resolvido {
	public static void main(String []args) {
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int n = ent.nextInt();
		int [][] mat = new int[n][n];
		
		for (int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = ent.nextInt();
			}
		}
		System.out.println("Diagonal principal: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		int count = 0;
		System.out.println("Numeros negativos");
		for (int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] < 0) {
					count++;
					System.out.println(mat[i][j] + " ");
				}
			}
		}
		System.out.println("Total de numeros negativos = " + count);
	}
}
