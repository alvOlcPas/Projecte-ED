package caixanegraAlvaro;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
public class P1CaixaNegraATest_Parametritzada {
    public static Stream<Arguments> dataForValidTestCases(){
        return Stream.of(
                Arguments.of("1", "1", 0f),
                Arguments.of("2", "2", 1f),
                Arguments.of("3", "12", 2f)
        );
    }

    public static Stream<Arguments> dataForNonValidTestCases(){
        return Stream.of(
                Arguments.of("V11111111", "2", "DNI erróneo"),
                Arguments.of("22222222222", "21", "DNI erróneo"),
                Arguments.of(" ", "1", "DNI erróneo")
        );
    }

    @ParameterizedTest
    @MethodSource("dataForValidTestCases")
    public void recarrecValidTest(String dni, String dia, float expectedResult){
        P1CaixaNegraA caixaNegraA = new P1CaixaNegraA();
        float result = caixaNegraA.recarrec(dni, dia);
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @MethodSource("dataForNonValidTestCases")
    public void recarrecNonValidTest(String dni, String dia, String expectedExceptionMessage){
        P1CaixaNegraA caixaNegraA = new P1CaixaNegraA();
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> {
            caixaNegraA.recarrec(dni,dia);
                });
        assertEquals(illegalArgumentException.getMessage(), illegalArgumentException.getMessage());
    }
}
