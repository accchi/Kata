package com.github.accchi.kata;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorUnitTest {

  private static Object[][] testData() {
    return new Object[][]
        {
            {"0,0", 0},
            {"1,1", 2},
        };
  }

  @ParameterizedTest(name = "For {0} should return {1}")
  @MethodSource("testData")
  void shouldReturnExpectedValueForGiven(String numbers, int expectedValue) {
    // Given
    StringCalculator calculator = new StringCalculator();
    // When
    int result = calculator.add(numbers);
    // Then
    assertThat(result).isEqualTo(expectedValue);
  }
}
