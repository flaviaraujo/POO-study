import java.util.Scanner;

public class Classificacoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de classificações:");
        int n = sc.nextInt();

        double[] classificacoes = new double[n];

        System.out.println("Digite as classificações dos alunos:");
        for (int i = 0; i < n; i++) {
            classificacoes[i] = sc.nextDouble();
        }

        intervalos(classificacoes);
        sc.close();
    }

    public static void intervalos(double[] classificacoes) {
        int zeroCinco = 0;
        int cincoDez = 0;
        int dezQuinze = 0;
        int quinzeVinte = 0;

        for (double classificacao : classificacoes) { // for enhanced loop (pesquisar mais sobre isso)
            if (classificacao >= 0 && classificacao < 5) {
                zeroCinco++;
            } else if (classificacao >= 5 && classificacao < 10) {
                cincoDez++;
            } else if (classificacao >= 10 && classificacao < 15) {
                dezQuinze++;
            } else if (classificacao >= 15 && classificacao <= 20) {
                quinzeVinte++;
            }
        }

        System.out.println("Intervalo [0,5[: " + zeroCinco);
        System.out.println("Intervalo [5,10[: " + cincoDez);
        System.out.println("Intervalo [10,15[: " + dezQuinze);
        System.out.println("Intervalo [15,20]: " + quinzeVinte);
    }
}
