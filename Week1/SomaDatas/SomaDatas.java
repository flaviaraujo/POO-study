import java.util.Scanner;

public class SomaDatas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o dia da primeira data:");
        int diaum = scanner.nextInt();

        System.out.println("Digite a hora da primeira data:");
        int horaum = scanner.nextInt();

        System.out.println("Digite os minutos da primeira data:");
        int minum = scanner.nextInt();
        
        System.out.println("Digite os segundos da primeira data:");
        int segum = scanner.nextInt();

        System.out.println("Digite o dia da segunda data:");
        int diadois = scanner.nextInt();

        System.out.println("Digite a hora da segunda data:");
        int horadois = scanner.nextInt();

        System.out.println("Digite os minutos da segunda data:");
        int mindois = scanner.nextInt();

        System.out.println("Digite os segundos da segunda data:");
        int segdois = scanner.nextInt();

        
        String resultado = calculaDatas(diaum, horaum, minum, segum, diadois, horadois, mindois, segdois);
        System.out.println("A diferença entre as datas é: " + resultado);
    

        scanner.close();
    }


    public static String calculaDatas (int diaum, int horaum, int minum, int segum, int diadois, int horadois, int mindois, int segdois) {
        int totalDias = 0;
        int totalHoras = 0;
        int totalMinutos = 0;
        int totalSegundos = 0;

        totalDias = diadois - diaum;
        totalHoras = horadois - horaum;
        totalMinutos = mindois - minum;
        totalSegundos = segdois - segum;

        if (totalSegundos < 0) {
            totalSegundos += 60;
            totalMinutos--;
        }
        if (totalMinutos < 0) {
            totalMinutos += 60;
            totalHoras--;
        }
        if (totalHoras < 0) {
            totalHoras += 24;
            totalDias--;
        }

        String d = Integer.toString(totalDias);
        String h = Integer.toString(totalHoras);
        String m = Integer.toString(totalMinutos);
        String s = Integer.toString(totalSegundos);

        return d + "D" + h + "H" + m + "M" + s + "S";

    }
}