public class jogador {
    String nome;
    int numero;
    float peso;

    jogador(String _nome, int _numero, float _peso) {
        this.nome = _nome;
        this.numero = _numero;
        this.peso = _peso;
    }

    String getNome() {
        return this.nome;
    }
    void setNome(String _nome) {
        this.nome = _nome;
    }
    int getNumero() {
        return this.numero;
    }
    void setNumero(int _numero) {
        this.numero = _numero;
    }
    float getPeso() {
        return this.peso;
    }
    void setPeso(float _peso) {
        this.peso = _peso;
    }
    void atualizarPeso(float novoPeso) {
        this.peso = novoPeso;
    }
    void atualizarNumero(int novoNumero) {
        this.numero = novoNumero;
    }
}
