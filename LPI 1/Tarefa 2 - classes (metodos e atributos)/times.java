public class times {
    String nome;
    int titulos;
    int quantidadeDeMembros;

    times(String _nome, int _titulos, int _quantidadeDeMembros) {
        this.nome = _nome;
        this.titulos = _titulos;
        this.quantidadeDeMembros = _quantidadeDeMembros;
    }

    String getNome() {
        return this.nome;
    }
    void setNome(String _nome) {
        this.nome = _nome;
    }
    int getTitulos() {
        return this.titulos;
    }
    void setTitulos(int _titulos) {
        this.titulos = _titulos;
    }
    int getQuantidadeDeMembros() {
        return this.quantidadeDeMembros;
    }
    void setQuantidadeDeMembros(int _quantidadeDeMembros) {
        this.quantidadeDeMembros = _quantidadeDeMembros;
    }
    void atualizarTitulos(int novosTitulos) {
        this.titulos = novosTitulos;
    }
    void atualizarMembros(int novaQuantidade) {
        this.quantidadeDeMembros = novaQuantidade;
    }
}
