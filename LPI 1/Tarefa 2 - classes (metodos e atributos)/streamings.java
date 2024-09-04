public class streamings {
    String nome;
    int quantidadeDeUsuarios;
    int quantidadeDeFilmes;

    streamings(String _nome, int _quantidadeDeUsuarios, int _quantidadeDeFilmes) {
        this.nome = _nome;
        this.quantidadeDeUsuarios = _quantidadeDeUsuarios;
        this.quantidadeDeFilmes = _quantidadeDeFilmes;
    }

    String getNome() {
        return this.nome;
    }
    void setNome(String _nome) {
        this.nome = _nome;
    }
    int getQuantidadeDeUsuarios() {
        return this.quantidadeDeUsuarios;
    }
    void setQuantidadeDeUsuarios(int _quantidadeDeUsuarios) {
        this.quantidadeDeUsuarios = _quantidadeDeUsuarios;
    }
    int getQuantidadeDeFilmes() {
        return this.quantidadeDeFilmes;
    }
    void setQuantidadeDeFilmes(int _quantidadeDeFilmes) {
        this.quantidadeDeFilmes = _quantidadeDeFilmes;
    }
    void atualizarQuantidadeDeUsuarios(int novaQuantidade) {
        this.quantidadeDeUsuarios = novaQuantidade;
    }
    void atualizarQuantidadeDeFilmes(int novaQuantidade) {
        this.quantidadeDeFilmes = novaQuantidade;
    }
}
