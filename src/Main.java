public class Main {

    public static void main(String[] args) {

        Loja kauan_lanches = new Loja("Kauan Lanches !");

        // produtos
        Produto x_tudo = new Produto("Lanche X tudo", 20, 15);
        Produto x_salada = new Produto("Lanche X salada", 15, 90);

        //cliente
        Cliente adrian = new Cliente("Adrian", 24, "adrian@gmail.com");
        System.out.println("Cliente: ");
        adrian.mostrarDados();

        // Adicionando produtos à loja
        kauan_lanches.criar_produto(x_tudo);
        kauan_lanches.criar_produto(x_salada);

        // Exibindo informações da loja
        kauan_lanches.exibirInf();


        // CRUD no carrinho do cliente
        System.out.println("\n--- Adicionando produtos ao carrinho ---");
        adrian.getCarrinho().adicionar_produto(x_tudo, 1);
        adrian.getCarrinho().adicionar_produto(x_salada, 2);

        System.out.println("\n--- Listando produtos no carrinho ---");
        adrian.getCarrinho().get_carrinho();
        adrian.getCarrinho().setDesconto(10);
        System.out.println("Total: R$ " + adrian.getCarrinho().getValor_total() + " Com desconto: R$ " + adrian.getCarrinho().get_total_desconto());

        System.out.println("\n--- Atualizando quantidade do X tudo ---");
        adrian.getCarrinho().atualizar_quantidade("Lanche X tudo", 3);
        adrian.getCarrinho().get_carrinho();
        adrian.getCarrinho().setDesconto(10);
        System.out.println("Total: R$ " + adrian.getCarrinho().getValor_total() + " Com desconto: R$ " + adrian.getCarrinho().get_total_desconto());

        System.out.println("\n--- Removendo o X salada ---");
        adrian.getCarrinho().remover_produto("Lanche X salada");
        adrian.getCarrinho().get_carrinho();


        //Aplicando desconto
        adrian.getCarrinho().setDesconto(10);
        System.out.println("Total: R$ " + adrian.getCarrinho().getValor_total() + " Com desconto: R$ " + adrian.getCarrinho().get_total_desconto());

    }
}
