import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    private ArrayList<Personagem> listaPersonagens = new ArrayList<>();

    public void cadastrarPersonagem(Scanner scanner) {
        System.out.println("===== Cadastrar Personagem =====");
        System.out.println("Selecione o tipo de personagem:");
        System.out.println("1. Mago");
        System.out.println("2. Curador");
        System.out.println("3. Atirador");
        System.out.print("Escolha uma opção: ");
        int tipoPersonagem = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        switch (tipoPersonagem) {
            case 1:
                cadastrarMago(scanner);
                break;
            case 2:
                cadastrarCurador(scanner);
                break;
            case 3:
                cadastrarAtirador(scanner);
                break;
            default:
                System.out.println("Opção inválida! Tente novamente.");
                break;
        }
    }

    public void cadastrarMago(Scanner scanner) {
        System.out.println("===== Cadastrar Mago =====");
        System.out.print("Digite o nome do mago: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o tipo de magia do mago: ");
        String tipoMagia = scanner.nextLine();
        System.out.print("Digite o ataque do mago: ");
        int ataque = scanner.nextInt();
        System.out.print("Digite a defesa do mago: ");
        int defesa = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        Mago novoMago = new Mago(nome, ataque, defesa);
        listaPersonagens.add(novoMago);

        System.out.println("Mago cadastrado com sucesso!");
    }

    public void cadastrarCurador(Scanner scanner) {
        System.out.println("===== Cadastrar Curador =====");
        System.out.print("Digite o nome do curador: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o poder de cura do curador: ");
        String poderCura = scanner.nextLine();
        System.out.print("Digite o ataque do curador: ");
        int ataque = scanner.nextInt();
        System.out.print("Digite a defesa do curador: ");
        int defesa = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        Curador novoCurador = new Curador(nome, ataque, defesa);
        listaPersonagens.add(novoCurador);

        System.out.println("Curador cadastrado com sucesso!");
    }

    public void cadastrarAtirador(Scanner scanner) {
        System.out.println("===== Cadastrar Atirador =====");
        System.out.print("Digite o nome do atirador: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o poder de artilharia do atirador: ");
        String poderArtilharia = scanner.nextLine();
        System.out.print("Digite o ataque do atirador: ");
        int ataque = scanner.nextInt();
        System.out.print("Digite a defesa do atirador: ");
        int defesa = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        Atirador novoAtirador = new Atirador(nome, ataque, defesa);
        listaPersonagens.add(novoAtirador);

        System.out.println("Atirador cadastrado com sucesso!");
    }

    public void buscarPersonagem(Scanner scanner) {
        System.out.println("===== Buscar Personagem =====");
        System.out.print("Digite o nome do personagem: ");
        String nome = scanner.nextLine();

        boolean encontrado = false;
        for (Personagem personagem : listaPersonagens) {
            if (personagem.getNome().equalsIgnoreCase(nome)) {
                System.out.println(personagem);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Este personagem não existe.");
        }
    }

    public void excluirPersonagem(Scanner scanner) {
        System.out.println("===== Excluir Personagem =====");
        listarPersonagens();

        System.out.print("Digite o nome do personagem que deseja excluir: ");
        String nome = scanner.nextLine();

        for (int i = 0; i < listaPersonagens.size(); i++) {
            if (listaPersonagens.get(i).getNome().equalsIgnoreCase(nome)) {
                listaPersonagens.remove(i);
                System.out.println("Personagem excluído com sucesso!");
                return;
            }
        }

        System.out.println("Este personagem não existe.");
    }

    public void listarPersonagens() {
        System.out.println("===== Lista de Personagens =====");
        if (listaPersonagens.isEmpty()) {
            System.out.println("Não há personagens cadastrados.");
        } else {
            for (Personagem personagem : listaPersonagens) {
                System.out.println(personagem);
            }
        }
    }
}
