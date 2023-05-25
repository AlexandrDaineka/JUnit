import Daineka.Calculator;
import org.junit.jupiter.api.*;

import org.junit.jupiter.api.function.Executable;

public class CalculatorTests {
    Calculator sut;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test started");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("");
        sut = new Calculator();
    }
    @AfterAll
    public static void afterAll() {
        System.out.println("");

    }
    @AfterEach
    public void afterEach() {
        System.out.println("Test end");
        sut = null;
    }


    @Test
    public void testMultiply() {
        // given:
        int a = 2, b = 2, expected = 4;

        // when:
        var result = sut.multiply(a, b);

        // then:
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void testAdd() {
        // given:
        int a = 2, b = 2, expected = 4;

        // when:
        var result = sut.add(a, b);

        // then:
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void testDivisionByZero() {
        // given:
        int a = 10, b = 0;

        // when:
        Executable executable = () -> sut.divide(a, b);

        // then:
        Assertions.assertThrows(ArithmeticException.class, executable);
    }
}
