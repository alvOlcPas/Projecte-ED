package caixablancaAlvaro;

import static caixablancaAlvaro.P1CaixaBlancaB.operaciones;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class P1CaixaBlancaBTest {
    P1CaixaBlancaB caixaBlanca;

    @BeforeEach
    void setUp() {
        caixaBlanca = new P1CaixaBlancaB();
        System.out.println("P1CaixaBlancaBTest: Proves de caixa blanca per al mètode operaciones()");
    }

    @AfterEach
    void tearDown() {
        caixaBlanca = null;
        System.out.println("P1CaixaBlancaATest = null");
    }

    @DisplayName("Cami1: 2-3-9; a+b; a = 10, b = 3, c = +")
    @Test
    void testOperacionsDefault() {
        int a = 10, b = 3;
        String c = "+";
        double actualResult = operaciones(a, b, c),
                expectedResult = a + b;
        assertEquals(expectedResult, actualResult);
    }

    @DisplayName("Cami1: 2-3-9; a+b; a = 10, b = 3, c = +")
    @Test
    void testOperacionsSuma() {
        int a = 10, b = 3;
        String c = "+";
        double actualResult = operaciones(a, b, c),
                expectedResult = a + b;
        assertEquals(expectedResult, actualResult);
    }

    @DisplayName("Cami2: 2-4-9; a-b; a = 10, b = 3, c = -")
    @Test
    void testOperacionsResta() {
        int a = 10, b = 3;
        String c = "-";
        double actualResult = operaciones(a, b, c),
                expectedResult = a - b;
        assertEquals(expectedResult, actualResult);
    }

    @DisplayName("Cami3: 2-5-9; a*b; a = 10, b = 3, c = *")
    @Test
    void testOperacionsMult() {
        int a = 10, b = 3;
        String c = "*";
        double actualResult = operaciones(a, b, c),
                expectedResult = a * b;
        assertEquals(expectedResult, actualResult);
    }
    @Disabled
    @DisplayName("Cami4: 2-6-9; a/b; a = 10, b = 3, c = /")
    @Test
    void testOperacionsDiv() {
        int a = 10, b = 3;
        String c = "/";
        double actualResult = operaciones(a, b, c),
                expectedResult = (double) a / b;
        assertEquals(expectedResult, actualResult);
    }

    @DisplayName("Cami5: 2-7-9; a^b; a = 10, b = 3, c = ^")
    @Test
    void testOperacionsPotencia() {
        int a = 10, b = 3;
        String c = "^";
        double actualResult = operaciones(a, b, c),
                expectedResult = Math.pow(a, b);
        assertEquals(expectedResult, actualResult);
    }

    @DisplayName("Cami6: 2-8-9; a%b; a = 10, b = 3, c = %")
    @Test
    void testOperacionsProducte() {
        int a = 10, b = 3;
        String c = "%";
        double actualResult = operaciones(a, b, c),
                expectedResult = a % b;
        assertEquals(expectedResult, actualResult);
    }
}