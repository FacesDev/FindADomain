package com.company;

import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileSearch {
    public Integer count = 0;
    public void parseFile(String fileName, String searchStr) throws FileNotFoundException {
       try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
           String currentLine;
           while((currentLine = br.readLine()) != null) {
               if(currentLine.toLowerCase().toString().contains(searchStr)) {
                   count++;
                   // **** Remove comment to see each line with searchStr present ****

//                   System.out.println(currentLine);

                   // **** Remove comment to write all matches to matches.txt ****

//                   try (BufferedWriter bw = new BufferedWriter(new FileWriter("./matches.txt", true))) {
//                       bw.write(currentLine);
//                       bw.newLine();
//                   } catch (IOException e) {
//                       e.printStackTrace();
//                   }
               }
           }
           System.out.println("Total instances of " + searchStr + " :" + count);
       } catch (IOException e) {
           e.printStackTrace();
       }
    }
}
