public class redes {
    String nomeDeUsuario;
    int numeroDeSeguidores;
    float peso;

    redes(String _nomeDeUsuario, int _numeroDeSeguidores, float _peso) {
        this.nomeDeUsuario = _nomeDeUsuario;
        this.numeroDeSeguidores = _numeroDeSeguidores;
        this.peso = _peso;
    }

    String getNomeDeUsuario() {
        return this.nomeDeUsuario;
    }
    void setNomeDeUsuario(String _nomeDeUsuario) {
        this.nomeDeUsuario = _nomeDeUsuario;
    }
    int getNumeroDeSeguidores() {
        return this.numeroDeSeguidores;
    }
    void setNumeroDeSeguidores(int _numeroDeSeguidores) {
        this.numeroDeSeguidores = _numeroDeSeguidores;
    }
    float getPeso() {
        return this.peso;
    }
    void setPeso(float _peso) {
        this.peso = _peso;
    }
    void enviarMensagem(String mensagem) {
        System.out.println("Mensagem enviada: " + mensagem);
    }
    void seguir() {
        System.out.println("Você está seguindo " + this.nomeDeUsuario);
    }
}
