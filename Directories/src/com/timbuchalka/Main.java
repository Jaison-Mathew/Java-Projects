package com.timbuchalka;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) {

/*
        DirectoryStream.Filter<Path> filter = new DirectoryStream.Filter<Path>(){
            public boolean accept(Path path) throws IOException{
                return (Files.isRegularFile(path));
            }
        };
*/
        //Same directory stream function but with Lambda expression
        DirectoryStream.Filter<Path> filter = p -> Files.isRegularFile(p);

        Path directory = FileSystems.getDefault().getPath("FileTree" + File.separator + "Dir2");
        //Path directory = FileSystems.getDefault().getPath("FileTree\\Dir2");

        //reads existing contents in path directory
        try (DirectoryStream<Path> contents = Files.newDirectoryStream(directory, filter)){
            for (Path file : contents){
                System.out.println(file.getFileName());
            }
        }catch (IOException | DirectoryIteratorException e){
            System.out.println(e.getMessage());
        }

        String separator = File.separator;
        System.out.println(separator);              //displays file separator
        separator = FileSystems.getDefault().getSeparator();
        System.out.println(separator);

        //creating temporary file
        try {
            Path tempFile = Files.createTempFile("myapp", ".appext");
            System.out.println("Temporary file path = " + tempFile.toAbsolutePath());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        Iterable<FileStore> stores = FileSystems.getDefault().getFileStores();
        for (FileStore store : stores){
            System.out.println("Volume name/Drive letter = " + store);          //displays drive letter
            System.out.println("file store = " + store.name());           //method returns iterable of file store
        }

        System.out.println("***************************");
        Iterable<Path> rootPaths = FileSystems.getDefault().getRootDirectories();
        for (Path path : rootPaths){
            System.out.println(path);               //displays root directory
        }

        //displaying walking filetree
        System.out.println("---Walking tree for Dir2---");
        Path dir2Path = FileSystems.getDefault().getPath("FileTree" + File.separator + "Dir2");             //created path to dir2 folder
        try {
            Files.walkFileTree(dir2Path, new PrintNames());           //walking on path
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println("---Copy Dir2 to Dir4/Dir2Copy---");
        //copying FileTree/Dir4/Dir2Copy
        Path copyPath = FileSystems.getDefault().getPath("Filetree" + File.separator + "Dir4" + File.separator + "Dir2Copy");
        try {
            Files.walkFileTree(dir2Path, new CopyFiles(dir2Path, copyPath));
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        //mapping files using IO and NIO methods
        File file = new File("C:\\Examples\\file.txt");
        Path convertedPath = file.toPath();
        System.out.println("convertedPath = " + convertedPath);

        File parent = new File("C:\\Examples");
        File resolvedFile = new File(parent, "dir\\file.txt");
        System.out.println(resolvedFile.toPath());

        resolvedFile = new File("C:\\Examples", "dir\\file.txt");
        System.out.println(resolvedFile.toPath());

        Path parentPath = Paths.get("C:\\Examples");
        Path childRelativePath = Paths.get("dir\\file.txt");
        System.out.println(parentPath.resolve(childRelativePath));

        File workingDirectory = new File("").getAbsoluteFile();
        System.out.println("Working directory = " + workingDirectory.getAbsolutePath());

        System.out.println("--- print Dir2 contents using list() ---");
        File dir2File = new File(workingDirectory, "\\FileTree\\Dir2");
        String[] dir2Contents = dir2File.list();
        for (int i=0; i< dir2Contents.length; i++){
            System.out.println("i = " + i + ": " + dir2Contents[i]);
        }

        System.out.println("--- print Dir2 contents using listFiles() ---");
        File[] dir2Files = dir2File.listFiles();
        for (int i = 0; i < dir2Files.length; i++){
            System.out.println("i = " + i + ": " + dir2Files[i].getName());
        }
    }
}
