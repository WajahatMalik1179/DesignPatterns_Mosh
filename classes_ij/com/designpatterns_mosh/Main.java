package com.designpatterns_mosh;

public class Main {
    public static void main(String[] args) {
        User user = new User("Wajahat");
        user.sayHello();
        TaxCalculator calculator = getCalculator();
        System.out.println(calculator.calculateTax());
    }

    public static TaxCalculator getCalculator(){
        return new TaxCalculator2024();
    }

}
