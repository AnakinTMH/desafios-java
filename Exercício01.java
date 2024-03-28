import java.util.Scanner;

public class Exercício01 {
    public static void main(String[] args) {

        Scanner resp = new Scanner(System.in);

        Ex01Calculadora calculadora = new Ex01Calculadora();

        System.out.println("Insira o primeiro número: ");
        float num1 = resp.nextFloat();

        System.out.println("Qual operação deseja Fazer?");
        System.out.println("Insira o simbolo da Operação desejada:");
        System.out.println(" '+' , '-' , '*' , ou '/' ?");
        String operacao = resp.next();

        while (!operacao.equals("+") && !operacao.equals("-")  && !operacao.equals("*")  && !operacao.equals("/")) {
            System.out.println("Insira uma Operação válida");
            System.out.println(" '+' , '-' , '*' , ou '/' ?");
            operacao = resp.next();
        }

        System.out.println("Insira o segundo número: ");
        float num2 = resp.nextFloat();

        if (operacao.equals("+")) {
            System.out.println("O resultado de sua operacao é : " + calculadora.Adicao(num1, num2));
        }
        else if (operacao.equals("-")) {
            System.out.println("O resultado de sua operação é : " + calculadora.Subtracao(num1, num2));
        }
        else if (operacao.equals("*")) {
            System.out.println("O resultado de sua operação é : " + calculadora.Multiplicacao(num1, num2));
        }
        else if (operacao.equals("/")) {
            System.out.println("O resultado de sua operação é : " + calculadora.Divisao(num1, num2));
        }

        resp.close();

    }
}
