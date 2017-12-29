package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public String beautify(String tekst, PoemDecorator to) {
    return to.decorate(tekst);
    }
}
