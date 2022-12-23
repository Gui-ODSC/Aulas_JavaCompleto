//Funções
/*
 * Math.sqrt(double)
 * System.out.println(string)
 */
import java.util.Scanner;

	public class Funcoes{
		public static void main(String[] args) {
			Scanner ent = new Scanner(System.in);
			int a, b, c;
			System.out.println("Escreva os tres numeros: ");
			a = ent.nextInt();
			b = ent.nextInt();
			c = ent.nextInt();
			
			int higher = Max(a, b, c);
			showResult(higher);
		}
		
		public static int Max(int x, int y, int z) {
			int aux;
			if (x > y && x > z) {
				aux = x;
			}else if (y > z) {
				aux = y;
			}else {
				aux = z;
			}
			return aux;
		}
		
		public static void showResult(int value) {
			System.out.println("Maior = " + value);
		}
	}