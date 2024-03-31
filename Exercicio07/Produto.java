import java.util.List;
import java.util.ArrayList;

public class Produto {
    
    private String nome;
    private int codigo;
    private int quantidade;
    private float preco;

    private List<Produto> produtos; 

    public Produto() {
        this.produtos = new ArrayList<>(); 
    }

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(int codigo) {
        Produto produtoRemovido = null;
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigo) {
                produtoRemovido = produto;
                break;
            }
        }
        if (produtoRemovido != null) {
            produtos.remove(produtoRemovido);
            System.out.println("\nProduto removido com sucesso!");
        } else {
            System.out.println("\nProduto não encontrado.");
        }
    }

    public Produto buscarProduto(int codigo) {
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigo) {
                return produto;
            }
        }
        return null;
    }


    public void exibirInfo() {
        System.out.println("\nProduto: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Quantidade em estoque: " + quantidade);
        System.out.println("Preço: " + preco);
    }


    public void valorTotal() {
        float totalPreco = 0;
        int totalQuantidade = 0;
    
        for (Produto produto : produtos) {
            totalPreco += produto.getPreco() * produto.getQuantidade();
            totalQuantidade += produto.getQuantidade();
        }

        System.out.println("\nQuantidade de produtos cadastrados: " + produtos.size());
        System.out.println("Total de produtos em estoque: " + totalQuantidade);
        System.out.println("Valor total em estoque: " + totalPreco);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        System.out.println("\nNome registrado: " + nome);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
        System.out.println("\nCódigo registrado: " + codigo);
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        System.out.println("\nQuantidade registrada: " + quantidade);
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
        System.out.println("\nPreço registrado: " + preco);
    }
}
