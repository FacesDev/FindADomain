package com.company;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    private static final String FILENAME = "/Users/solderedmachd/Desktop/domainSearch/src/com/company/com.";
    private static final String SEARCHSTRING = "soteria";

    public static void main(String[] args) throws FileNotFoundException {
                System.out.println("Begin Search");

                FileSearch fileSearch = new FileSearch();

                DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                long startTime = System.currentTimeMillis();

                fileSearch.parseFile(FILENAME, SEARCHSTRING);

                long endTime   = System.currentTimeMillis();
                long totalTime = endTime - startTime;

                System.out.println("Run Time (ms): " + totalTime);
                System.out.println("Run Time (ss)" + (totalTime / 1000.0));
                System.out.println("Fastest Time (ss): scanner " + 105.02);
            }
}



