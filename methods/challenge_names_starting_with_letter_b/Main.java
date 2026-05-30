package com.example;

public class Main {
    static String[] sortNamesStartWithLetterB(String[] names) {
        int size = 0;
        for (String name : names) {
            if (name.charAt(0) == 'B') {
                size++;
            }
        }
        String[] result = new String[size];
        int index = 0;
        for (String name : names) {
            if (name.charAt(0) == 'B') {
                result[index] = name;
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] names = {"Ben", "Bob", "Alice", "Mikel", "Brian", "Brandon", "Nick", "Ryan"};
        String[] namesStartsLetterB = sortNamesStartWithLetterB (names);
        for (String name : namesStartsLetterB) {
            System.out.print(name + " ");
        }
    }
}