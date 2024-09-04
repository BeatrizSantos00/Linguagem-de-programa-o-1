public class chocolates {
    String nome;
    String tipo;
    String marca;

    chocolates(String _nome, String _tipo, String _marca) {
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
    void atualizarPeso(float novoPeso) {
        System.out.println("Peso atualizado para: " + novoPeso + "g");
    }
    String compararPeso(chocolates outro) {
        // Exemplo de comparação de peso (assumindo que o peso seja uma propriedade)
        // Implementação semelhante ao exemplo do salgadinho
        return "Comparação de peso entre chocolates.";
    }
}
