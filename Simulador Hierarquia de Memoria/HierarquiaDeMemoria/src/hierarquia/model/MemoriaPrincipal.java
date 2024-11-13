package hierarquia.model;

class MemoriaPrincipal extends Memoria {
    public MemoriaPrincipal(String nome, int latencia) {
        this.nome = nome;
        this.latencia = latencia;
    }

    public int ler(int endereco) {
        quantidadeLeituras++;
        return 0; 
        // simular leitura
    }

    public void escrever(int endereco, int dado) {
        quantidadeEscritas++;
        // ainda precisa simular a escrita
    }
}