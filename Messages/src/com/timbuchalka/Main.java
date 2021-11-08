package com.timbuchalka;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

    }
}

class Message {
    private String message;
    private boolean empty = true;

    public synchronized String read(){              //creating message to read a message
        while (empty){

        }
        empty = true;
        return message;
    }

    public synchronized void write(String message){                //creating method to write a message
        while (!empty){

        }
        empty = false;
        this.message = message;
    }
}

class Writer implements Runnable {              //creating class that will write the messages
    private Message message;
    public Writer(Message message){             //creating constructor to store message objects
        this.message = message;
    }

    public void run(){
        String messages[] = {
                "Humpty Dumpty sat on a wall",
                "Humpty Dumpty had a great fall",
                "All the king's horses and all the king's men",
                "Couldn't put Humpty together again."
        };

        Random random = new Random();

        for (int i = 0; i< messages.length; i++){
            message.write(messages[i]);
            try {
                Thread.sleep(random.nextInt(2000));
            }catch (InterruptedException e){

            }
        }
        message.write("Finished");
    }
}
