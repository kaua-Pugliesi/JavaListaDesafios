import java.util.Scanner;

public class Main {
	
	public static float Calcular(float numA, float numB, String operacao) {
		if (operacao.equals("A")) {
			return numA + numB;
		}
		else if(operacao.equals("S")){
			return numA - numB;
		}
		else if(operacao.equals("M")){
			return numA * numB;
		}
		else if(operacao.equals("D")){
			 if (numB == 0) {
		          System.out.println("Erro: divisão por 0");
		          return Float.NaN; 
		     }
			 else {
		          return numA / numB; 
		        }
		    }
		    
		System.out.println("Operação inválida"); 
		return Float.NaN; 
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha uma opção:\nA-Adição\nS-Subtração\nM-Multiplicação\nD-Divisão");
		
		System.out.print("Digite uma opção: ");
		String opc = sc.nextLine().toUpperCase();
		
		System.out.print("Digite um valor: ");
		float valor1 = sc.nextFloat();
		
		System.out.print("Digite outro valor: ");
		float valor2 = sc.nextFloat();
		
		System.out.print("O resultado é:" + Calcular(valor1, valor2, opc));
	
		
		sc.close();
	}
	
}
