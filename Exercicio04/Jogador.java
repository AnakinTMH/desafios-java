public class Jogador {
    
    private String nome;
    private int nivel;
    private float pontuacao;

    public Jogador(String nome, int nivel, int pontuacao) {
        this.nome = nome;
        this.nivel = nivel;
        this.pontuacao = pontuacao;
    }

    public Jogador() {
        System.out.println("Criando novo guerreiro");
    }

    String getNome() {
        return this.nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    int getNivel() {
        return this.nivel;
    }

    void setNivel(int nivel) {
        this.nivel = nivel;
        System.out.println("Nível alterado para: " + this.nivel);
    }

    float getPontuacao() {
        return this.pontuacao;
    }

    void setPontuacao(float pontuacao) {
        this.pontuacao = pontuacao;
        System.out.println("Pontuação alterada para: " + this.pontuacao);
    }

    void mostrar() {
        System.out.println("Guerreiro: " + nome);
        System.out.println("Nível: " + nivel);
        System.out.println("Pontuação: " + pontuacao);
    }
}
