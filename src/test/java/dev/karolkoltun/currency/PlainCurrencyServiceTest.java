package dev.karolkoltun.currency;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

//Cwiczenie 2 i 3/str.87-88

class PlainCurrencyServiceTest {

    @Test
    void convertFromEuroToPln() {
        //Given
        Currency pln = Currency.PLN;
        Currency euro = Currency.EUR;
        BigDecimal amountEuro = BigDecimal.valueOf(10);


        //When
        PlainCurrencyService plainCurrencyService = new PlainCurrencyService();
        BigDecimal result = plainCurrencyService.convert(amountEuro, euro, pln);
        BigDecimal amountPln = BigDecimal.valueOf(4570, 2); //jak zrobić inaczej
        //Then
        assertThat(result)
                .isEqualByComparingTo("45.70");
        assertEquals(0, result.compareTo(amountPln)); //druga metoda, gorsza
    }

    @Test
    void convertPlnToEuro() {
        //Given
        Currency pln = Currency.PLN;
        Currency euro = Currency.EUR;
        BigDecimal amountPln = BigDecimal.valueOf(1000);

        //When
        PlainCurrencyService plainCurrencyService = new PlainCurrencyService();
        BigDecimal result = plainCurrencyService.convert(amountPln, pln, euro);
        BigDecimal amountEuro = BigDecimal.valueOf(218.82);

        //Then
        assertThat(result)
                .isEqualTo(amountEuro);
    }

    @Test
    void convertUsdToPln() {
        //Given
        Currency pln = Currency.PLN;
        Currency usd = Currency.USD;
        BigDecimal amountUsd = BigDecimal.valueOf(20);


        //When
        PlainCurrencyService plainCurrencyService = new PlainCurrencyService();
        BigDecimal result = plainCurrencyService.convert(amountUsd, usd, pln);
        BigDecimal amountPln = BigDecimal.valueOf(7660, 2); //jak zrobić inaczej
        //Then
        assertThat(result)
                .isEqualTo(amountPln);
    }

    @Test
    void convertPlnToUsd() {
        //Given
        Currency pln = Currency.PLN;
        Currency usd = Currency.USD;
        BigDecimal amountPln = BigDecimal.valueOf(1000);

        //When
        PlainCurrencyService plainCurrencyService = new PlainCurrencyService();
        BigDecimal result = plainCurrencyService.convert(amountPln, pln, usd);
        BigDecimal amountUsd = BigDecimal.valueOf(26110, 2);

        //Then
        assertThat(result)
                .isEqualTo(amountUsd);
    }
}