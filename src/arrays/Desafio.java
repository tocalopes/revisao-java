package arrays;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nNotas;
		double media;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite quantas notas o aluno possui: ");
		nNotas = teclado.nextInt();
		
		double [] notas = new double[nNotas];
		double total = 0;
		
		for(int i = 0; i < nNotas; i++) {
			System.out.printf("Digite a %dº nota", i+1);
			notas[i] = teclado.nextDouble();
			total += notas[i];
			System.out.println();
		}
		
		media = total / notas.length;
		System.out.println("A media do aluno foi: " + media);
		
		
	}

}
