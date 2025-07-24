import java.util.HashMap;
import java.util.Map;

public class Loja {

    private String nome;

    public Loja(String nome){
        this.nome = nome;
    }

    //Só funciona dentro da classe
    private static Map<String, Produto> lista_produtos = new HashMap<>();

    public void criar_produto(Produto produto){
        lista_produtos.put(produto.getNome(), produto);
        System.out.println("Produto criado com sucesso !");
    }

    public void exibirInf() {
        lista_produtos.forEach((chave, valor) -> {
            System.out.printf("Produto: %s - R$ %.2f - Quantidade: %d\n",
                    valor.getNome(),
                    valor.getPreco(),
                    valor.getQuantidade());
        });
    }
}
