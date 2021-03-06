package dev.karolkoltun.currency;

import java.math.BigDecimal;

public interface CurrencyService {
  BigDecimal convert(BigDecimal amount, Currency from, Currency to);
}
