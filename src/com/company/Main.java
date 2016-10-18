package com.company;

public class Main {

    public static void main(String[] args) {

        /*

        indexOf is a String method that returns the index (position) of a letter
        from a certain index.

        public int indexOf(String s, int from)

        indexOf returns a public integer.
        indexOf receives two parameters:

        > a string (indicating what to find)
        > an integer (indicating the starting index)

         */


        // For example...

        String s = "Ice hockey is fun.";
        System.out.println(s.indexOf("e", 5));

        /*
        The code finds the index of "e" from an index of 5 (before 'o').
        "8" is printed out because it is the index of the next "e".
         */

        System.out.println(s.indexOf("e", 0));

        /*
        In this instance, "2" is printed out. This is because the code searches for the next
        "e", starting at an index of 0 (the start of the string).
         */


    }
}
