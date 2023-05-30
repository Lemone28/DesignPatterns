package com.patterns.decorator;

public class SMSSenderDecorator extends SenderDecorator {
    public SMSSenderDecorator(Sender sender) {
        super(sender);
    }

    public void sendSMS() {
        System.out.println("SMS message: " + sender.getMessage());
    }
}
