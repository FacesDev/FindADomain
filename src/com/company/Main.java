package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {


            public void parseFile(String fileName, String searchStr) throws FileNotFoundException {
                System.out.println("here");
                Scanner scan = new Scanner(new File(fileName));
                while (scan.hasNext()) {
                    String line = scan.nextLine().toLowerCase().toString();
                    if (line.contains(searchStr)) {
                        System.out.println(line);
                    }
                }
            }
            public static void main(String[] args) throws FileNotFoundException {
                System.out.println("here");
                Main fileSearch = new Main();
                fileSearch.parseFile("/Users/solderedmachd/Desktop/domainSearch/src/com/company/com.", "soteria");
            }

}