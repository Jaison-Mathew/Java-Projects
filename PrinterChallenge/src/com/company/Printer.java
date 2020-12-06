package com.company;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (this.tonerLevel > -1 && this.tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }else {
            this.tonerLevel = -1;
        }
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    //create method to add toner to the printer
    public int addToner(int tonerAmount){
        if (tonerAmount > 0 && tonerAmount <= 100){
            if ((this.tonerLevel + tonerAmount) <= 100){
                this.tonerLevel += tonerAmount;
                return this.tonerLevel;
            }else {
                return -1;
            }
        }else {
            return -1;
        }
    }

    //create method that prints pages and counts how many pages are printed in printer lifespan
    public int printPages(int pages){
        if (pages < 0){
            return -1;
        }

        int pagesToPrint = pages;
        if (this.duplex = true){
            //calculates how many pages are being printed in duplex mode
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        //counts how many pages are being printed in printer lifespan
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return this.pagesPrinted;
    }


}
