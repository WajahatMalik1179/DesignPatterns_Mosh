package com.designpatterns_mosh;

public abstract class UIControl {
    public abstract void draw();

    public void enable(){
        System.out.println("Enabled");
    }

    public void focus(){
        System.out.println("focusing...");
    }

    public void setPosition(){
        System.out.println("positioning...");
    }
}
