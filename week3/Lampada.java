import java.time.LocalDateTime;

public class Lampada {
    public static final int OFF = 0;
    public static final int ON = 1;
    public static final int ECO = 2;
    private int modo;

    private final double consumoNormal = 0.1;
    private final double consumoEco = 0.05;
    private double total;
    private double ultima;

    private LocalDateTime stamp;

    public Lampada() {
        this.modo = OFF;
        this.total = 0;
        this.ultima = 0;
        this.stamp = LocalDateTime.now();
    }

    public Lampada(int modo, double total, double ultima, LocalDateTime stamp) {
        this.modo = modo;
        this.total = total;
        this.ultima = ultima;
        this.stamp = stamp;
    }

    public Lampada(Lampada l) {
        this.modo = l.getModo();
        this.total = l.getTotal();
        this.ultima = l.getUltima();
        this.stamp = l.getStamp();
    }

    public int getModo() {
        return this.modo;
    }

    public double getTotal() {
        return this.total;
    }

    public double getUltima() {
        return this.ultima;
    }

    public LocalDateTime getStamp() {
        return this.stamp;
    }

    public void setModo(int modo) {
        this.modo = modo;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setUltima(double ultima) {
        this.ultima = ultima;
    }

    public void setStamp(LocalDateTime stamp) {
        this.stamp = stamp;
    }

    //----5.a)----------
    public void liga() {
        this.setModo(ON);
        this.stamp = LocalDateTime.now();
    }

    //----5.b)----------
    public void desliga(){
        this.setModo(OFF);
        this.stamp = LocalDateTime.now();
    }

    //----5.c)----------
    public void eco(){
        this.setModo(ECO);
        this.stamp = LocalDateTime.now();
    }

    //----5.d)----------
    public double totalConsumo(){
        if (this.modo == ON) {
            this.total += 0.1; 
        }
        else if (this.modo == ECO){
            this.total += 0.05;
        }
        return this.total;
    }

    //----5.e)----------
    public void resetConsumo(){
        this.ultima = 0.0;
        this.stamp = LocalDateTime.now();
    }

    /*public double periodoConsumo(){
        
    }*/
}
