package com.company;

import java.io.*;

public class Main {
    private static BufferedWriter bw;
            public static void main(String[] args) throws FileNotFoundException {
                FileSearch fileSearch = new FileSearch();
                long startTime = System.currentTimeMillis();
                fileSearch.parseFile("/Users/solderedmachd/Desktop/domainSearch/src/com/company/com.", "soteria");
                long endTime   = System.currentTimeMillis();
                long totalTime = endTime - startTime;
                System.out.println("Run Time (ms): " + totalTime);
                System.out.println("Run Time (ss)" + (totalTime / 1000.0));



                File file = new File("/Users/solderedmachd/Desktop/domainSearch/src/com/company/timeLog.txt");

                try {
                    FileWriter fw = new FileWriter(file);
                    bw = new BufferedWriter(fw);
                    bw.write("Total Run Time: " + totalTime);
//                    bw.newLine();
                    bw.close();
                    System.out.println("done!!");

                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
}



