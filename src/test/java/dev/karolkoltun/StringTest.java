package dev.karolkoltun;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class StringTest {

    @Test
    void addString() {
        String result = "ala " + "ma " + "kota";
        Assertions.assertEquals("ala ma kota", result);
    }

    @Test
    void addString_with_Method() {
        String result01 = "ala ";
        String result02 = "ma ";
        String result03 = "kota";
        String result = result01
                .concat(result02)
                .concat(result03);
        Assertions.assertEquals("ala ma kota", result);
    }
    @Test
    void schouldBigLetter(){
        String text = "Kamil";
        char bigLetter = text.charAt(0);
        Assertions.assertEquals('K', bigLetter);
    }
    @Test
    void schouldAllBigLetter(){
        String text = "Kamil";
        String bigAllLetter = text.toUpperCase();
        Assertions.assertEquals("KAMIL", bigAllLetter);
    }
    @Test
    void schouldBeAnotherWord(){
        String text = "Kamil";
        String bigAllLetter = text.replace("l","eń");
        assertEquals("Kamień", bigAllLetter);
    }
    @Test
    void toCharArray(){
        //Given
        char[] ourText = {'A', 'l','a'};
        String text = "Ala";
        //When
        char[] textArray = text.toCharArray();
        //Then
        assertArrayEquals(ourText, textArray);
    }

    @Test
    void isBlank(){
        //Given
        String text = "     \t";
        //When
        boolean result = text.isBlank();
        //Then
        Assertions.assertEquals(true, result);
        Assertions.assertTrue(result);
    }

    @Test
    void isEmpty(){
        //Given
        String text = "";
        //When
        boolean result = text.isEmpty();
        //Then
        Assertions.assertEquals(true, result);
        Assertions.assertTrue(result);
    }
    @Test       //ASSERTJ - inny sposob do sprawdzania zamiast JUnit
    public void assertJ(){
        //Given
        String text = "Karol ma kota";

        //When

        //Then
        assertThat(text)
                .startsWith("Karol")
                .contains("ma")
                .endsWith("kota")
                .isEqualTo("Karol ma kota")
                .hasSize(13);
    }
// Zadanie 34
    @Test
    void CharSequenceInText(){
        //Given
        String text = "Karol ma kota";
        String text01 = text.replace("a kota", "");

        //When
        CharSequence result = text.subSequence(0 , 7);

        //Then
        Assertions.assertEquals(text01, result);

    }
    @Test
    void IgnoreCaseInText(){
        //Given
        String text = "Karol ma kota";
        String text02 = "KaRoL MA KoTA";
        //When
        boolean result = text.equalsIgnoreCase(text02);
        //Then
        Assertions.assertEquals(true, result);
    }
}
