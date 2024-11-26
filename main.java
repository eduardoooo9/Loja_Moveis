import models.Mesa;
import models.Cadeira;
import models.Estante;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de Móveis");

        // Mesa
        System.out.print("Digite o ID da mesa: ");
        int idMesa = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o nome da mesa: ");
        String nomeMesa = scanner.nextLine();
        System.out.print("Digite o preço da mesa: ");
        float precoMesa = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Digite o tipo da mesa: ");
        String tipoMesa = scanner.nextLine();
        System.out.print("Digite a dimensão da mesa: ");
        String dimensaoMesa = scanner.nextLine();
        Mesa mesa1 = new Mesa(idMesa, nomeMesa, precoMesa, tipoMesa, dimensaoMesa);

        // Cadeira
        System.out.print("\nDigite o ID da cadeira: ");
        int idCadeira = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o nome da cadeira: ");
        String nomeCadeira = scanner.nextLine();
        System.out.print("Digite o preço da cadeira: ");
        float precoCadeira = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Digite o material da cadeira: ");
        String materialCadeira = scanner.nextLine();
        System.out.print("Digite o tipo de assento da cadeira: ");
        String tipoAssentoCadeira = scanner.nextLine();
        Cadeira cadeira1 = new Cadeira(idCadeira, nomeCadeira, precoCadeira, materialCadeira, tipoAssentoCadeira);

        // Estante
        System.out.print("\n Digite o ID da estante: ");
        int idEstante = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o nome da estante: ");
        String nomeEstante = scanner.nextLine();
        System.out.print("Digite o preço da estante: ");
        float precoEstante = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Digite a cor da estante: ");
        String corEstante = scanner.nextLine();
        System.out.print("Digite a largura da estante: ");
        float larguraEstante = scanner.nextFloat();
        Estante estante1 = new Estante(idEstante, nomeEstante, precoEstante, corEstante, larguraEstante);

        System.out.println("\n Detalhes do Móvel:");
        mesa1.mostrarDetalhes();
        cadeira1.mostrarDetalhes();
        estante1.mostrarDetalhes();

        scanner.close();
    }
}
