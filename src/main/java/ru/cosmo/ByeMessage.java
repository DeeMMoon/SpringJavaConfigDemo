package ru.cosmo;

public class ByeMessage implements Message {

    String text;

    public ByeMessage(String text) {
        this.text = "Bey" + text;
    }

    public String getText() {
        return text;
    }
}