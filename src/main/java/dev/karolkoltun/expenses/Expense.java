package dev.karolkoltun.expenses;

import dev.karolkoltun.currency.Currency;

import java.math.BigDecimal;
import java.time.LocalDate;

import static dev.karolkoltun.currency.Currency.PLN;

public class Expense {
  private LocalDate date;
  private BigDecimal amount;
  private String where;
  private Category category;
  private Currency currency;
  private String notes;

  public Expense(LocalDate date, BigDecimal amount, String where, Category category) {
    this(date, amount, where, category, PLN, "");
  }

  public Expense(
      LocalDate date, BigDecimal amount, String where, Category category, Currency currency) {
    this(date, amount, where, category, currency, "");
  }

  public Expense(
      LocalDate date,
      BigDecimal amount,
      String where,
      Category category,
      Currency currency,
      String notes) {
    this.date = date;
    this.amount = amount;
    this.where = where;
    this.category = category;
    this.currency = currency;
    this.notes = notes;
  }

  public LocalDate getDate() {
    return date;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public String getWhere() {
    return where;
  }

  public Category getCategory() {
    return category;
  }

  public String getNotes() {
    return notes;
  }

  public Currency getCurrency() {
    return currency;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public void setWhere(String where) {
    this.where = where;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }
}
