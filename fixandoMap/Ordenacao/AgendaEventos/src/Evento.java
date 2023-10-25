public class Evento {
    // Atributos
    private String nomeEvento;
    private String nomeAtracao;

    // Construtor
    public Evento(String nomeEvento, String nomeAtracao) {
        this.nomeEvento = nomeEvento;
        this.nomeAtracao = nomeAtracao;
    }

    // Método get que retorna o atributo nomeEvento do objeto desencadeador
    public String getNomeEvento() {
        return nomeEvento;
    }

    // Método get que retorna o atributo nomeAtracao do objeto desencadeador
    public String getNomeAtracao() {
        return nomeAtracao;
    }

    // Método auxiliar sobrescrito da classe Objects para personalizar a exibição do objeto Evento
    @Override
    public String toString() {
        return "Evento{" +
            "nomeEvento='" + nomeEvento + '\'' +
            ", nomeAtracao='" + nomeAtracao + '\'' +
            '}';
    }
}
