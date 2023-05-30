package com.patterns.decorator;

public abstract class SenderDecorator implements Sender {
    protected Sender sender;

    protected SenderDecorator(Sender sender) {
        this.sender = sender;
    }

    @Override
    public void sendMessage() {
        sender.sendMessage();
    }
}
