import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void addContato(Contato contato) {
        contatos.add(contato);
    }

    public Contato buscarContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null;
    }

    public void exibirTodosContatos() {
        if (contatos.isEmpty()) {
            System.out.println("\nA agenda está vazia.");
        } else {
            System.out.println("\nLista de contatos:");
            for (Contato contato : contatos) {
                contato.exibirInfo();
            }
        }
    }

    public void removerContato(String nome) {
        Contato contatoRemover = null;
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contatoRemover = contato;
                break;
            }
        }
        if (contatoRemover != null) {
            contatos.remove(contatoRemover);
            System.out.println("\nContato removido com sucesso.");
        } else {
            System.out.println("\nContato não encontrado.");
        }
    }
}

