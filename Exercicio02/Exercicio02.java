import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Exercicio02 {
    public static void main(String[] args) {

        System.out.println("* Armazenamento de Livros *");

        Scanner scanner = new Scanner(System.in);
        List<Livro> catalogo = new ArrayList<Livro>();

        String resposta = "";

        while (!resposta.equals("sair")) {
            System.out.println("\nPara consultar um livro, digite 'Consultar'");
            System.out.println("Para adicionar um livro, digite 'Adicionar'");
            System.out.println("Para encerrar o programa, digite 'sair': ");
    
            resposta = scanner.next().toLowerCase();
            while (!resposta.equals("consultar") && !resposta.equals("adicionar") && !resposta.equals("sair")) {
                System.out.println("Resposta inválida.");
                System.out.println("Digite 'Consultar' para consultar ou 'Adicionar' para adicionar um livro a lista: ");
                resposta = scanner.next().toLowerCase();
            }
    
            if (resposta.equals("adicionar")) {
                System.out.println("Quantos livros deseja adicionar?");
                int quantidade = scanner.nextInt();
                scanner.nextLine(); 
                for(int i = 0; i < quantidade; i++) {
                    Livro novoLivro = new Livro();
            
                    System.out.println("Insira o título do livro: ");
                    novoLivro.setTitulo(scanner.nextLine());
            
                    System.out.println("Insira o autor do livro: ");
                    novoLivro.setAutor(scanner.nextLine());
            
                    System.out.println("Insira o ano de lançamento do livro: ");
                    novoLivro.setAno(scanner.nextInt());
                    scanner.nextLine(); 
            
                    catalogo.add(novoLivro);
    
                    System.out.println("* Adicionado ao catálogo *");
                }
                for(int i = 0; i < catalogo.size(); i++){
                    catalogo.get(i).exibirInfo();
                }
            }
            
            else if (resposta.equals ("consultar")){
                System.out.println("Qual livro deseja consultar?");
                scanner.nextLine();
                String consulta = scanner.nextLine();
                boolean livroEncontrado = false;
                
                for (Livro livro : catalogo) {
                    if (livro.getTitulo().equalsIgnoreCase(consulta)) {
                        livro.exibirInfo();
                        livroEncontrado = true;
                        break; 
                    }
                }
                
                if (!livroEncontrado) {
                    System.out.println("* Livro não cadastrado *");
                }
            } 
            else {
                System.out.println("* Encerrando programa *");
            }
            
        }
        
        scanner.close();
            
    }
        
}
