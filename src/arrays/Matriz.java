package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Quantos alunos? ");
		int qtdeAlunos = teclado.nextInt();
		
		System.out.println();
		
		System.out.print("Quantas notas por aluno?");
		int qtdeNotas = teclado.nextInt();
		
		double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];
		
		double total = 0;
		double totalPorAluno = 0;
		
		for (int a = 0; a < notasDaTurma.length; a++) {
			for (int n = 0; n < notasDaTurma[a].length; n++) {
				System.out.printf("Digite a %dº nota do %dº aluno", n + 1, a + 1);
				notasDaTurma[a][n] = teclado.nextDouble();
				System.out.println();
				total += notasDaTurma[a][n];
				totalPorAluno = total;
			}
			System.out.print("A média do "+ (a + 1) +"º Aluno foi: " +totalPorAluno/notasDaTurma[a].length);
			totalPorAluno = 0;
			System.out.println();
		}
		
		System.out.println("Media da turma é: " + total / (qtdeAlunos * qtdeNotas));
		System.out.println(Arrays.toString(notasDaTurma));
		
		teclado.close();
		
		
	}

}
