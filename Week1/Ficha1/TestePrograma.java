import java.util.Scanner;

public class TestePrograma {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Ficha1 f = new Ficha1();

    System.out.println("Digite os graus em Celsius:");
    double grausCelsius = sc.nextDouble();
    double fahrenheit = f.converterParaFahrenheit(grausCelsius);
    System.out.println("Temperatura em Fahrenheit: " + fahrenheit);


    System.out.println("Digite dois números inteiros:");
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(Math.max(a, b));

    System.out.println("Digite o nome");
    String nome = sc.next();
    System.out.println("Digite o saldo");
    double saldo = sc.nextDouble();
    System.out.println("A conta de " + nome + " tem um saldo de " + saldo + " euros.");

    System.out.println("Digite o valor em euros:");
    double valor = sc.nextDouble();
    System.out.println("O valor em libras é: " + f.eurosParaLibras(valor, 0.86));

    System.out.println("Digite dois números inteiros:");
    int x = sc.nextInt();
    int y = sc.nextInt();
    
    System.out.println("A ordem decrescente dos números é: " + f.decrescenteMedia(x, y) + " e a média é: " + f.decrescenteMedia(x, y));

    //TPC TERMINAR AAAAA

    sc.close();
    }
}
