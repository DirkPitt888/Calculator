package com.kodilla;

public class Calculator {
    int numberOne = 4;
    int numberTwo = 9;
    public void addition() {
        int result = numberOne + numberTwo;
        System.out.println(result);
    }
    public void substraction() {
        int result = numberTwo - numberOne;
        System.out.println(result);

    }
}
class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.addition();
        calculator.substraction();

    }
}
