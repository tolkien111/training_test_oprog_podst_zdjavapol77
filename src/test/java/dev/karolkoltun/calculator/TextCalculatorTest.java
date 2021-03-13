package dev.karolkoltun.calculator;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

//Ćwiczenie 4/str.86

class TextCalculatorTest {

    TextCalculator textCalculator = new TextCalculator();


    @BeforeEach
    void init(TestInfo testInfo) {
        String displayName = testInfo.getDisplayName();
        System.out.println("Start..." + displayName);
    }

    @Test
    @DisplayName("Add Test")
    void calculateAddNumbers() {
        //Given
        String addNumbers = "4+9";
        double resultExpected = 13;
        //When
        double result =  textCalculator.calculate(addNumbers);

        //Then
        assertEquals(resultExpected, result, "Pass test");
        assertThat(result)
                .isEqualTo(resultExpected);
    }
    @Test
    @DisplayName("Substraction Test")
    void calculateSubstractionNumbers() {
        //Given
        String SubstractionNumbers = "3-7";
        double resultExpected = -4;
        //When
        double result =  textCalculator.substraction(SubstractionNumbers);

        //Then
        assertEquals(resultExpected, result, "Pass test");
        assertThat(result)
                .isEqualTo(resultExpected);
    }

}