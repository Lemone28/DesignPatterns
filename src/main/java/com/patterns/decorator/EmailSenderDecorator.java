package com.patterns.decorator;

public class EmailSenderDecorator extends SMSSenderDecorator {
    public EmailSenderDecorator(Sender sender) {
        super(sender);
    }

    public void sendEmail() {
        System.out.println("Email message:" + sender.getMessage());
    }
}
