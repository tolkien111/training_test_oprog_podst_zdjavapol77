package dev.karolkoltun;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

//Cwiczenie 5.1/str59

public class StringUtilsTest {

    @Test
    void AbbrevieatesTextAndAddSomething (){
        //Given
        String text01 = "Jaką mamy dzisiaj pogodę?";
        String text02 = "...";

        //When
        String result = StringUtils.abbreviate(text01, text02, 12 );

        //Then
        Assertions.assertEquals("Jaką mamy...", result);
        org.assertj.core.api.Assertions.assertThat(result)
                .hasSize(12)
                .startsWith("Jaką")
                .endsWith("...")
                .isEqualTo("Jaką mamy...");

    }
    @Test
    void CountMachesCharInText(){// ile razy zawiera dany znak

        //Given
        String text01 = "Ziemia jest bliska zagłady";
        int shouldBe = 3;

        //When
        int result = StringUtils.countMatches(text01, 'i');

        //Then
        Assertions.assertEquals(shouldBe, result);
    }

    @Test
    void ContainsSomethingInText(){// czy zawiera dowolny znak z signs

        //Given
        String text01 = "Ziemia jest bliska zagłady";
        String signs = "vwtb";

        //When
        boolean result = StringUtils.containsAny(text01, signs);

        //Then
        Assertions.assertTrue(result);
    }

    @Test
    void SplitTextForArray(){

        //Given
        String text01 = "Ziemia jest bliska zagłady";
        String [] shouldBe ={"Ziemia", "jest" , "bliska" ,"zagłady"};

        //When
        String [] result = StringUtils.split(text01, " ");

        //Then
        Assertions.assertArrayEquals(shouldBe, result);
    }

    @Test
    void StripSomethingFromText() { //Usuwa dowolny zestaw znaków z początku i końca ciągu.

        //Given
        String text01 = "Ziemia jest bliska zagłady";
        String shouldBe = "mia jest bliska zagła";

        //When
        String result = StringUtils.strip(text01, "Zie dy");
//        System.out.println(Arrays.toString(result));
//        System.out.println(Arrays.toString(shouldBe));

        //Then
        Assertions.assertEquals(shouldBe, result);
    }

}
