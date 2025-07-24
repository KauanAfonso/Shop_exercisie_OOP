public class Main {

    public static void main(String[] args) {
        Loja kauan_lanches = new Loja("Kauan Lanches !");

        Produto x_tudo = new Produto("Lanche X tudo", 80, 15);
        Produto x_salada = new Produto("Lanche X salada", 55, 90);

        Cliente adrian = new Cliente("Adrian", 24, "adrian@gmail.com");
        adrian.mostrarDados();

        kauan_lanches.criar_produto(x_tudo);
        kauan_lanches.criar_produto(x_salada);

        kauan_lanches.exibirInf();
    }
}