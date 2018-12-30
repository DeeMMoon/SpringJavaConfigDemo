package ru.cosmo;

public class HelloMessage implements Message {
    String text;

    public HelloMessage(String text) {
        this.text = "Hello" + text;
    }

    public String getText() {
        return text;
    }
}
