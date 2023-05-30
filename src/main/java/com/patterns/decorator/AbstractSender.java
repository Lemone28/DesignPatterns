package com.patterns.decorator;

abstract class AbstractSender implements Sender {
    protected String message;

    public AbstractSender(String message) {
        this.message = message;
    }
    public AbstractSender(Sender sender) {
        this.message = sender.getMessage();
    }

    @Override
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void sendMessage() {
        System.out.println(message);
    }
}
