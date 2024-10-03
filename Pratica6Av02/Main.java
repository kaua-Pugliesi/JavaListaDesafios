
import java.util.Scanner;

public class Main {
	
	public static int QntVogais(String palavra) {
		int count = 0;
		char[] vogais = {'A', 'E', 'I', 'O', 'U'};
		
		for (int i = 0; i < String.valueOf(palavra).length(); i++) {
			char caracter = palavra.charAt(i);
			for(char vogal : vogais) {
				if (caracter == vogal) {
					count++;
					break;
				}				
			}
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite algo:");
		String palavra = sc.nextLine().toUpperCase();
		
		System.out.println("Há: " + QntVogais(palavra) +" vogais." );
			
		sc.close();
	}
	
}
