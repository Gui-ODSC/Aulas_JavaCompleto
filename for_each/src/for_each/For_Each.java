package for_each;

public class For_Each {
	public static void main(String[] args) {
		String [] vetor = new String[] {"Maria", "Bob", "Alex"};
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		for (String obj : vetor) {
			System.out.println(obj);
		}
			
	}
}
