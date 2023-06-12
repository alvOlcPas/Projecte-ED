package caixanegraAlvaro;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class P1CaixaNegraATest {
    P1CaixaNegraA caixaNegraA;
    @BeforeEach
    void setUp() {
        caixaNegraA = new P1CaixaNegraA();
    }

    @AfterEach
    void tearDown() {
        caixaNegraA = null;
    }

    @Test
    @DisplayName("cp1: V1a, V2A -> DNI=1, dia=1 = 0")
    public void cp1(){
        String dni = "1";
        String dia = "1";
        float exceptedResult = 0;
        float result = caixaNegraA.recarrec(dni, dia);
        assertEquals(exceptedResult, result);
    }

    @Test
    @DisplayName("cp2: V1b, V2b -> DNI=2, dia=2 = 1")
    void cp2() {
        String dni = "2";
        String dia = "2";
        float result = 1;
        float expectedResult = caixaNegraA.recarrec(dni, dia);
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("cp3: V1c, V2c -> DNI=1, dia=12 = 2")
    void cp3() {
        String dni = "1";
        String dia = "12";
        float result = 2;
        float expectedResult = caixaNegraA.recarrec(dni, dia);
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("cp4: V1d, V2d -> DNI=1, dia=23 = 3")
    void cp4() {
        String dni = "1";
        String dia = "23";
        float result = 3;
        float expectedResult = caixaNegraA.recarrec(dni, dia);
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("cp5: V1e, V2e -> DNI=111111111, dia=11 = 4")
    void cp5() {
        String dni = "111111111";
        String dia = "11";
        float result = 4;
        float expectedResult = caixaNegraA.recarrec(dni, dia);
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("DNI=111111111, dia=21 = 5")
    void cp6() {
        String dni = "111111111";
        String dia = "11";
        float result = 4;
        float expectedResult = caixaNegraA.recarrec(dni, dia);
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("cp7: DNI=2222222222, dia=11 = DNI erróneo")
    void cp7() {
        String dni = "2222222222";
        String dia = "11";
        try{
            caixaNegraA.recarrec(dni, dia);
            fail("missing illegal exception");
        } catch (IllegalArgumentException i) {
            assertEquals(i, i);
        }
    }
}