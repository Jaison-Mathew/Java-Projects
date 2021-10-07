package com.timbuchalka;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
/*
            FileInputStream file = new FileInputStream("data.txt");         //create file input stream
            FileChannel channel = file.getChannel();
*/
            Path dataPath = FileSystems.getDefault().getPath("data.txt");
            Files.write(dataPath, "\nLine 4".getBytes("UTF-8"), StandardOpenOption.APPEND);         //writes data to file
            List<String> lines = Files.readAllLines(dataPath);          //reads entire into memory,and returns list of string objects
            for (String line : lines){
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
