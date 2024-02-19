import java.time.LocalDateTime;
import java.util.Scanner;

public class IdadeHoras {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade, em anos: ");
        int idade = sc.nextInt();

        LocalDateTime currentDateTime = LocalDateTime.now();

        int horas = idade * 365 * 24;
        System.out.println("Você viveu aproximadamente " + horas + " horas.");
        System.out.println("A data e hora atuais são: " + currentDateTime);

        sc.close();
    }
}