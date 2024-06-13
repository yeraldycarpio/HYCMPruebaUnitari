package org.example;

import org.junit.jupiter.api.*;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesMatematicasHYCMTest {


    OperacionesMatematicasHYCM operacionesMatematicasHYCM;

    @BeforeEach
    void setUp() {
        operacionesMatematicasHYCM = new OperacionesMatematicasHYCM();
    }

    @AfterEach
    void setUP() {
        operacionesMatematicasHYCM = null;
    }

    @BeforeAll
    static void alIniciarlasPruebas() {
    }

    @AfterAll
    static void alFinalizarlasPruebas() {


    }

    @Test
    void calcularRaizCuadrad() {
        double num1 = 4;
        double resultadoEsperado = 2;
        double resultado = operacionesMatematicasHYCM.calcularRaizCuadrada(num1);
        assertEquals(resultadoEsperado, resultado);
    }
}