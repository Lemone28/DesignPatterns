package com.patterns.decorator;

import com.patterns.AbstractRunnable;

public class DecoratorRunnable extends AbstractRunnable {
    @Override
    public void run() {
        Sender baseSender = new MessageSender("Message");
        Sender smsSender = new SMSSenderDecorator(baseSender);
        Sender emailSender = new EmailSenderDecorator(smsSender);

        baseSender.sendMessage();
        smsSender.sendMessage();
        emailSender.sendMessage();
    }
}
