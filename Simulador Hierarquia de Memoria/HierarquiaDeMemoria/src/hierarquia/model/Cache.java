package hierarquia.model;

class Cache extends Memoria {
    private int associatividade;
    private int tamanhoConjunto;
    private int tamanhoLinha;
    private String politicaEscrita;
    private int hits = 0;
    private int misses = 0;

    public Cache(String nome, int latencia, int associatividade, int tamanhoConjunto, int tamanhoLinha, String politicaEscrita) {
        this.nome = nome;
        this.latencia = latencia;
        this.associatividade = associatividade;
        this.tamanhoConjunto = tamanhoConjunto;
        this.tamanhoLinha = tamanhoLinha;
        this.politicaEscrita = politicaEscrita;
    }

    // aqui ainda vamos simular a lógica de acesso à cache com controle de hits/misses
    public int ler(int endereco) {
    }

    // a fazer: simular escrita com write-through ou write-back
    public void escrever(int endereco, int dado) {
    }

    public double calcularTaxaMiss() {
        return (double) misses / (hits + misses);
    }
}
