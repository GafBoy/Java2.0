import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorTest {

    private static Stream<Arguments> provideNumbersForPositiveTests() {
        return Stream.of(
                Arguments.of(1f,    "+",    2f,     3f),
                Arguments.of(-1f,   "+",    2f,     1f),
                Arguments.of(1.2f,  "+",    3.2f,   4.4f),
                Arguments.of(1f,    "+",    -1f,    0f),
                Arguments.of(1f,    "-",    -1f,    2f),
                Arguments.of(1f,    "-",    1f,     0f),
                Arguments.of(1.2f,  "-",    0.2f,   1f),
                Arguments.of(10f,   "-",    5f,     5f),
                Arguments.of(1f,    "*",    3f,     3f),
                Arguments.of(2f,    "*",    3f,     6f),
                Arguments.of(1.2f,  "*",    3f,     3.6000001f),
                Arguments.of(0f,    "*",    3f,     0f),
                Arguments.of(0f,    "/",    3f,     0f),
                Arguments.of(10f,   "/",    5f,     2f),
                Arguments.of(5f,    "/",    2f,     2.5f),
                Arguments.of(5f,    "/",    5f,     1f)
        );
    }

    @ParameterizedTest
    @MethodSource("provideNumbersForPositiveTests")
    void positiveTest(Float first, String operator, Float second, Float expected) {
        Assertions.assertEquals(expected, new Calculator(first, operator, second).calc());
    }

    @Test
    void divisionByZeroTest(){
        ArithmeticException arithmeticException = Assertions.assertThrows(ArithmeticException.class, () -> new Calculator(1f, "/", 0f).calc());
        Assertions.assertEquals("Делить на ноль нельзя!", arithmeticException.getMessage());
    }

    @Test
    void wrongOperationTest(){
        String wrongOperation = "123";
        RuntimeException wrongOperationException = Assertions.assertThrows(RuntimeException.class, () -> new Calculator(1f, wrongOperation, 0f).calc());
        Assertions.assertEquals("Введенная вами операция '" + wrongOperation + "' отсутствует", wrongOperationException.getMessage());
    }
}