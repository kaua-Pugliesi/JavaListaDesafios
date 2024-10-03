

import java.util.Scanner;

public class Main {
	
	public static int ListSum(int list[]) {
		int aux = 0;
		for (int i = 0; i < list.length; i++) {
			 aux = aux + list[i];
	      } 
		return aux;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o tamanho da lista:");
		int tam = sc.nextInt();
		int[] numeros = new int[tam];
		for (int i = 0; i < numeros.length; i++) {
			 System.out.println("Digite um numero:");
			 numeros[i] = sc.nextInt();
	      } 
		 
		 System.out.println("A soma da lista é:" + ListSum(numeros));
	
		sc.close();
	}
	
}
