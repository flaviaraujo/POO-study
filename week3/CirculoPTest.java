import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CirculoPTest {


    @Test
    @DisplayName("Testa construcao do circulo com ponto")
    public void testCirculoPConstruction(){
        Ponto centro = new Ponto(0,0);
        CirculoP c1 = new CirculoP(centro, 4);
    }


    @Test
    void testCirculoAlteraCentro() {
        Ponto centro1 = new Ponto(1,1);
        CirculoP c1 = new CirculoP(centro1, 3);

        Ponto centro2 = new Ponto(0,0);
        c1.setCentro(centro2);
        c1.setRaio(7);

        assertEquals(centro1, c1.getCentro());
    }

    @Test
    void testClone() {

    }

    @Test
    void testEquals() {

    }

    @Test
    void testGetCentro() {

    }

    @Test
    void testGetRaio() {

    }

    @Test
    void testSetCentro() {

    }

    @Test
    void testSetRaio() {

    }

    @Test
    void testToString() {

    }


    @Test
    void testClone2() {
        
    }


    @Test
    void testEquals2() {
        
    }


    @Test
    void testGetCentro2() {
        
    }


    @Test
    void testGetRaio2() {
        
    }


    @Test
    void testSetCentro2() {
        
    }


    @Test
    void testSetRaio2() {
        
    }


    @Test
    void testToString2() {
        
    }
}
