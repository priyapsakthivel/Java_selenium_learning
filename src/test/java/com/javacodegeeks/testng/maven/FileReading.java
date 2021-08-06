package com.javacodegeeks.testng.maven;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReading {
    public static void main(String[] args)throws Exception
    {

      /*  File file = new File("M:\\maanga.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader br = new BufferedReader(fileReader);

        while(br.readLine() !=null){
            System.out.println(br.readLine());
        }*/

        Path path = Paths.get("M:\\maanga.txt");
        String read = Files.readAllLines(path).get(0);

        System.out.println(path.getFileName());
        System.out.println(path.getRoot());
        System.out.println(path.getNameCount());
        System.out.println(read);

    }

    public static MapModel helloPriya(String a){
        return new MapModel();
    }
   
}
