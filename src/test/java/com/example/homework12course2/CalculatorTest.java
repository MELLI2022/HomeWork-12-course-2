package com.example.homework12course2;

import com.example.homework12course2.Exception.IllegalArgumentExceptionTest;
import com.example.homework12course2.Service.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class CalculatorTest {

    CalculatorService calc = new CalculatorService();

    @Test
   void AddingPositiveNumbers() {
        int result = calc.plus(5,5);
        Assertions.assertEquals(10, result);
    }
    @Test
    void AddingNegativeNumbers() {
        int result = calc.plus(-5,-5);
        Assertions.assertEquals(-10, result);
    }
    @Test
    void SubtractingPositiveNumbers(){
        int result = calc.minus(5,5);
        Assertions.assertEquals(0, result);

    }
    @Test
    void SubtractingNegativeNumbers(){
        int result = calc.minus(-5,-5);
        Assertions.assertEquals(0, result);
    }
    @Test
    void SubtractingNegativeOneNumber(){
        int result = calc.minus(-5,5);
        Assertions.assertEquals(-10, result);
    }
    @Test
    void SubtractingNegativeTwoNumber(){
        int result = calc.minus(5,-5);
        Assertions.assertEquals(10, result);
    }
    @Test
    void MultiplicationNegativeNumbers(){
        int result = calc.multiply(-5,-5);
        Assertions.assertEquals(25, result);
    }
    @Test
    void MultiplicationPositiveNumbers(){
        int result = calc.multiply(5,5);
        Assertions.assertEquals(25, result);
    }
    @Test
    void MultiplicationNegativeOneNumber(){
        int result = calc.multiply(-5,5);
        Assertions.assertEquals(-25, result);
    }
    @Test
    void MultiplicationNegativeTwoNumber(){
        int result = calc.multiply(5,-5);
        Assertions.assertEquals(-25, result);
    }
    @Test
    void DivisionPositiveNumbers(){
        int result = (int) calc. division(5,5);
        Assertions.assertEquals(1, result);
    }
    @Test
    void DivisionNegativeNumbers(){
        int result = (int) calc. division(-5,-5);
        Assertions.assertEquals(1, result);
    }
    @Test
    void DivisionNegativeOneNumber(){
        int result = (int) calc. division(-5,5);
        Assertions.assertEquals(-1, result);
    }
    @Test
    void DivisionNegativeTwoNumber(){
        int result = (int) calc. division(5,-5);
        Assertions.assertEquals(-1, result);
    }
    @Test
    void DivisionZeroTwoNumber(){
        Assertions.assertThrows (IllegalArgumentExceptionTest.class, ()-> calc.division(5, 0));
    }
}