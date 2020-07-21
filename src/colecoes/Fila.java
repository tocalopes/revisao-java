package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Ana");//lança uma excessão
		fila.offer("Bia");//retorna false caso não consiga adicionar
		fila.offer("Gabriel");
		fila.offer("Pedro");
		
		//Peek e Elemnt -> ovter o próximo elemento da fila
		System.out.println(fila.peek());//retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element());//lança um exceção
		System.out.println(fila.element());
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		
		
		//System.out.println(fila.poll());
		
		//retorna null caso a pilha esteja vazia
		System.out.println(fila.poll());
		
		//Lança execeção caso a pilha esteja vazia
		System.out.println(fila.remove());
		
		//fila.contains()
		
		
	}

}
