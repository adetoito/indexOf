package com.company;

public class Main {

    public static void main(String[] args) {

        /*
        indexOf is a String method that returns the index (position) of a letter
        from a certain index.

        public int indexOf(String s, int from)

        indexOf returns a public integer.
        indexOf receives two parameters: a string and an integer.
         */

        // For example...

        String s = "Ice hockey is fun.";
        System.out.println(s.indexOf("e", 5));

        /*
        The code finds the index of "e" from an index of 5 (before 'o').
        "8" is printed out because it is the index of the next "e".
         */

    }
}
