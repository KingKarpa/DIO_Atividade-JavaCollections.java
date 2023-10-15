package CadastroProdutos;

import java.util.Objects;

public class Produto implements Comparable<Produto> {
	// Atributos	
	private String nome;
	private int codigo;
	private double preco;
	private int quantidade;
	
	// Construtor
	public Produto(String nome, int codigo, double preco, int quantidade) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	// Método auxiliar que retorna o atributo nome
	public String getNome() {
		return nome;
	}

	// Método auxiliar que retorna o atributo codigo
	public int getCodigo() {
		return codigo;
	}

	// Método auxiliar que retorna o atributo preco
	public double getPreco() {
		return preco;
	}

	// Método auxiliar que retorna o atributo qualidade
	public int getQuantidade() {
		return quantidade;
	}

	// Método sobrescrito para auxiliar a identidade única dos objetos atráves do atributo codigo
    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
	
    // Método sobrescrito de Objects para garantir que os objetos Produto serão comparados pelo atributo codigo 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Produto))
			return false;
		Produto other = (Produto) obj;
		return codigo == other.codigo;
	}

	// Método sobrescrito da interface Comparable, realizando comparação através do atributo nome dos objetos Produto
	@Override
	public int compareTo(Produto produto) {
		return nome.compareToIgnoreCase(produto.getNome());
	}
	
	// Método sobrescrito para personalizar a exibição dos objetos Produto
	@Override
	public String toString() {
		return "\nProduto: [nome=" + nome + ", codigo=" + codigo + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}
}
