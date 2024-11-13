package hierarquia.model;

public abstract class Memoria {
    protected String nome;
    protected int latencia;
    protected int tamanho;
    protected int quantidadeAcessos = 0;
    protected int quantidadeLeituras = 0;
    protected int quantidadeEscritas = 0;

    public abstract int ler(int endereco);
    public abstract void escrever(int endereco, int dado);
    public int obterLatencia() { return latencia; }
}
