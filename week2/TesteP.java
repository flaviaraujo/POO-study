import java.util.Scanner;
import java.util.Arrays;

public class TesteP {

//---------------------ex1 e 3-----------------------------------
    public static int[] lerArray(Scanner sc){

        System.out.print("Quantos números vai ler? "); 
        int tam = sc.nextInt();

        int[] num = new int[tam];
        System.out.print("Insira " + tam + " números: ");
        for(int i = 0; i < tam; i++){
            num[i] = sc.nextInt();
        }
        return num;
    }


//---------------------ex4-----------------------------------

    public static String[] lerStrings(Scanner sc){

        System.out.print("Quantas strings vai ler? "); 
        int tam = sc.nextInt();

        // Consumir a quebra de linha pendente
        sc.nextLine();

        String[] strings = new String[tam];
        for(int i = 0; i < tam; i++){
            System.out.print("Insira a string " + (i+1) + ": ");
            strings[i] = sc.nextLine();
            System.out.println(strings[i]);
        }
        return strings;
    }

//---------------------main-----------------------------------

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 

        System.out.println("Exercicios 1(a,b e c): leitura e escrita de arrays");
        System.out.println("Exercicios 3(a e b): sorting e procura em arrays");
        System.out.println("Exercicios 4(a e b): leitura e escrita de strings");
        System.out.print("Escolha o exercício que quer testar: ");

        int ex = sc.nextInt();
        switch (ex) {
            case 1:
                //---------------------ex1a-----------------------------------

                int[] array = lerArray(sc);

                Ficha2 ex1 = new Ficha2(); 
                int minimo = ex1.minimo(array);
                System.out.println("O valor mínimo é: " + minimo);

                //---------------------ex1b-----------------------------------
        
                int[] array2 = lerArray(sc);

                System.out.print("Os valores dos índices são: ");
                int i = sc.nextInt();
                int f = sc.nextInt();

                Ficha2 ex2 = new Ficha2(); 
                int[] subArray = ex2.entreIndices(array2, i, f);

                System.out.print("O subarray é: [");
                
                for (int j = 0; j < subArray.length - 1; j++) {
                    System.out.print((subArray[j] + ", "));
                }
                System.out.print(subArray[subArray.length - 1] + "]");

                //---------------------ex1c-----------------------------------

                int[] array3 = lerArray(sc);
                int[] array4 = lerArray(sc);

                Ficha2 ex3 = new Ficha2();
                int[] comuns = ex3.comuns(array3, array4);

                System.out.print("Os valores comuns são: [");
                for (int j = 0; j < comuns.length - 1; j++) {
                    System.out.print(comuns[j] + ", ");
                }
                System.out.print(comuns[comuns.length - 1] + "]");
                
                break;

            case 3:
                //---------------------ex3a----------------------------------

                int[] array5 = lerArray(sc);

                Ficha2 ex3a = new Ficha2();
                int[] ord = ex3a.ordenaCrescente(array5);

                System.out.println("O array ordenado: " + Arrays.toString(ord));

                //---------------------ex3b----TODO-------------------------------

                break;

            case 4:
                //---------------------ex4a----------------------------------
                String[] strings = lerStrings(sc);

                Ficha2 ex4a = new Ficha2();
                String[] diferentes = ex4a.stringsExistentes(strings);
                System.out.println("As string sem duplicados fica: " + Arrays.toString(diferentes));
                break;
        
            default:
                System.out.println("Escolha um exercício válido");
                break;
        }
        main(args);
    }
}