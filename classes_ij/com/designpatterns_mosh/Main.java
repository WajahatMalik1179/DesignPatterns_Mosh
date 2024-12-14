package com.designpatterns_mosh;

import com.designpatterns_mosh.momento.Editor;
import com.designpatterns_mosh.momento.History;
import com.designpatterns_mosh.state.BrushTool;
import com.designpatterns_mosh.state.Canvas;
import com.designpatterns_mosh.state.EraserTool;
import com.designpatterns_mosh.state.SelectionTool;

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

        System.out.println("\n\t\t***Momento Pattern");
        var editor = new Editor();
        var history = new History();
        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        history.push(editor.createState());

        editor.restore(history.pull());
        editor.restore(history.pull());
        System.out.println(editor.getContent());

        System.out.println("\n\t\t***State Pattern***");
        var canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();
        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();
        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();


    }

    public static TaxCalculator getCalculator(){
        return new TaxCalculator2024();
    }

    public static void drawUIControl(UIControl control){
        control.draw();
    }

}
