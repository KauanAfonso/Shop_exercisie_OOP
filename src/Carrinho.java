import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private float valor_total;
    private static List<Produto> produtos_carrinho = new ArrayList<>();

    // CREATE
    public void adicionar_produto(Produto produto, int quantidade) {
        produto.setQuantidade(quantidade);
        produtos_carrinho.add(produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    // READ
    public void get_carrinho() {
        if (produtos_carrinho.isEmpty()) {
            System.out.println("Carrinho vazio.");
            return;
        }
        for (Produto produto : produtos_carrinho) {
            System.out.printf("Produto: %s - R$ %.2f - Quantidade: %d\n",
                    produto.getNome(),
                    produto.getPreco(),
                    produto.getQuantidade());
        }
    }
    // READ TOTAL
    public float getValor_total() {
        valor_total = 0; // zera antes de calcular
        for (Produto produto : produtos_carrinho) {
            valor_total += produto.getPreco() * produto.getQuantidade();
        }
        return valor_total;
    }

    // DELETE
    public void remover_produto(String nome) {
        boolean removido = produtos_carrinho.removeIf(p -> p.getNome().equalsIgnoreCase(nome));
        if (removido) {
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Produto não encontrado no carrinho.");
        }
    }

    // UPDATE
    public void atualizar_quantidade(String nome, int novaQuantidade) {
        for (Produto produto : produtos_carrinho) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produto.setQuantidade(novaQuantidade);
                System.out.println("Quantidade atualizada!");
                return;
            }
        }
        System.out.println("Produto não encontrado no carrinho.");
    }
}
