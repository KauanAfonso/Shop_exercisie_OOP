import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Produto{
    private String nome;
    private Float preco;
    private int quantidade;

    public Produto(String nome, float preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return  this.nome;
    }

    public Float getPreco(){
        return this.preco;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public int setQuantidade(int quantidade){
        return this.quantidade = quantidade;
    }

}
