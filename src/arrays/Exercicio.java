package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] notasAlunoA = new double[3];
		System.out.println(Arrays.toString(notasAlunoA));
		notasAlunoA[0] = 7.5;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		
		String notas = notasAlunoA.toString();
		System.out.println(notas);
		
		double totalAlunoA = 0;
		for(int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		
		double[] notasAlunoB = {5.9,6,7.6};
		
		//o i é criado apenas no escopo do for, podendo ser usado mais de uma vez
		double totalAlunoB = 0;
		for(int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		
		System.out.println("media Aluno B = " + totalAlunoB / notasAlunoB.length);
		
		
	}

}
