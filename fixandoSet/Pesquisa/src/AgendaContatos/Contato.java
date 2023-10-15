package AgendaContatos;

public class Contato {
	// Atributos	
	private String nome;
	private int numeroTelefone;
	
	// Construtor
	public Contato(String nome, int numeroTelefone) {
		this.nome = nome;
		this.numeroTelefone = numeroTelefone;
	}

	// Método auxiliar que retorna o atributo nome
	public String getNome() {
		return nome;
	}

	// Método auxiliar que retorna o atributo numeroTelefone
	public int getNumeroTelefone() {
		return numeroTelefone;
	}	

	public void setNumeroTelefone(int numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}

	// Método sobrescrito para personalizar a exibição do objeto
	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", numeroTelefone=" + numeroTelefone + "]";
	}
}
