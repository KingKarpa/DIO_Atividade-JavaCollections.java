import java.text.DecimalFormat;

public class Produto {
    // Atributos
    private String nome;
    private int quantidade;
    private double preco;

    // Construtor
    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    // Método get que retorna o atributo nome
    public String getNome() {
        return nome;
    }

    // Método get que retorna o atributo quantidade
    public int getQuantidade() {
        return quantidade;
    }

    // Método get que retorna o atributo preco
    public double getPreco() {
        return preco;
    }

    // Método sobrescrito para personalizar a exibição do objeto Produto no output
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#0.00");
        return "Produto{" +
            "nome='" + nome + '\'' +
            ", quantidade=" + quantidade +
            ", preco=" + df.format(preco) +
            '}';
    }
}
