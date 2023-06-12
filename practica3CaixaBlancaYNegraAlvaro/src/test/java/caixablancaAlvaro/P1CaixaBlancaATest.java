package caixablancaAlvaro;
import org.junit.jupiter.api.*;
import static caixablancaAlvaro.P1CaixaBlancaA.majorDeTres;
import static org.junit.jupiter.api.Assertions.*;

class P1CaixaBlancaATest {
    P1CaixaBlancaA caixaBlanca;

    @BeforeEach
    void setUp() {
        caixaBlanca = new P1CaixaBlancaA();
        System.out.println("P1CaixaBlancaATest: Proves de caixa blanca per al mètode majorDeTres()");
    }

    @AfterEach
    void tearDown() {
        caixaBlanca = null;
        System.out.println("P1CaixaBlancaATest = null");
    }

    @DisplayName("Cami1: 1-2-3-7; a>b && a>c; a = 10, b = 3, c = 5")
    @Test
    void testMajorDeTresAMayor() {
        int a = 10, b = 3, c = 5,
                actualResult = majorDeTres(a, b, c);
        assertEquals(a, actualResult);
    }

    @DisplayName("Cami5: 1-4-6-7; b>a && b>c; a = 10, b = 30, c = 5")
    @Test
    void testMajorDeTresBMayor() {
        int a = 10, b = 30, c = 5,
                actualResult = majorDeTres(a, b, c);
        assertEquals(b, actualResult);
    }
    @Disabled
    @DisplayName("Cami3: 1-4-5-7; c>b; a = 10, b = 3, c = 50")
    @Test
    void testMajorDeTresCMayor() {
        int a = 10, b = 3, c = 50,
                actualResult = majorDeTres(a, b, c);
        assertEquals(c, actualResult);
    }
}