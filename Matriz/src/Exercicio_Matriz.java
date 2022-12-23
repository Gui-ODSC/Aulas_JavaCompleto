import java.util.Scanner;
public class Exercicio_Matriz {
	public static void main (String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Digite o número de linhas: ");
		int m = ent.nextInt();
		System.out.println("Digite o número de colunas: ");
		int n = ent.nextInt();
		int [][] mat = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Digite: ");
				mat[i][j] = ent.nextInt();
			}
		}
	}
}
