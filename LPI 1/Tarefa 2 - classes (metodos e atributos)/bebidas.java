public class bebidas {
    String nome;
    String tipo;
    String marca;

    bebidas(String _nome, String _tipo, String _marca) {
        this.nome = _nome;
        this.tipo = _tipo;
        this.marca = _marca;
    }

    String getNome() {
        return this.nome;
    }
    void setNome(String _nome) {
        this.nome = _nome;
    }
    String getTipo() {
        return this.tipo;
    }
    void setTipo(String _tipo) {
        this.tipo = _tipo;
    }
    String getMarca() {
        return this.marca;
    }
    void setMarca(String _marca) {
        this.marca = _marca;
    }
    void compararPeso(float outroPeso) {
        System.out.println("Comparando peso...");
    }
    void mostrarInformacoes() {
        System.out.println("Nome: " + this.nome + ", Tipo: " + this.tipo + ", Marca: " + this.marca);
    }
}
