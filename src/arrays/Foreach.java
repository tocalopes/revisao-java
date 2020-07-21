package arrays;

public class Foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] notas = {1.0,2.0,3.0};
		
		
		double media = 0.0;
		
		for(int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}
		
		System.out.println();
		
		for(double nota: notas) {
			System.out.print(nota + " ");
			media += nota;
		}
		
		media = media / notas.length;
		
		//System.out.println(media);
		
 	}

}
