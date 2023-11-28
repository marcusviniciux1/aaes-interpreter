package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RetanguloTest {

    @Test
    void deveCalcularValorFinalComFormula() {
        Retangulo retangulo = new Retangulo();
        retangulo.setAltura(30.0);
        retangulo.setLargura(60.0);

        assertEquals(1800.0, retangulo.calcularValorArea());
    }

}