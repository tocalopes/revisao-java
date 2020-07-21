package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Usuario> lista = new ArrayList<>();
		
		lista.add(new Usuario("Ana"));
		lista.add(new Usuario("Gabriel"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(3) + "\n");
		
		System.out.println("removido:" + lista.remove(1));
		lista.remove(new Usuario("Manu")); //true
		
		System.out.println(lista.contains(new Usuario("Bia")));
		
		for(Usuario u: lista) {
			System.out.println(u);
		}
		
	}

}
