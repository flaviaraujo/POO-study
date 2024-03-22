import java.util.Scanner;

public class MainEnc {
    public static void main(String[] args) {
        System.out.println("Introduza a sua encomenda");
        Scanner sc = new Scanner(System.in);
        System.out.println("Referencia: ");
        String referencia = sc.nextLine();
        System.out.println("Descricao: ");
        String descricao = sc.nextLine();
        System.out.println("Preco: ");
        double preco = sc.nextDouble();
        System.out.println("Quantidade: ");
        int quantidade = sc.nextInt();
        System.out.println("Imposto: ");  // A ordem foi trocada para imposto primeiro
        double imposto = sc.nextDouble();
        System.out.println("Desconto: "); // E desconto depois
        double desconto = sc.nextDouble();
        sc.close();

        LinhaEncomenda le = new LinhaEncomenda(referencia, descricao, preco, quantidade, imposto, desconto); // Ordem dos parâmetros corrigida
        System.out.println(String.format("Valor da linha de encomenda: %.2f", le.calculaValorLinhaEnc()));
        System.out.println(String.format("Valor do desconto: %.2f", le.calculaValorDesconto()));
        System.out.println(String.format("Valor total: %.2f", le.calculaValorLinhaEnc() - le.calculaValorDesconto()));
        System.out.println(le.getReferencia());
    }
}
