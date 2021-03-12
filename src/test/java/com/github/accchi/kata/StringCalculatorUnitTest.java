package com.github.accchi.kata;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class StringCalculatorUnitTest {

  @Test
  void emptyTest() {
    // Given
    StringCalculator calculator = new StringCalculator();
    String numbers = "0,0";
    // When
    int result = calculator.add(numbers);
    // Then
    assertThat(result).isEqualTo(0);
  }
}
