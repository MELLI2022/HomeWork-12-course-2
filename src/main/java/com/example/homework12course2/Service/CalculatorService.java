package com.example.homework12course2.Service;

import com.example.homework12course2.Exception.IllegalArgumentExceptionTest;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public int plus(Integer num1, Integer num2){
        return num1 + num2;
    }
    public int minus(int num1, int num2){
        return num1 - num2;
    }
    public int multiply(int num1, int num2){
        return num1 * num2;
    }
    public double division(int num1, int num2){
        if(num2 == 0){
            throw new IllegalArgumentExceptionTest("На ноль делить нельзя");
    }
    return num1 /(double) num2;
    }
}
