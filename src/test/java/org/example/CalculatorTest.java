package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTest {

    @ParameterizedTest
    @CsvSource({"3.4,3,6.4"})
    void sum(double a, double b, double extendResult) {
        Calculator calc = new Calculator();
        double result = calc.sum(a, b);
        Assertions.assertEquals(result,extendResult,"Ожидалось значение - " + extendResult);
    }

    @ParameterizedTest
    @CsvSource({"5.4,3.2,2.2"})
    void min(double a, double b, double extendResult) {
        Calculator calc = new Calculator();
        double result = calc.min(a, b);
        Assertions.assertEquals(result,extendResult,"Ожидалось значение - " + extendResult);
    }
}