package com.timbuchalka;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        //copying file in same directory
        try {
            Path sourceFile = FileSystems.getDefault().getPath("Examples", "file1.txt");
            Path copyFile = FileSystems.getDefault().getPath("Examples", "file1copy.txt");
            Files.copy(sourceFile, copyFile);
        }catch (IOException e){
            e.printStackTrace();
        }


/*
        Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");           //creates path to file
        printFile(path);        //prints file

        //printing the contents of the file in the files subdirectory
        //Path filePath = FileSystems.getDefault().getPath("files", "SubdirectoryFile.txt");
        Path filePath = Paths.get(".","files", "SubdirectoryFile.txt");
        printFile(filePath);

        //printing contents of a file outside directory
        filePath = Paths.get("C:\\Users\\jtron\\Documents\\Computer Programming Notes\\Java\\Projects\\OutThere.txt");
        printFile(filePath);

        //printing absolute path
        filePath = Paths.get(".");
        System.out.println(filePath.toAbsolutePath());

        Path path2 = FileSystems.getDefault().getPath(".", "files", "..", "files", "SubdirectoryFile.txt");
        System.out.println(path2.normalize().toAbsolutePath());
        printFile(path2.normalize());

        //cresting file paths that do not exist
        Path path3 = FileSystems.getDefault().getPath("thisfiledoesnotexist.txt");
        System.out.println(path3.toAbsolutePath());

        Path path4 = Paths.get("\\Volumes\\Test\\ING", "abcdef", "whatever.txt");
        System.out.println(path4.toAbsolutePath());

        //checks if file directory exists
        filePath = FileSystems.getDefault().getPath("files");
        System.out.println("Exists = " + Files.exists(filePath));

        System.out.println("path3 exists = " + Files.exists(path3));
        System.out.println("path4 exists = " + Files.exists(path4));

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
*/
    }
}
