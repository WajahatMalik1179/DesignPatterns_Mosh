package com.designpatterns_mosh;

public class MailService {
    public void sendEmail(){
        connect("tv");
        authenticate();
        // Send Email
        disconnect();
    }

    private void connect(String where){
        System.out.println("Connect");
    }

    private void disconnect(){
        System.out.println("Disconnect");
    }

    private void authenticate(){
        System.out.println("Authenticate");
    }
}
