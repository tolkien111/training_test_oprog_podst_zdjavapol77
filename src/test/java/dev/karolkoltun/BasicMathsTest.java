package dev.karolkoltun;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasicMathsTest {

    @Test
    void shouldMultiplyNumbers(){
        int result = 3 * 5;
        Assertions.assertEquals(15, result);
    }
    @Test
    void shouldSubtractionNumbers(){
        int result = 3 - 5;
        Assertions.assertEquals(-2, result);
    }
    @Test
    void shouldAddNumbers(){
        int result = 6 + 2;
        Assertions.assertEquals(8, result);
    }
    @Test
    void shouldSplitNumbers(){
        double result = 1 / 3.;
        Assertions.assertEquals(0.333, result, 0.001); // delta dokladnosc porownania
    }
    @Test
    void floatingPointFailure(){
        double result = 0.1 + 0.2;
        Assertions.assertEquals(0.3, result);
    }
    @Test
    void shouldModuloNumbers(){
        double result = 5 % 2;
        Assertions.assertEquals(1, result);
    }
}
