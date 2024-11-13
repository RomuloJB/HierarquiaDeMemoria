package hierarquia.model;

class Processador {
    private String padraoAcesso;
    private int stride;
    private int buffer;
    private int quantidadeAcessos;

    public Processador(String padraoAcesso, int stride, int buffer, int quantidadeAcessos) {
        this.padraoAcesso = padraoAcesso;
        this.stride = stride;
        this.buffer = buffer;
        this.quantidadeAcessos = quantidadeAcessos;
    }

    public void executar(Memoria primeiroNivel) {
        int tempoTotal = 0;
        for (int i = 0; i < quantidadeAcessos; i++) {
            int endereco = gerarEndereco(i);
            tempoTotal += primeiroNivel.ler(endereco);
        }
        // aqui precisa exibir as estatísticas
    }
    
    // onde iremos implementar lógica para geração de endereço sequencial ou aleatório
    private int gerarEndereco(int i) {
    }
}
