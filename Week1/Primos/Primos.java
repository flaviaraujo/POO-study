import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         boolean jogarNovamente = true;
        while (jogarNovamente) {
            System.out.print("Digite um número inteiro positivo: ");
            int n = sc.nextInt();

            System.out.println("Números primos menores que " + n + ":");
            for (int i = 2; i < n; i++) {
                if (ePrimo(i)) {
                    System.out.print(i + " ");
                }
            }

            System.out.println("\nDeseja jogar novamente? (S/N)");
            String resposta = sc.next();
            if (!resposta.equalsIgnoreCase("S")) { // Este método equalsIgnoreCase compara a resposta fornecida pelo usuário com "S",
            jogarNovamente = false;                // ignorando diferenças entre maiúsculas e minúsculas
            }
        }

        sc.close();
    
    }


      public static boolean ePrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Se o número for divisível por algum número diferente de 1 e ele mesmo, não é primo
            }
        }
        return true;
    }
}

