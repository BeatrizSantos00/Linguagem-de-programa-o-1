import java.util.Scanner;

public class TestaClasse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        // Criação dos objetos
        salgadinho salgadinho = new salgadinho("Cheetos", "Queijo", 50f);
        redes redeSocial = new redes("user123", 1000, 2.5f);
        chocolates chocolate = new chocolates("Lacta", "Ao Leite", "Lacta");
        eletronicos eletronico = new eletronicos("Smartphone", "Samsung", 128);
        streamings streaming = new streamings("Netflix", 50000000, 10000);
        bebidas bebida = new bebidas("Coca-Cola", "Refrigerante", "Coca-Cola Company");
        jogador jogador = new jogador("Neymar", 10, 68.5f);
        times time = new times("Barcelona", 30, 25);
        modelos mulher = new modelos("Pollyanna", 25, "Loiro");
        frutas fruta = new frutas("Maçã", "Outono", 200f);

        do {
            System.out.println("Menu:");
            System.out.println("1 - Testar Salgadinho");
            System.out.println("2 - Testar Redes Sociais");
            System.out.println("3 - Testar Chocolate");
            System.out.println("4 - Testar Eletrônicos");
            System.out.println("5 - Testar Streaming");
            System.out.println("6 - Testar Bebidas");
            System.out.println("7 - Testar Jogador");
            System.out.println("8 - Testar Times");
            System.out.println("9 - Testar Modelos");
            System.out.println("10 - Testar Fruta");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Salgadinho: " + salgadinho.getNome());
                    salgadinho.setPeso(55f);
                    System.out.println("Peso atualizado: " + salgadinho.getPeso());
                    break;
                case 2:
                    System.out.println("Nome de Usuário: " + redeSocial.getNomeDeUsuario());
                    redeSocial.enviarMensagem("Olá, mundo!");
                    break;
                case 3:
                    System.out.println("Chocolate: " + chocolate.getNome());
                    chocolate.atualizarPeso(100f);
                    break;
                case 4:
                    System.out.println("Eletrônico: " + eletronico.getNome());
                    eletronico.ligar();
                    eletronico.desligar();
                    break;
                case 5:
                    System.out.println("Streaming: " + streaming.getNome());
                    streaming.atualizarQuantidadeDeUsuarios(60000000);
                    streaming.atualizarQuantidadeDeFilmes(12000);
                    break;
                case 6:
                    System.out.println("Bebida: " + bebida.getNome());
                    bebida.mostrarInformacoes();
                    bebida.compararPeso(1.5f);
                    break;
                case 7:
                    System.out.println("Jogador: " + jogador.getNome());
                    jogador.atualizarPeso(70f);
                    jogador.atualizarNumero(11);
                    break;
                case 8:
                    System.out.println("Time: " + time.getNome());
                    time.atualizarTitulos(31);
                    time.atualizarMembros(26);
                    break;
                case 9:
                    System.out.println("Mulher: " + mulher.getNome());
                    mulher.atualizarIdade(26);
                    mulher.atualizarCabelo("Castanho");
                    break;
                case 10:
                    System.out.println("Fruta: " + fruta.getNome());
                    fruta.exibirEpocaDoAno();
                    fruta.setPeso(210f);
                    System.out.println("Peso atualizado: " + fruta.getPeso());
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}

