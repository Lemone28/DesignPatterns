package com.patterns.decorator;

public abstract class SenderDecorator extends AbstractSender {
    protected Sender sender;

    protected SenderDecorator(Sender sender) {
        super(sender.getMessage());
        this.sender = sender;
    }

    @Override
    public void sendMessage() {
        sender.sendMessage();
    }
}
