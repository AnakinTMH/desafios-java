import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int resposta = 0;

        System.out.println("\nDigite a opção desejada:");

        while (resposta != 4) {
            System.out.println("\n1. Adicionar novo contato");
            System.out.println("2. Consultar contatos");
            System.out.println("3. Remover contato");
            System.out.println("4. Encerrar programa");

            resposta = leitor.nextInt();

            if (resposta == 1) {
                Contato novoContato = new Contato();
                System.out.println("Digite o nome do novo contato: ");
                leitor.nextLine();
                novoContato.setNome(leitor.nextLine());

                System.out.println("Digite o telefone do novo contato: ");
                novoContato.setTelefone(leitor.nextLine());

                agenda.addContato(novoContato);
                novoContato.exibirInfo();
            } else if (resposta == 2) {
                System.out.println("\n1. Consultar contato específico");
                System.out.println("2. Exibir agenda de contatos");

                int subResposta = leitor.nextInt();

                if (subResposta == 1) {
                    System.out.println("\nDigite o nome do contato: ");
                    leitor.nextLine();
                    String consulta = leitor.nextLine();

                    Contato contatoEncontrado = agenda.buscarContato(consulta); 
                    if (contatoEncontrado != null) {
                        contatoEncontrado.exibirInfo();
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                } else if (subResposta == 2) {
                    agenda.exibirTodosContatos();
                } else {
                    System.out.println("\nOpção inválida. Tente novamente.");
                }
            } else if (resposta == 3) {
                System.out.println("\nDigite o nome do contato: ");
                leitor.nextLine();
                agenda.removerContato(leitor.nextLine());
            } else if (resposta == 4) {
                System.out.println("Encerrando o programa...");
            } else {
                System.out.println("\nOpção inválida. Tente novamente.");
            }
        }

        leitor.close();
    }
}
