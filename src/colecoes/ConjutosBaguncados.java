package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjutosBaguncados {
	
	//set não permite repetição
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet conjunto = new HashSet();
		conjunto.add(1.2); // double -> Double;
		conjunto.add(true); //boolean -> Boolean;
		conjunto.add("Teste");
		conjunto.add(3);
		conjunto.add('x');
		conjunto.add()
		
		System.out.println("Tamanho é" + conjunto.size());
		
		conjunto.add("teste");
		System.out.println("Tamanho é" + conjunto.size());
		
		System.out.println(conjunto.remove('x'));
		System.out.println("Tamanho é" + conjunto.size());
		
		System.out.println(conjunto.contains(1.2));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums); //União entre dois conjuntos
		conjunto.retainAll(nums); // interceção entre dois conjuntos
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
		
	}

}
