import java.util.Scanner;

public class Main {
	
	public static float Soma(float numA, float numB) {
		return numA + numB;
	}
	
	public static float Sub(float numA, float numB) {
		return numA - numB;
	}
	
	public static float Multi(float numA, float numB) {
		return numA * numB;
	}
	
	public static float Div(float numA, float numB) {
		return numA / numB;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float result = 0;
		System.out.println("Escolha uma opção:\nA-Adição\nS-Subtração\nM-Multiplicação\nD-Divisão");
		
		System.out.print("Digite uma opção: ");
		String opc = sc.nextLine().toUpperCase();
		
		System.out.print("Digite um valor: ");
		float valor1 = sc.nextFloat();
		
		System.out.print("Digite outro valor: ");
		float valor2 = sc.nextFloat();
		
		if (opc.equals("A")) {
			result = Soma(valor1, valor2);
			System.out.print("A soma é:" + result);
		}
		
		else if(opc.equals("S")){
			result = Sub(valor1, valor2);
			System.out.print("A Subtração é:" + result);
		}
		
		else if(opc.equals("M")){
			result = Multi(valor1, valor2);
			System.out.print("A Multiplicação é:" + result);
		}
		
		else if(opc.equals("D")) {
			if (valor2 == 0)
				System.out.println("Erro: divisão por 0)");
			else {
				result = Div(valor1, valor2);
				System.out.print("A Divisão é:" + result);
			}
		}
		
		sc.close();
	}
	
}
