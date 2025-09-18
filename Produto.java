import java.util.Scanner;

public class Produto {
    String nome;
    double valor;
    int quantidade;

    Scanner scanner = new Scanner(System.in);

    public Produto(String nome, double valor, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public void escreverDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Valor: " + valor);
        System.out.println("Quantidade: " + quantidade);
    }

    public double calcularValorTotal() {
        return valor * quantidade;
    }

    public void alterarQuantidade(int quantidadeAlterada) {
        this.quantidade += quantidadeAlterada;
        System.out.println("Quantidade alterada - Novo estoque: " + quantidade);
    }
}
