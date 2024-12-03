import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação de uma mesa
        System.out.println(" Cadastro de Mesa ");
        System.out.print("Nome da Mesa: ");
        String nomeMesa = scanner.nextLine();
        System.out.print("Preço da Mesa: ");
        float precoMesa = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Tipo da Mesa: ");
        String tipoMesa = scanner.nextLine();
        System.out.print("Dimensão da Mesa: ");
        String dimensaoMesa = scanner.nextLine();
        Mesa mesa = new Mesa(1, nomeMesa, precoMesa, tipoMesa, dimensaoMesa);

        // Adicionando pernas a mesa
        System.out.print("Quantidade de Pernas da Mesa: ");
        int quantidadePernas = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < quantidadePernas; i++) {
            System.out.print("Material da Perna " + (i + 1) + ": ");
            String materialPerna = scanner.nextLine();
            mesa.adicionarPerna(new Pernas(materialPerna, quantidadePernas));
        }

        // Criação de uma cadeira
        System.out.println("\n Cadastro de Cadeira ");
        System.out.print("Nome da Cadeira: ");
        String nomeCadeira = scanner.nextLine();
        System.out.print("Preço da Cadeira: ");
        float precoCadeira = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Material da Cadeira: ");
        String materialCadeira = scanner.nextLine();
        System.out.print("Tipo de Assento da Cadeira: ");
        String tipoAssentoCadeira = scanner.nextLine();
        Cadeira cadeira = new Cadeira(2, nomeCadeira, precoCadeira, materialCadeira, tipoAssentoCadeira);

        // Criação de uma estante
        System.out.println("\n Cadastro de Estante ");
        System.out.print("Nome da Estante: ");
        String nomeEstante = scanner.nextLine();
        System.out.print("Preço da Estante: ");
        float precoEstante = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Cor da Estante: ");
        String corEstante = scanner.nextLine();
        System.out.print("Largura da Estante: ");
        float larguraEstante = scanner.nextFloat();
        scanner.nextLine();
        Estante estante = new Estante(3, nomeEstante, precoEstante, corEstante, larguraEstante);

        // Adicionando prateleira a estante
        System.out.print("Material da Prateleira: ");
        String materialPrateleira = scanner.nextLine();
        System.out.print("Espessura da Prateleira: ");
        float espessuraPrateleira = scanner.nextFloat();
        scanner.nextLine();
        estante.setPrateleira(new Prateleira(materialPrateleira, espessuraPrateleira));

        // Exibindo os dados
        System.out.println("\n Dados Cadastrados ");
        System.out.println("\nMesa:");
        System.out.println("Nome: " + mesa.getNome());
        System.out.println("Preço: " + mesa.getPreco());
        System.out.println("Tipo: " + mesa.getTipo());
        System.out.println("Dimensão: " + mesa.getDimensao());
        System.out.println("Pernas:");
        for (Pernas perna : mesa.getPernas()) {
            System.out.println("  Material: " + perna.getMaterial());
        }

        System.out.println("\nCadeira:");
        System.out.println("Nome: " + cadeira.getNome());
        System.out.println("Preço: " + cadeira.getPreco());
        System.out.println("Material: " + cadeira.getMaterial());
        System.out.println("Tipo de Assento: " + cadeira.getTipoAssento());

        System.out.println("\nEstante:");
        System.out.println("Nome: " + estante.getNome());
        System.out.println("Preço: " + estante.getPreco());
        System.out.println("Cor: " + estante.getCor());
        System.out.println("Largura: " + estante.getLargura());
        System.out.println("Prateleira - Material: " + estante.getPrateleira().getMaterial());
        System.out.println("Prateleira - Espessura: " + estante.getPrateleira().getEspessura());

        scanner.close();
    }
}
