package fundamentos;

import java.util.Scanner;

public class TipoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("Eae".charAt(2));
		String s = "Eae";
		System.out.println(s.concat(" mermão"));
		System.out.println(s.toLowerCase().startsWith("eae"));
		System.out.println(s.equalsIgnoreCase("Eae"));*/
		
		var nome = "gabriel";
		var sobrenome = "lopes";
		var idade = 23;
		var salario = 2400.25;
		
		
		//System.out.printf("Me chamo %s %s , tenhao %d e ganhao R$%.2f salario",nome,sobrenome,idade,salario);
		Scanner teclado = new Scanner(System.in);
		System.out.print("digita qualquer merda");
		String fodase = teclado.nextLine();
		teclado.close();
		System.out.println(fodase);
		
		
		
		
	}

}
