public class TesteP {

    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        c1.setX(1);
        c1.setY(1);
        c1.setR(4); 

        double a = c1.calculaArea();
        System.out.println("A área do círculo é: " + a);
        System.out.println("O perímetro do círculo é: " + c1.calculaPerimetro());
    }
}