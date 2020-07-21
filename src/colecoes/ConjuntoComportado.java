package colecoes;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set<String> listaAprovados = new HashSet<>();
		SortedSet<String> listaAprovados = new TreeSet<>();
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
	}

}
