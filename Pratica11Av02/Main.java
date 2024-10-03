

import java.util.Scanner;

public class Main {
	
	public static float FarenCel(float temp, String opc) {
		if(opc.equals("A")) {
				return (temp * 9/5) + 32;	
			}
		
		return (temp - 32) * 5/9;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String opc;
		float temp = 0;
		
		System.out.print("A - Celsius para Farenhieght\nB - Farenhieght para Celsius\nDigite a opção: ");
		opc = sc.nextLine().toUpperCase();
		
		while (opc.equals("A") && opc.equals("B") ) {
			sc.nextLine();
			System.out.println("opção não existe ");
			System.out.print("A - Celsius para Farenhieght\nB - Farenhieght para Celsius\nDigite a opção: ");
			opc = sc.nextLine().toUpperCase();
		}
		
		if(opc.equals("A")) {
			System.out.println("Digite a temperatura em Celsius: ");
				temp = sc.nextFloat();
			}
		else if(opc.equals("B")) {
				System.out.println("Digite a temperatura em Farenheight: ");
				temp = sc.nextFloat();
			}
		
		System.out.println("A temperatura é: " + FarenCel(temp, opc));
	
		sc.close();
	}
	
}
