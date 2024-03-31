import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Exercicio04 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        List<Jogador> guilda = new ArrayList<Jogador>();

        System.out.println("Quantos guerreiros deseja recrutar?");
        int quantidade = Integer.parseInt(leitor.nextLine());

        for(int i = 0; i < quantidade; i++) {
            Jogador novoGuerreiro = new Jogador();

            System.out.println("\nDigite o nome do guerreiro: ");
            novoGuerreiro.setNome(leitor.nextLine());

            System.out.println("Digite o nível do guerreiro: ");
            novoGuerreiro.setNivel(leitor.nextInt());

            System.out.println("Digite a pontuação do guerreiro: ");
            novoGuerreiro.setPontuacao(leitor.nextFloat());

            guilda.add(novoGuerreiro);
            leitor.nextLine(); 
        }

        System.out.println("\nExibindo todos os guerreiros e suas estatísticas:");
        for(int i = 0; i < guilda.size(); i++) {
            guilda.get(i).mostrar();
        }

        String resposta = "";

        while (!resposta.equals("alterar") && !resposta.equals("sair")) {

            System.out.println("\nDeseja alterar algum status? (Digite 'alterar')");
            System.out.println("Para sair do programa, digite 'sair'");
            resposta = leitor.nextLine();

            if (resposta.equals("alterar")) {
                System.out.println("Digite o nome do guerreiro que deseja alterar: ");
                String nomeGuerreiro = leitor.nextLine();

                boolean guerreiroEncontrado = false;

                for (Jogador guerreiro : guilda) {
                    if (guerreiro.getNome().equalsIgnoreCase(nomeGuerreiro)) {
                        guerreiro.mostrar();
                        guerreiroEncontrado = true;
                        
                        System.out.println("O que você deseja alterar?");
                        System.out.println("1. Nome");
                        System.out.println("2. Nível");
                        System.out.println("3. Pontuação");
                        int opcao = leitor.nextInt();
                        leitor.nextLine();
                        
                        if (opcao == 1) {
                            System.out.println("Digite o novo nome: ");
                            String novoNome = leitor.nextLine();
                            guerreiro.setNome(novoNome);
                        } else if (opcao == 2) {
                            System.out.println("Digite o novo nível: ");
                            int novoNivel = leitor.nextInt();
                            guerreiro.setNivel(novoNivel);
                        } else if (opcao == 3) {
                            System.out.println("Digite a nova pontuação: ");
                            float novaPontuacao = leitor.nextFloat();
                            guerreiro.setPontuacao(novaPontuacao);
                        } else {
                            System.out.println("Opção inválida.");
                        }
                        guerreiro.mostrar();
                        
                        break; 
                    }
                }
                
                if (!guerreiroEncontrado) {
                    System.out.println("Guerreiro não encontrado.");
                }
            } 
        }

        System.out.println("Encerrando programa.");

        leitor.close();

    }
}
