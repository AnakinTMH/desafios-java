// Arquivo: App.java

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a marca do carro:");
        String marca = scanner.nextLine();
        System.out.println("Digite o modelo do carro:");
        String modelo = scanner.nextLine();
        System.out.println("Digite o ano do carro:");
        int ano = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Digite a placa do carro:");
        String placa = scanner.nextLine();
        System.out.println("Digite a velocidade atual do carro:");
        float velocidade = scanner.nextFloat();

        Carro carro = new Carro(marca, modelo, ano, placa, velocidade);

        System.out.println("\n*** Status inicial do carro ***");
        carro.statusCarro();

        while (true) {
            System.out.println("\nSelecione uma ação:");
            System.out.println("1. Acelerar");
            System.out.println("2. Frear");
            System.out.println("3. Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    carro.acelerar();
                    break;
                case 2:
                    carro.frear();
                    break;
                case 3:
                    System.out.println("Encerrando programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

            System.out.println("\n*** Status atual do carro ***");
            carro.statusCarro();
        }
    }
}
