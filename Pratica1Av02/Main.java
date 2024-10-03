import java.util.Scanner;

public class Main {
	
	public static String MaiorMenor(int num) {
		
		if (num > 0){
			return "P";
		}
		else {
			return "N";
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int valor = sc.nextInt();
		
		String resultado = MaiorMenor(valor);
		System.out.println(resultado); 
		
		sc.close();
	}
	
}
