package com.timbuchalka;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");           //creates path to file
        printFile(path);        //prints file

        //printing the contents of the file in the files subdirectory
        Path filePath = FileSystems.getDefault().getPath("files", "SubdirectoryFile.txt");
        printFile(filePath);

        //printing contents of a file outside directory
        filePath = Paths.get("C:\\Users\\jtron\\Documents\\Computer Programming Notes\\Java\\Projects\\OutThere.txt");
        printFile(filePath);

    }

    private static void printFile(Path path){
        try(BufferedReader fileReader = Files.newBufferedReader(path)) {
            String line;
            while ((line = fileReader.readLine()) != null){         //reads and prints each line until loop reaches end of file
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
