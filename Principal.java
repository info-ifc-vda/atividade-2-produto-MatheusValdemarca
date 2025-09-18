public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Feijao", 30.99, 120);
        Produto produto2 = new Produto("Arroz", 20.95, 415);

        produto1.escreverDados();

        System.out.println("Valor total em estoque: R$ "+produto1.calcularValorTotal());

        produto1.alterarQuantidade(-15);
                System.out.println("");
        produto1.escreverDados();

        produto1.alterarQuantidade(17);
                System.out.println("");
        produto1.escreverDados();

        System.out.println("\n");



        produto2.escreverDados();

        System.out.println("Valor total em estoque: R$ "+produto1.calcularValorTotal());

        produto2.alterarQuantidade(-15);
        produto2.escreverDados();

        produto2.alterarQuantidade(17);
        produto2.escreverDados();
    }
}