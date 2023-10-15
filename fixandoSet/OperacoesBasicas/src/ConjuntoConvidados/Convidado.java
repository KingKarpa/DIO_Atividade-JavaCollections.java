package ConjuntoConvidados;

public class Convidado {
	// Atributos	
	private String nome;
		// Equivalente ao ID do objeto		
	private int codigoConvite;
	
	// Construtor		
	public Convidado(String nome, int codigoConvite) {
		this.nome = nome;
		this.codigoConvite = codigoConvite;
	}

	// Método auxiliar que retorna o atributo nome
	public String getNome() {
		return nome;
	}

	// Método auxiliar que retorna o atributo codigoConvite
	public int getCodigoConvite() {
		return codigoConvite;
	}

	// Método sobrescrito para personalizar a exibição dos objetos Convidado	
	@Override
	public String toString() {
		return "Convidado: [nome=" + nome + ", codigoConvite=" + codigoConvite + "]";
	}
	
	
}
