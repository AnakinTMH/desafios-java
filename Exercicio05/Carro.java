// Arquivo: Carro.java

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private float velocidadeAtual;

    Carro(String marca, String modelo, int ano, String placa, float velocidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeAtual = velocidadeAtual;
    }

    Carro() {
        System.out.println("Registrando carro...");
    }

    void statusCarro() {
        System.out.println("\nMarca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Placa: " + this.placa);
        System.out.println("Velocidade: " + this.velocidadeAtual + "km/h");
    }

    // GETs e SETs

    String getMarca() {
        return this.marca;
    }

    void setMarca(String marca) {
        this.marca = marca;
    }

    String getModelo() {
        return this.modelo;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    int getAno() {
        return this.ano;
    }

    void setAno(int ano) {
        this.ano = ano;
    }

    String getPlaca() {
        return this.placa;
    }

    void setPlaca(String placa) {
        this.placa = placa;
    }

    float getVelocidadeAtual() {
        return this.velocidadeAtual;
    }

    void setVelocidadeAtual(float velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    // Frear e Acelerar
    public void frear() {
        if (this.velocidadeAtual >= 10) {
            this.velocidadeAtual -= 10;
            System.out.println("Velocidade do carro " + marca + " reduzida para: " + velocidadeAtual);
        } else {
            System.out.println("O carro está parado.");
        }
    }

    public void acelerar() {
        this.velocidadeAtual += 10;
        System.out.println("Velocidade do carro " + marca + " aumentada para: " + velocidadeAtual);
    }
}

