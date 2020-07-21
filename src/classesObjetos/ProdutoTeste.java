package classesObjetos;

import java.util.Scanner;

public class ProdutoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner entrada = new Scanner(System.in);
		
		Produto p1 = new Produto();
		p1.preco = 4200.0;
		p1.desconto = 0.25;
		p1.nome = "Notebook";
		
		var p2 = new Produto();
		p2.nome = "Caneta";
		p2.preco = 3.00;
		p2.desconto = 0.1;
		
		System.out.println(p1.nome + " - preco com desconto:" + p1.precoComDesconto(0.2));
		System.out.println(p2.nome + " - preco com desconto:" + p2.precoComDesconto());
		System.out.printf("Valor total do carrinho = R$%.2f", (p1.precoComDesconto(0.2) + p2.precoComDesconto()));
		
		
	}

}
