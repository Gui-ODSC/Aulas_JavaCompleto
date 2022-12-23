package exercicio4;
import java.util.Scanner;
public class teste{
    public static void main(String[] args){
    	Scanner ent = new Scanner(System.in);
    	int x, y, z;
    	x = ent.nextInt();
    	y = ent.nextInt();
    	z = (x*y) + 5;
    	if (z <= 0) {
    		System.out.println("A");
    	}else if (z <= 100) {
    		System.out.println("B");
    	}else {
    		System.out.println("C");
    	}
    	System.out.println(z);
    }
}
