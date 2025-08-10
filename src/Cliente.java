import java.util.Date;

public class Cliente {
    private String nome;
    private int idade;
    private String email;
    private Carrinho carrinho;

    public Cliente(String nome, int idade , String email){
        this.idade = idade;
        this.nome = nome;
        this.email = email;
        this.carrinho = new Carrinho();
    }

    public void mostrarDados(){
        System.out.printf("Cliente: %s - Email: %s \n", this.nome, this.email);
    }

    public Carrinho getCarrinho(){
        return this.carrinho;
    }

}
