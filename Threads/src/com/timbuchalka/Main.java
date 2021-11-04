package com.timbuchalka;

import static com.timbuchalka.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from the main thread.");

        Thread anotherThread = new AnotherThread();             //create instance of a thread
        anotherThread.setName("== Another Thread ==");
        anotherThread.start();                  //enables jvm to run the run method for the thread

        new Thread(){               //creating anonymous class
            public void run(){
                System.out.println(ANSI_GREEN + "Hello from the anonymous class thread");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable(){
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from the anonymous class's implementation of run()");
                try {
                    anotherThread.join();           //calling join method of the thread that we want to join the current thread to.
                    System.out.println(ANSI_RED + "AnotherThread terminated or timed out, so I'm running again.");
                }catch (InterruptedException e){
                    System.out.println(ANSI_RED + "I couldn't wait after all. I was interrupted.");
                }
            }
        });

        myRunnableThread.start();
        //anotherThread.interrupt();

        System.out.println(ANSI_PURPLE + "Hello again from the main thread.");


    }
}
