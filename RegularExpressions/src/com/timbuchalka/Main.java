package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        String string = "I am a string. Yes, I am.";
        System.out.println(string);
        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);

        String alphanumeric = "abcDeeeF12Ghiiiijkl99z";
        System.out.println(alphanumeric.replaceAll(".", "Y"));          //replaces all characters with Y

        System.out.println(alphanumeric.replaceAll("^abcDeee", "YYY"));

        String secondString = "abcDeeeF12GhabcDeeeiiiijkl99z";
        System.out.println(secondString.replaceAll("^abcDeee", "YYY"));

        System.out.println(alphanumeric.matches("^hello"));
        System.out.println(alphanumeric.matches("^abcDeee"));
        System.out.println(alphanumeric.matches("abcDeeeF12Ghiiiijkl99z"));

        System.out.println(alphanumeric.replaceAll("ijkl99z$", "THE END"));     //only replaces if characters are at the end of the string
        System.out.println(alphanumeric.replaceAll("[aei]", "X"));              // replaces all a, e, and i characters to X
        System.out.println(alphanumeric.replaceAll("[aei]", " I replaced a letter here "));
        System.out.println(alphanumeric.replaceAll("[aei][Fj]", "X"));

    }
}
