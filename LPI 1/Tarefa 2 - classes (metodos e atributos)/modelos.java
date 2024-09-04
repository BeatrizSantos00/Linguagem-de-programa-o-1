public class modelos {
    String nome;
    int idade;
    String cabelo;

    modelos(String _nome, int _idade, String _cabelo) {
        this.nome = _nome;
        this.idade = _idade;
        this.cabelo = _cabelo;
    }

    String getNome() {
        return this.nome;
    }
    void setNome(String _nome) {
        this.nome = _nome;
    }
    int getIdade() {
        return this.idade;
    }
    void setIdade(int _idade) {
        this.idade = _idade;
    }
    String getCabelo() {
        return this.cabelo;
    }
    void setCabelo(String _cabelo) {
        this.cabelo = _cabelo;
    }
    void atualizarIdade(int novaIdade) {
        this.idade = novaIdade;
    }
    void atualizarCabelo(String novoCabelo) {
        this.cabelo = novoCabelo;
    }
}
