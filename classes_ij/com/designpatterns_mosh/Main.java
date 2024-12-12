package com.designpatterns_mosh;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t***Classes***");
        User user = new User("Wajahat");
        user.sayHello();

        System.out.println("\n\t\t***Interfaces***");
        TaxCalculator calculator = getCalculator();
        System.out.println(calculator.calculateTax());

        System.out.println("\n\t\t***Encapsulation***");
        var account = new Account();
        account.deposit(10);
        account.withdraw(5);
        System.out.println(account.getBalance());

    }

    public static TaxCalculator getCalculator(){
        return new TaxCalculator2024();
    }

}
