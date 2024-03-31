import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Exercicio03 {
    public static void main(String[] args) throws Exception {
        System.out.println("\n--- Gerenciamento de contas bancárias ---");
        
        Scanner leitor = new Scanner(System.in);
        List<ContaBancaria> banco = new ArrayList<ContaBancaria>();

        String resposta = "";

        while (!resposta.equals("sair")) {
            System.out.println("\nPara criar nova conta, digite 'criar'");
            System.out.println("Para entrar em conta existente, digite 'entrar'");
            System.out.println("Para sair do programa, digite 'sair'");
            resposta = leitor.nextLine().toLowerCase();

            while (!resposta.equals("criar") && !resposta.equals("entrar") && !resposta.equals("sair")) {
                System.out.println("\n'criar', 'entrar' ou 'sair'");
                resposta = leitor.nextLine().toLowerCase();
            }

            if (resposta.equals("criar")) {
                System.out.println("--- Criando nova conta ---");
                System.out.println("Insira o nome do titular da conta: ");

                String titular = leitor.nextLine();
                ContaBancaria novaConta = new ContaBancaria(titular);

                banco.add(novaConta);

                System.out.println("\nConta criada com sucesso!");
                System.out.println("Titular da conta: " + novaConta.getNomeTitular());
                System.out.println("Número da conta: " + novaConta.getNumeroConta());
                System.out.println("Saldo atual: R$" + novaConta.getSaldo());

                System.out.println("\nPara realizar operações, entre com sua conta no sistema.");
            } else if (resposta.equals("entrar")) {
                System.out.println("\nInsira o número da conta: ");
                int acesso = leitor.nextInt();
                boolean contaExistente = false;

                for (ContaBancaria conta : banco) {
                    if (conta.getNumeroConta() == acesso) {
                        contaExistente = true;
                        conta.consultar();

                        System.out.println("\nPara realizar um depósito, digite 'depositar'");
                        System.out.println("Para realizar um saque, digite 'sacar'");
                        System.out.println("Para sair do programa, digite 'sair'");
                        leitor.nextLine();
                        String operacao = leitor.nextLine().toLowerCase();

                        while (!operacao.equals("depositar") && !operacao.equals("sacar") && !operacao.equals("sair")) {
                            System.out.println("Entrada inválida. Insira a operação que deseja realizar.");
                            operacao = leitor.nextLine().toLowerCase();
                        }

                        if (operacao.equals("depositar")) {
                            System.out.println("--- Depósito ---");
                            System.out.println("Insira o valor a ser depositado: ");
                            conta.depositar(leitor.nextFloat());

                            System.out.println("Para realizar outra operação, entre novamente na conta.");
                        } else if (operacao.equals("sacar")) {
                            System.out.println("--- Saque ---");
                            System.out.println("Insira o valor a ser retirado: ");
                            conta.sacar(leitor.nextFloat());

                            System.out.println("Para realizar outra operação, entre novamente na conta.");
                        } else if (operacao.equals("sair")) {
                            resposta = operacao;
                        }
                    }
                }

                if (!contaExistente) {
                    System.out.println("\nConta inexistente no sistema.");
                }
            }
        }

        System.out.println("--- Encerrando programa ---");
        leitor.close();
    }
}

