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

        System.out.println("\n\t\t***Abstraction***");
        var mailservice = new MailService();
        mailservice.sendEmail();

        System.out.println("\n\t\t***Inheritance***");
        var textBox = new TextBox();
        textBox.enable();
        textBox.focus();
        textBox.setPosition();
        var button = new Button();
        button.enable();
        button.setPosition();


        System.out.println("\n\t\t***Polymorphism***");
        drawUIControl(new TextBox());
        drawUIControl(new CheckBox());
        drawUIControl(new Button());

        System.out.println("Trying to rebase mementopattern branch to main branch");

    }

    public static TaxCalculator getCalculator(){
        return new TaxCalculator2024();
    }

    public static void drawUIControl(UIControl control){
        control.draw();
    }

}
