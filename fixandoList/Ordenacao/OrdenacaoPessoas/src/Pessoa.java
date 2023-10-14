public class Pessoa implements Comparable<Pessoa> {
    // Atributos
    private String nome;
    private int idade;
    private double altura;

    // Construtor
    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura; 
    }

    // FOCO DO EXERCÍCIO: Método da interface Comparable para ordenar obejtos Pessoa por idade
    @Override
    public int compareTo(Pessoa pessoa) {
        return Integer.compare(idade, pessoa.getIdade());
    }

    // Método auxiliar para retornar o atributo nome
    public String getNome(){
        return nome;
    }

    // Método auxiliar para retornar o atributo idade
    public int getIdade(){
        return idade;
    }

    // Método auxiliar para retornar o atributo altura
    public double getAltura(){
        return altura;
    }

    // Método auxiliar para editar a exibição do objeto
    public String toString(){
        return "\nPessoa: [Nome='" + nome + "', Idade='" + idade + "', Altura='" + altura + "']"; 
    }
}
