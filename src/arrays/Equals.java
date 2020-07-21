package arrays;

import classesObjetos.Usuario;

public class Equals {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		Usuario u1 = new Usuario();
		Usuario u2 = new Usuario();
		
		u1.nome = "x";
		u1.email = "x";
		u2.nome = "x";
		u2.email = "x";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		
		
		
	}

}
