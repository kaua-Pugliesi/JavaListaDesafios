import java.util.Scanner;

public class Main {
	
	public static int Qnt(int num) {
		return String.valueOf(num).length();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int valor = sc.nextInt();
		
		int resultado = Qnt(valor);
		System.out.println("a Quantidade de digitos é: " + resultado); 
		
		sc.close();
	}
	
}
