public class frutas {
    String nome;
    String epoca;
    float peso;

    frutas (String _nome, String _epoca, float _peso) {
        this.nome = _nome;
        this.epoca = _epoca;
        this.peso = _peso;
    }

    String getNome() {
        return this.nome;
    }
    void setNome(String _nome) {
        this.nome = _nome;
    }
    String getEpoca() {
        return this.epoca;
    }
    void setEpoca(String _epoca) {
        this.epoca = _epoca;
    }
    float getPeso() {
        return this.peso;
    }
    void setPeso(float _peso) {
        this.peso = _peso;
    }
    void exibirEpocaDoAno() {
        System.out.println("Esta fruta é encontrada na época: " + this.epoca);
    }
}
