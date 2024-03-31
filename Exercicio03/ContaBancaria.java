public class ContaBancaria {

    private static int proximoNumeroConta = 0;
    private int numeroConta;
    private String nomeTitular;
    private float saldo;

    ContaBancaria(String nomeTitular) {
        this.numeroConta = proximoNumeroConta++;
        this.nomeTitular = nomeTitular;
    }

    void sacar(float valor) {
        this.saldo = this.saldo - valor;
        
        System.out.println("\nFeito o saque no valor: R$" + valor);
        System.out.println("Saldo restante: R$" + this.saldo);
    }

    void depositar(float valor) {
        this.saldo = this.saldo + valor;
        
        System.out.println("\nFeito o depósito no valor: R$" + valor);
        System.out.println("Saldo atualizado: R$" + this.saldo);
    }

    void consultar() {
        System.out.println("O saldo atual é de: R$" + this.saldo);
    }

    // GET e SET

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public float getSaldo() {
        return this.saldo;
    }
}
