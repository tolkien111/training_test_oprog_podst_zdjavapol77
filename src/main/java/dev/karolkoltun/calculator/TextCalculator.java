package dev.karolkoltun.calculator;

/**
 * Proste, ryzykowne, lekko bledne i ograniczone podejscie do kalkulatora bazujacego na tekscie.
 */
class TextCalculator {

  /**
   * Oblicza podane wyrazenie. Zaklada ze wyrazenie sklada sie z jednej cyfry, znaku i drugiej cyfry.
   * Tylko znak "+" jest wspierany.
   * Przykladowe wspierane wyrazenie: "5+4".
   *
   * @param phrase wyrazenie do obliczenia
   * @return wynik
   */
  double calculate(String phrase) {
    int firstNumber = Character.getNumericValue(phrase.charAt(0));

    char symbol = phrase.charAt(1);

    if (symbol != '+') {
      throw new RuntimeException("Symbol " + symbol + " is not supported!");
    }

    int secondNumber = Character.getNumericValue(phrase.charAt(2));

    return firstNumber + secondNumber;
  }
}
