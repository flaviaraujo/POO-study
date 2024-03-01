import java.util.Scanner;

public class MediaTemperaturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //ler várias temperaturas separadas por espaço e armazena-as num array
        //assim o código lê uma linha de entrada que contém as temperaturas separadas
        //por espaço, converte-as para inteiros e as armazena no array temperaturas. 

        System.out.println("Digite as temperaturas:");
        String[] tempStr = sc.nextLine().split(" ");
        int[] temperaturas = new int[tempStr.length];
        for (int i = 0; i < tempStr.length; i++) {
            temperaturas[i] = Integer.parseInt(tempStr[i]);
        }

        int media = calcularMedia(temperaturas);
        System.out.println("A média das " + temperaturas.length + " temperaturas foi de " + media + " graus.");

        int[] maiorVar = variaTemp(temperaturas);
        System.out.println("A maior variação registou-se entre os dias " + (maiorVar[0] + 1) + " e " + (maiorVar[1] + 1) + ", tendo a temperatura " + ((temperaturas[maiorVar[1]] > temperaturas[maiorVar[0]]) ? "subido" : "descido") + " " + Math.abs(temperaturas[maiorVar[1]] - temperaturas[maiorVar[0]]) + " graus.");


        sc.close();
    }

    public static int calcularMedia(int[] temperaturas) {
        int soma = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            soma += temperaturas[i];
        }
        return soma / temperaturas.length;
    }

    public static int[] variaTemp(int[] temperaturas) {
        int diaMaiorVar = 0;
        int valorVar = 0;

        for (int i = 1; i < temperaturas.length; i++) {
            int var = temperaturas[i] - temperaturas[i - 1];
            if (Math.abs(var) > valorVar) {
                valorVar = Math.abs(var);
                diaMaiorVar = i;
            }
        }
        return new int[] { diaMaiorVar - 1, diaMaiorVar}; // retorna um array com os dois dias em que se registou a maior variação
    }
}
//média das temp
//o dia em que se registou a maior variação em valor absoluto relativamente ao dia anterior
// o valor efectivo (positivo ou negativo) dessa variação