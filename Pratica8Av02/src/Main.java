
import java.util.Scanner;

public class Main {
	
	public static int Fatorial(int num) {
        if (num == 0) {
            return 1; 
        }
        
        int aux = 1; 
        while (num > 0) {
            aux *= num; 
            num--;      
        }
        
        return aux;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um Numero:");
		int valor = sc.nextInt();
		
		int resultado = Fatorial(valor);
		
		System.out.println("O fatorial de "+ valor + ":" + resultado );
			
		sc.close();
	}
	
}
