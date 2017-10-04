package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileSearch {
    public void parseFile(String fileName, String searchStr) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(fileName));
        Integer count = 0;
        while (scan.hasNext()) {

            String line = scan.nextLine().toLowerCase().toString();
            if (line.contains(searchStr)) {
                count ++;
                System.out.println(line);
            }
        }
        System.out.println("Total Instances: " + count);
    }
}
