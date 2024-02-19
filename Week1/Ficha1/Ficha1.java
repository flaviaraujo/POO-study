public class Ficha1 {
    public double converterParaFahrenheit(double grausCelsius){
        double fahrenheit = 0;
        fahrenheit = (grausCelsius * 1.8) + 32;
        return fahrenheit;
    }

    public int maximoNumeros(int a, int b) {
        return Math.max(a, b);
    }

    public String criaDescricaoConta(String nome, double saldo) {
        return "A conta de " + nome + " tem um saldo de " + saldo + " euros.";
    }

    public double eurosParaLibras(double valor, double taxaConversao) {
        taxaConversao = 0.86;
        double novovalor = valor * taxaConversao;

        return novovalor;
    }

    public String decrescenteMedia (int x, int y){
       
        int maior = Math.max(x, y);
        int menor = Math.min(x, y);
        double media = (x + y) / 2.0;

        return maior + " " + menor + " " + media;
    }
}
