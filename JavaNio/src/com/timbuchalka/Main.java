package com.timbuchalka;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try(FileOutputStream binFile = new FileOutputStream("data.dat");
            FileChannel binChannel = binFile.getChannel()){         //output stream will be closed when execution is finished because using try with resources
            byte[] outputBytes = "Hello World!".getBytes();         //creates byte array
            ByteBuffer buffer = ByteBuffer.wrap(outputBytes);           //wraps byte array into the buffer
            int numBytes = binChannel.write(buffer);
            System.out.println("numBytes written was: " + numBytes);

            ByteBuffer intBuffer = ByteBuffer.allocate(Integer.BYTES);      //number of bytes in an integer
            intBuffer.putInt(245);
            intBuffer.flip();
            numBytes = binChannel.write(intBuffer);
            System.out.println("numBytes written was: " + numBytes);

            intBuffer.flip();
            intBuffer.putInt(-98765);
            intBuffer.flip();
            numBytes = binChannel.write(intBuffer);
            System.out.println("numBytes written was: " + numBytes);


/*
            FileInputStream file = new FileInputStream("data.txt");         //create file input stream
            FileChannel channel = file.getChannel();

            Path dataPath = FileSystems.getDefault().getPath("data.txt");
            Files.write(dataPath, "\nLine 4".getBytes("UTF-8"), StandardOpenOption.APPEND);         //writes data to file
            List<String> lines = Files.readAllLines(dataPath);          //reads entire into memory,and returns list of string objects
            for (String line : lines){
                System.out.println(line);
            }
*/
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
