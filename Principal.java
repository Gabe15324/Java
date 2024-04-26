import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sistema sistema = new Sistema();

        int opcao;

        do {
            System.out.println("===== Menu =====");
            System.out.println("1. Cadastrar Mago");
            System.out.println("2. Cadastrar Curador");
            System.out.println("3. Cadastrar Atirador");
            System.out.println("4. Buscar Personagem");
            System.out.println("5. Excluir Personagem");
            System.out.println("6. Listar todos os Personagens");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    sistema.cadastrarMago(scanner);
                    break;
                case 2:
                    sistema.cadastrarCurador(scanner);
                    break;
                case 3:
                    sistema.cadastrarAtirador(scanner);
                    break;
                case 4:
                    sistema.buscarPersonagem(scanner);
                    break;
                case 5:
                    sistema.excluirPersonagem(scanner);
                    break;
                case 6:
                    sistema.listarPersonagens();
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
