package com.company;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(50, true);
        System.out.println("Initial page count = " + printer.getPagesPrinted());

        int printPages = printer.simulatePrinting(4);
        System.out.println("Pages printed was " + printPages + " new total count for printer = " + printer.getPagesPrinted());
        printPages = printer.simulatePrinting(2);
        System.out.println("Pages printed was " + printPages + " new total count for printer = " + printer.getPagesPrinted());

    }
}
