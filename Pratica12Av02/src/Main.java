

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	
	public String Valida(String email) {
		String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        
        if ( matcher.find()) {
        	return "Email válido";
        }
        return "Email inválido";
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Insira o email: ");
		String email = sc.nextLine();
		
		 Main mainInstance = new Main();
	     System.out.println(mainInstance.Valida(email));
		
		sc.close();		
	}
	
}
