package dev.karolkoltun.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SimpleCalculatorTest {

    SimpleCalculator simpleCalculator = new SimpleCalculator(); // definicja simpleCalculator

    @Test
    void addNumbers() {
        //Given
        int firstNummber = 3;
        int secondNummber = 5;
        int shouldBe = 8;
        //When
        int result = simpleCalculator
                .add(firstNummber, secondNummber);
        //Then
        assertEquals(shouldBe, result);
    }

    @Test
    void multiplicationNumbers() {
        //Given
        int firstNummber = 3;
        int secondNummber = 5;
        int shouldBe = 15;
        //When
        int result = simpleCalculator
                .multiply(firstNummber, secondNummber);
        //Then
        assertEquals(shouldBe, result);
    }

    @Test
    void moduloNumber() {
        //Given
        int firstNummber = 6;
        int secondNummber = 5;
        int shouldBe = 1;
        //When
        int result = simpleCalculator
                .moduloNumber(firstNummber, secondNummber);
        //Then
        assertEquals(shouldBe, result);
    }
    @Test
    void splitNumber() {
        //Given
        double firstNummber = 6;
        double secondNummber = 5;
        double shouldBe = 1.2;
        //When
        double result = simpleCalculator
                .splitNumber(firstNummber, secondNummber);
        //Then
        assertEquals(shouldBe, result, 0.01);
    }
}