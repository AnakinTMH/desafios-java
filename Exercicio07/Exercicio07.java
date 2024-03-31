import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Exercicio07 {
    public static void main(String[] args) {
        System.out.println("### GERENCIADOR DE ESTOQUE ###");

        Scanner leitor = new Scanner(System.in);
        Produto produto = new Produto(); 
        List<Produto> estoque = new ArrayList<Produto>();

        System.out.println("\nDigite a opção desejada:");

        int resposta = 0;

        while (resposta != 4) {
            System.out.println("\n1. Consultar estoque");
            System.out.println("2. Adicionar produto ao estoque");
            System.out.println("3. Remover produto do estoque");
            System.out.println("4. Encerrar programa ");

            resposta = leitor.nextInt();
            leitor.nextLine();

            if (resposta == 1) {
                System.out.println("\n1. Consultar produto específico");
                System.out.println("2. Consultar estoque completo");

                int subResposta = leitor.nextInt();
                leitor.nextLine();

                if (subResposta == 1) {
                    System.out.println("Digite o código do produto:");
                    int consulta = leitor.nextInt();

                    Produto produtoEncontrado = produto.buscarProduto(consulta); 
                    if (produtoEncontrado != null) {
                        produtoEncontrado.exibirInfo();
                    } else {
                        System.out.println("\nProduto não encontrado :/");
                    }
                } else if (subResposta == 2) {
                    System.out.println("\nConsultando estoque:");
                    for (Produto p : estoque) {
                        p.exibirInfo();
                    }
                    produto.valorTotal();
                } else {
                    System.out.println("\nOpção inválida.");
                }
            } else if (resposta == 2) {
                Produto novoProduto = new Produto();
                System.out.println("Digite o nome do produto:");
                novoProduto.setNome(leitor.nextLine());

                System.out.println("Digite o código do produto:");
                novoProduto.setCodigo(leitor.nextInt());
                leitor.nextLine();

                System.out.println("Digite a quantidade de produtos:");
                novoProduto.setQuantidade(leitor.nextInt());
                leitor.nextLine();

                System.out.println("Digite o valor unitário do produto:");
                novoProduto.setPreco(leitor.nextFloat());
                leitor.nextLine();

                produto.addProduto(novoProduto);
                novoProduto.exibirInfo();
            } else if (resposta == 3) {
                System.out.print("\nDigite o código do produto:");
                produto.removerProduto(leitor.nextInt());
            } else if (resposta == 4) {
                System.out.println("\nEncerrando o programa...");
            } else {
                System.out.println("Opção inválida.");
            }
        }

        leitor.close();
    }
}
