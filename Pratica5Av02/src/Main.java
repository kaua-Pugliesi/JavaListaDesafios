import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Usuarios;

public class Main {
	
	public static String verifica(String user, String senha) {
		List<Usuarios> Usuarios = new ArrayList<>();
		Usuarios.add(new Usuarios("teste1", "admin1"));
		Usuarios.add(new Usuarios("teste2", "admin2"));
		Usuarios.add(new Usuarios("teste3", "admin3"));
		Usuarios.add(new Usuarios("teste4", "admin4"));
		for(int i = 0; i < Usuarios.size(); i++) {
			if (user.equals(Usuarios.get(i).getUsername()) && senha.equals(Usuarios.get(i).getPassword()) ) {
				return "compatível";
			}
			else {
				break;
			}	
		}
		return "Imcompativel";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o usuario:");
		String usu = sc.nextLine();
		System.out.println("Digite a Senha:");
		String sen = sc.nextLine();
		
		System.out.println(verifica(usu, sen));
			
		sc.close();
	}
	
}
