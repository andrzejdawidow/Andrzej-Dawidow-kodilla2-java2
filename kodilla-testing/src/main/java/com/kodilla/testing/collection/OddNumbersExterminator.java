package com.kodilla.testing.collection;

import java.util.*;

class OddNumbersExterminator {
    public List<Integer> list() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random theGenerator = new Random();
        for (int n = 0; n < 20; n++) {
            numbers.add(theGenerator.nextInt((20 + 1)));
        }
        return numbers;
    }

    public List<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> even = new ArrayList<Integer>(numbers);
        for (int n=0; n < numbers.size(); n++){
            if (numbers.get(n) % 2 == 1) {
                even.remove(numbers.get(n));
            }
        }
        return even;
    }
}