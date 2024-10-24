package org.example;

public class Calculator {

    public double sum(double a, double b){
        double result = a + b;
        System.out.println(a + " + " + b + " = " + result);
        return result;
    }
    public double min(double a, double b){
        double result = a - b;
        System.out.println(a + " - " + b + " = " + result);
        return result;
    }
}
