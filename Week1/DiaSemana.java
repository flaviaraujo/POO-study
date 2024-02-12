import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite o dia (1..31):");
    int dia = scanner.nextInt();

    System.out.println("Digite o mês (1..12):");
    int mes = scanner.nextInt();

    System.out.println("Digite o ano:");
    int ano = scanner.nextInt();

    int diaDaSemana = calcularDiaSemana(dia, mes, ano);
    System.out.println("O dia da semana é: " + diaDaSemana);
    
    scanner.close(); // Fechar o scanner após o uso
    }

    public static int calcularDiaSemana(int dia, int mes, int ano) {

        // (a) Calcular o número total de dias desde 01/01/1900
        int totalDias = (ano - 1900) * 365;
        totalDias += ano - 1900; // Adicionar anos
        if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0) && (mes == 1 || mes == 2)) {
            totalDias--; // Subtrair 1 para anos bissextos em janeiro ou fevereiro
        }

        // Adicionar os dias já passados no corrente ano (considere 28 dias para fevereiro)
        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 1; i < mes; i++) {
            totalDias += diasPorMes[i];
        }
        totalDias += dia;

        // (b) Calcular a divisão inteira por 7
        //int divisaoInteira = totalDias / 7; ------Não é usado---------

        // (c) Calcular o resto, que é o dia da semana
        int diaDaSemana = totalDias % 7;
        return diaDaSemana;
    }
}