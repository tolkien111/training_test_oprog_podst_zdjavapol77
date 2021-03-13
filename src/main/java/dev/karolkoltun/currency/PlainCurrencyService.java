package dev.karolkoltun.currency;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import static dev.karolkoltun.currency.Currency.*;
import static java.math.BigDecimal.valueOf;

/**
 * Bardzo ograniczony serwis do przeliczania kwot na inne waluty. Wymaga poprawek.
 */
public class PlainCurrencyService implements CurrencyService {

  private static final double PLN_TO_EUR_RATE = 4.57;
  private static final double PLN_TO_USD_RATE = 3.83;

  @Override
  public BigDecimal convert(BigDecimal amount, Currency from, Currency to) {
    if (from.equals(to)) {
      return amount;
    }

    if (from.equals(PLN) && to.equals(EUR)) {
      return amount.divide(valueOf(PLN_TO_EUR_RATE), 2, RoundingMode.HALF_DOWN);
    } else if (from.equals(EUR) && to.equals(PLN)) {
      return amount.multiply(valueOf(PLN_TO_EUR_RATE));
    }

    if (from.equals(PLN) && to.equals(USD)) {
      return amount.divide(valueOf(PLN_TO_USD_RATE), 2, RoundingMode.HALF_DOWN);
    } else if (from.equals(USD) && to.equals(PLN)) {
      return amount.multiply(valueOf(PLN_TO_USD_RATE));
    } else {
      return null;
    }
  }
}
