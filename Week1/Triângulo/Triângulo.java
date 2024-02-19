import java.util.Scanner;

public class Triângulo {
    public static void main(String[] args) {
        double base = 0.0;
        double altura = 0.0;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Digite a base do triângulo (0 para sair): ");
            base = sc.nextDouble();

        if (base == 0.0) break;

        System.out.print("Digite a altura do triângulo: ");
            altura = sc.nextDouble();    

        double area = (base * altura) / 2;
        double perimetro = base + altura + Math.sqrt((base * base) + (altura * altura)); //p/ser triang. retângulo
        
        //imprimir resultados com precisão de 5 casas decimais
        System.out.printf("Área: %.5f\n", area);
        System.out.printf("Perímetro: %.5f\n", perimetro);

        }
        sc.close();
    }
}
