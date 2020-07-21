package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	//o ultimo que entrou sai
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("o pequeno principe");//retor true ou false
		livros.push("fodase");//lança exceção
		livros.add("oh carai");
		livros.add("minha pica");
		livros.push("o fodase");
		
		//peek e element também existem (retorna o ultimo).]
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		//System.out.println(livros.remove());
		
		//livros.size();
		//livros.clear();
		//livros.contains(arg0);
		
		//livros.isEmpty();
		
		
		
		
	}

}
