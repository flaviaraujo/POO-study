public class Circulo{

    //variáveis de instância
    private double r;
    private double x;
    private double y;

    //construtores por omissão
    public Circulo(){
        this.x = 0.0;
        this.y = 0.0;
        this.r = 0.0;
    }

    //construtores parametrizados
    public Circulo(double cx, double cy, double cr){
        this.x = cx;
        this.y = cy;
        this.r = cr;
    }

    //construtores por cópia
    public Circulo (Circulo umCirculo){
        this.x = umCirculo.getX();
        this.y = umCirculo.getY();
        this.r = umCirculo.getR();
    }

    //constructor clone
    public Circulo clone(){
        return new Circulo(this);
    }

    //getters
    //--1.a)-------------
    public double getX(){
        return this.x;
    }
    //--1.b)-------------
    public double getY(){
        return this.y;
    }
    //--1.c)-------------
    public double getR(){
        return this.r;
    }

    //setters
    //--1.d)--------------------
    public void setX(double cx){
        this.x = cx;
    }

    public void setY(double cy){
        this.y = cy;
    }

    public void setR(double cr){
        this.r = cr;
    }

    //--1.e)-------------------------------------
    public void alteraCentro(double x, double y){
        this.setX(x);
        this.setY(y);
    }

    //--1.f)-------------------------------------
    public double calculaArea(){
        return Math.PI * Math.pow(this.r, 2);
    }

    //--1.g)-------------------------------------
    public double calculaPerimetro(){
        return 2 * Math.PI * this.r;
    }

    //equals
    public boolean equals(Object circulo){
        if (this == circulo){
            return true;
        }
        if (circulo == null || this.getClass() != circulo.getClass()){
            return false;
        }
        Circulo c = (Circulo) circulo;
        return this.x == c.getX() && this.y == c.getY() && this.r == c.getR();
    }


    //toString
    public String toString(){
        return "Círculo: Centro: (" + this.x + ", " + this.y + "), Raio: " + this.r;
    }

}