package com.timbuchalka;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled high level, object-oriented, platform independent language");
        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        // System.out.println(languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code"));         // outputs null because it hasn't been introduced before
        // System.out.println(languages.put("Lisp", "Therein lies madness"));          // outputs null because it hasn't been introduced before
        languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code");
        languages.put("Lisp", "Therein lies madness");

        System.out.println(languages.get("Java"));
        // System.out.println(languages.put("Java", "this course is about Java"));     // output value from previous put method

        if (languages.containsKey("Java")){
            System.out.println("Java is already in the map.");
        }else {
            languages.put("Java", "this course is about Java");
        }

        System.out.println("===============================================");

        for (String key : languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
