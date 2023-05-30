package com.patterns.decorator;

public class MessageSender implements Sender {
    @Override
    public void sendMessage() {
        System.out.println("Send message");
    }
}
