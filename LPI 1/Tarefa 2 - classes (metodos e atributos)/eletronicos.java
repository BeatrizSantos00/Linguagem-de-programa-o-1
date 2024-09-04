public class eletronicos {
    String nome;
    String marca;
    int armazenamento;

    eletronicos(String _nome, String _marca, int _armazenamento) {
        this.nome = _nome;
        this.marca = _marca;
        this.armazenamento = _armazenamento;
    }

    String getNome() {
        return this.nome;
    }
    void setNome(String _nome) {
        this.nome = _nome;
    }
    String getMarca() {
        return this.marca;
    }
    void setMarca(String _marca) {
        this.marca = _marca;
    }
    int getArmazenamento() {
        return this.armazenamento;
    }
    void setArmazenamento(int _armazenamento) {
        this.armazenamento = _armazenamento;
    }
    void ligar() {
        System.out.println(this.nome + " está ligado.");
    }
    void desligar() {
        System.out.println(this.nome + " está desligado.");
    }
}
