public class Item {
    // Atributos do objeto Item
    private String nome;
    private Double preco;
    private Integer quantidade;

    // Construtor do objeto Item
    public Item(String nome, Double preco, Integer quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Método que incrementa a quantidade do objeto
    public void incrementarQuantidade(){
        this.quantidade++;
    }

    // Método que decrementa a quantidade do objeto
    public void decrementarQuantidade(){
        this.quantidade--;
    }

    public String getNome(){
        return nome;
    }

    public Double getPreco(){
        return preco;
    }

    public Integer getQuantidade(){
        return quantidade;
    }

    // Método sobrescrito para formatar o retorno do objeto Item
    public String toString(){
        return "Item: [nome='" + nome + "', preço='" + preco + "', quantidade='" + quantidade + "']"; 
    }
}
