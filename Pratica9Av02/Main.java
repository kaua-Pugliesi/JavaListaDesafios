
import java.util.Scanner;

public class Main {
	
	public static int Palavras(String frase) {
		int count = 0;
	    boolean ultimaLetra = false; 

	    for (int i = 0; i < frase.length(); i++) {
	        char letra = frase.charAt(i);

	        if (Character.isLetter(letra)) {
	            ultimaLetra = true; 
	        } 
	        else if (letra == ' ' && ultimaLetra) {
	            count++; 
	            ultimaLetra = false; 
	        }
	    }

	    if (ultimaLetra) {
	        count++;
	    }

	    return count;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma Frase:");
		String frase = sc.nextLine().toLowerCase();
		
		System.out.println("A frase tem: "+ Palavras(frase) + " palavras.");
			
		sc.close();
	}
	
}
