public class CirculoP {
    private double raio;

    private Ponto centro;

    public CirculoP() {
        this.raio = 0;
        this.centro = new Ponto();
    }

    public CirculoP(Ponto centro, double raio) {
        this.centro = centro;
        this.raio = raio;
    }

    public CirculoP(CirculoP c1) {
        this.raio = c1.getRaio();
        this.centro = c1.getCentro();
    }

    public Ponto getCentro() {
        return centro;
    }

    public double getRaio() {
        return raio;
    }

    public void setCentro(Ponto centro) {
        this.centro = centro;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public String toString(){
        return "Circulo com o centro: " + centro + " e raio: " + raio;
    }

    public boolean equals(Object o){
        if(o==this) return true;
        if(o==null || o.getClass() != this.getClass())
            return false;
        
        CirculoP c1 = (CirculoP) o;
        return this.centro == c1.getCentro() && this.raio == c1.getRaio();
    }
    
    public CirculoP clone(){
        return new CirculoP(this);
    }

}
