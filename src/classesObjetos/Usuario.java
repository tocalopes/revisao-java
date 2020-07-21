package classesObjetos;

public class Usuario {
	
	public String nome;
	public String email;
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Usuario) {
			Usuario outro = (Usuario) obj;
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			return (nomeIgual && emailIgual);
		}else {
			return false;
		}
		
	}
	
	
}
