package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public String beautify(String tekst, PoemDecorator poemDecorator) {
    return poemDecorator.decorate(tekst);
    }
}
