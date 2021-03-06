package dev.karolkoltun;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Prosty test napisany z użyciem biblioteki jUnit.
 */
public class AddingTest {

  @Test
  public void shouldAddNumbers() {
    int result = 3 + 5;

    assertEquals(8, result);
  }
  
}
