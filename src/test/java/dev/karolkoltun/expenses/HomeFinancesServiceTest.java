package dev.karolkoltun.expenses;

import dev.karolkoltun.currency.Currency;
import dev.karolkoltun.currency.PlainCurrencyService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

//Cwiczenie 4/str89.
class HomeFinancesServiceTest {


    @Test
    void shouldCreateExpanse() {
        //Given
        LocalDate date = LocalDate.of(2021, 01, 20);
        BigDecimal amount = BigDecimal.valueOf(100);
        Category category = Category.GIFTS;

        //When
        Expense expense = new Expense(date, amount, "Empik", category);

        //Then
        assertEquals(BigDecimal.valueOf(100), expense.getAmount());
    }

    // Nowy obiekt HomeFinancesService
    // Nowy wydatek
    // Dodanie wydatku do serwisu
    // Sprawdzenie czy wydatek jest w serwis
    @Test
    void shouldAddExpense() {
        //Given
        HomeFinancesService service = new HomeFinancesService();

        LocalDate date = LocalDate.of(2020, 03, 12);
        BigDecimal amount = BigDecimal.valueOf(150);
        Category category = Category.GIFTS;
        Expense newParfum = new Expense(date, amount, "Douglas", category);

        //When
        service.addExpense(newParfum);


        //Then
        List<Expense> updatedList = service.getAllExpenses();
        int sizeOfUpdatedList = updatedList.size();
        assertEquals(1, sizeOfUpdatedList);

        Expense addedExpense = updatedList.get(0);
        assertEquals(newParfum, addedExpense);
    }

    // Nowy wydatek w EUR
    // Dodanie do serwisu
    // Sprawdzenie czy wydatek został przewalutowany - DO SPRAWDZENIA!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    @Test
    void shouldAddExpenseInEuro() {
        //Given
        HomeFinancesService service = new HomeFinancesService();

        LocalDate date = LocalDate.of(2020, 3, 12);
        BigDecimal amount = BigDecimal.valueOf(150);
        Category category = Category.GIFTS;
        Currency euro = Currency.EUR;
        Expense newShoes = new Expense(date,amount, "Shoes Shop", category, euro);
        BigDecimal shouldBe = BigDecimal.valueOf(4*150);

        //When
        service.addExpense(newShoes);
        PlainCurrencyService plainCurrencyService = new PlainCurrencyService();
        Currency pln  = Currency.PLN;
        BigDecimal value = plainCurrencyService.convert(amount,euro,pln);
        //Then
        assertEquals(shouldBe, value);

    }
}