package com.timbuchalka;

import static com.timbuchalka.ThreadColor.ANSI_GREEN;
import static com.timbuchalka.ThreadColor.ANSI_PURPLE;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from the main thread.");

        Thread anotherThread = new AnotherThread();             //create instance of a thread
        anotherThread.start();                  //enables jvm to run the run method for the thread

        new Thread(){               //creating anonymous class
            public void run(){
                System.out.println(ANSI_GREEN + "Hello from the anonymous class thread");
            }
        }.start();

        System.out.println(ANSI_PURPLE + "Hello again from the main thread.");


    }
}
