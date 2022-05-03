import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class McdTest {

    Mcd mcd= new Mcd();
    @Test
    void setNumero1() {
        mcd.setNumero1(72);
        assertEquals(72,mcd.getNumero1());
    }

    @org.junit.jupiter.api.Test
    void setNumero2() {
        mcd.setNumero2(16);
        assertEquals(16,mcd.getNumero2());
    }

    @org.junit.jupiter.api.Test
    void calculoDeMaximoComunDivisorSegunEuclides() {
        mcd.setNumero1(72);
        mcd.setNumero2(16);
        assertEquals(8,mcd.calculoDeMaximoComunDivisorSegunEuclides());
    }

    @org.junit.jupiter.api.Test
    void calculoDeMaximoComunDivisorSegunEuclidesNoFunciona() {
        mcd.setNumero1(72);
        mcd.setNumero2(16);
        assertNotEquals(7,mcd.calculoDeMaximoComunDivisorSegunEuclides());
    }
}