package ru.cosmo;

public class MessageRendererErr implements MessageRenderer {
    private Message message;

    public MessageRendererErr(Message message) {
        this.message = message;
    }

    public void printMessage() {
        System.err.println(message.getText());
    }
}

