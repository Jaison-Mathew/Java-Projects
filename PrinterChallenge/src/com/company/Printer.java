package com.company;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplexPrinter;

    public Printer(int tonerLevel, boolean isDuplexPrinter) {
        if (this.tonerLevel > -1 && this.tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }else {
            this.tonerLevel = -1;
        }
        this.pagesPrinted = 0;
        this.isDuplexPrinter = isDuplexPrinter;
    }


    public int getPagesPrinted() {
        return pagesPrinted;
    }

    //create method to fill up the toner to 100%
    public int fillToner(int addToner){

        if (addToner > 0 && addToner <= 100){
            if ((this.tonerLevel + addToner) <= 100){
                this.tonerLevel += addToner;
                return this.tonerLevel;
            }else {
                return -1;
            }
        }else {
            return -1;
        }

    }

    //create method to simulate printer
    public int simulatePrinting(int pages){
        int printPage = pages;
        if (this.isDuplexPrinter = true){
            this.pagesPrinted = (pages % 2) + (pages / 2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += printPage;
        return printPage;
    }
}
