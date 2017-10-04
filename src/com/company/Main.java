package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

            public void parseFile(String fileName, String searchStr) throws FileNotFoundException {

                LocalDateTime now = LocalDateTime.now();
                System.out.println("Start Time:" + dtf.format(now));
                Scanner scan = new Scanner(new File(fileName));
                while (scan.hasNext()) {
                    String line = scan.nextLine().toLowerCase().toString();
                    if (line.contains(searchStr)) {
                        System.out.println(line);
                    }
                }
                System.out.println("Finish Time:" + dtf.format(now));
            }
            public static void main(String[] args) throws FileNotFoundException {
                Main fileSearch = new Main();
                fileSearch.parseFile("/Users/solderedmachd/Desktop/domainSearch/src/com/company/com.", "soteria");
            }
}


