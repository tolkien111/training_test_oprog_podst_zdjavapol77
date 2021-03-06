package dev.karolkoltun.expenses;

import dev.karolkoltun.currency.CurrencyService;
import dev.karolkoltun.currency.PlainCurrencyService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static dev.karolkoltun.currency.Currency.PLN;
import static java.math.BigDecimal.ZERO;
import static java.time.LocalDate.now;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

class HomeFinancesService {
  private final List<Expense> expenses = new ArrayList<>();

  private final CurrencyService currencyService;

  HomeFinancesService() {
    this.currencyService = new PlainCurrencyService();
  }

  HomeFinancesService(CurrencyService currencyService) {
    this.currencyService = currencyService;
  }

  /**
   * Adds a new expense to the list.
   *
   * <p>If the expense.amount < 0, does not add it. If the expense.date is in future, does not add
   * it.
   *
   * @param expense expense to be added
   */
  void addExpense(Expense expense) {
    if (!expense.getCurrency().equals(PLN)) {
      BigDecimal amountInPln =
          currencyService.convert(expense.getAmount(), expense.getCurrency(), PLN);

      expense.setAmount(amountInPln);
      expense.setCurrency(PLN);
    }

    if (expense.getDate().isAfter(now())) {
      return;
    }

    if (expense.getAmount().compareTo(ZERO) < 0) {
      return;
    }

    expenses.add(expense);
  }

  List<Expense> getAllExpenses() {
    return new ArrayList<>(expenses);
  }

}
