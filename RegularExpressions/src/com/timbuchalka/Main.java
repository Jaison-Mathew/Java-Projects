package com.timbuchalka;

import javax.crypto.spec.PSource;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        System.out.println("harry".replaceAll("[Hh]arry", "Harry"));

        String newAlphanumeric = "abcDeeeF12Ghiiiijkl99z";
        System.out.println(newAlphanumeric.replaceAll("[^ej]", "X"));           //replaces all character that are not e or j to X
        System.out.println(newAlphanumeric.replaceAll("[abcdef345678]", "X"));
        System.out.println(newAlphanumeric.replaceAll("[a-fA-F3-8]", "X"));
        System.out.println(newAlphanumeric.replaceAll("(?i)[a-f3-8]", "X"));
        System.out.println(newAlphanumeric.replaceAll("[0-9]", "X"));
        System.out.println(newAlphanumeric.replaceAll("\\d", "X"));
        System.out.println(newAlphanumeric.replaceAll("\\D", "X"));         //replaces all non-digits with X

        String hasWhitespace = "I have blanks and\ta tab, and also a newline\n";
        System.out.println(hasWhitespace);
        System.out.println(hasWhitespace.replaceAll("\\s", ""));            //removes all spaces, tabs and new lines
        System.out.println(hasWhitespace.replaceAll("\t", "X"));            //replaces all tabs with X
        System.out.println(hasWhitespace.replaceAll("\\S", ""));            //Only tab, spaces, and newline characters remain
        System.out.println(newAlphanumeric.replaceAll("\\w", "X"));         //whitespace character were replaced
        System.out.println(hasWhitespace.replaceAll("\\w", "X"));           //everything but whitespace characters were replaced to X
        System.out.println(hasWhitespace.replaceAll("\\b", "X"));           //X is placed at the beginning and end of each word

        //Practicing different quantifiers
        String thirdAlphanumeric = "abcDeeeF12Ghiiiijkl99z";
        System.out.println(thirdAlphanumeric.replaceAll("^abcDe{3}", "YYY"));
        System.out.println(thirdAlphanumeric.replaceAll("^abcDe+", "YYY"));

        // practicing astrix quantifier
        System.out.println(thirdAlphanumeric.replaceAll("^abcDe*", "YYY"));

        System.out.println(thirdAlphanumeric.replaceAll("^abcDe{2,5}", "YYY"));
        System.out.println(thirdAlphanumeric.replaceAll("h+i*j", "Y"));

        StringBuilder htmlText = new StringBuilder("<h1>My heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This paragraph about something.</p>");
        htmlText.append("<p>This is another paragraph about something else.</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary.</p>");

        //practicing Pattern and Matcher classes
        String h2Pattern = "<h2>";
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

        matcher.reset();
        int count =0;
        while (matcher.find()){
            count++;
            System.out.println("Occurrence " + count + " : " + matcher.start() + " to " + matcher.end());

        }

        String h2GroupPattern = "(<h2>.*?</h2>)";
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        while (groupMatcher.find()){
            System.out.println("Occurrence: " + groupMatcher.group(1));
        }

        String h2TextGroups = "(<h2>)(.+?)(</h2>)";
        Pattern h2TextPattern = Pattern.compile(h2TextGroups);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);

        while (h2TextMatcher.find()){
            System.out.println("Occurrence: " + h2TextMatcher.group(2));
        }


    }
}
