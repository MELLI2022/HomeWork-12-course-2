package com.example.homework12course2;

import com.example.homework12course2.Service.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorTestParam {
    CalculatorService calc = new CalculatorService();

    @ParameterizedTest
    @MethodSource("paramAddingTest")
    public void addingTest(Integer num1, Integer num2, Integer result) {
        Assertions.assertEquals(result, calc.plus(num1, num2));
    }

    public static Stream<Arguments> paramAddingTest() {
        return Stream.of(
                Arguments.of(5, 5, 10),
                Arguments.of(-5, -5, -10)
        );
    }

    @ParameterizedTest
    @MethodSource("paramSubtractingTest")
    public void subtractingTest(Integer num1, Integer num2, Integer result) {
        Assertions.assertEquals(result, calc.minus(num1, num2));
    }

    public static Stream<Arguments> paramSubtractingTest() {
        return Stream.of(
                Arguments.of(5, 5, 0),
                Arguments.of(-5, -5, 0),
                Arguments.of(-5, 5, -10),
                Arguments.of(5, -5, 10)
        );
    }

    @ParameterizedTest
    @MethodSource("paramMultiplicationTest")
    public void multiplicationTest(Integer num1, Integer num2, Integer result) {
        Assertions.assertEquals(result, calc.multiply(num1, num2));
    }

    public static Stream<Arguments> paramMultiplicationTest() {
        return Stream.of(
                Arguments.of(-5, -5, 25),
                Arguments.of(5, 5, 25),
                Arguments.of(-5, 5, -25),
                Arguments.of(5, -5, -25)
        );
    }

    @ParameterizedTest
    @MethodSource("paramDivisionTest")
    public void divisionTest(Integer num1, Integer num2, double result) {
        Assertions.assertEquals(result, calc.division(num1, num2));
    }

    public static Stream<Arguments> paramDivisionTest() {
        return Stream.of(
                Arguments.of(5, 5, 1),
                Arguments.of(-5, -5, 1),
                Arguments.of(-5, 5, -1),
                Arguments.of(5, -5, -1)
        );
    }
}

