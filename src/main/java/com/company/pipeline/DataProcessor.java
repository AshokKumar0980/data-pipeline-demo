package com.company.pipeline;

import java.io.*;
import java.nio.file.*;

public class DataProcessor {
    public void process(String inputFile, String outputFile) {
        try {
            System.out.println("⚙ Processing data...");
            // For demo: just copy input file to output file
            Files.copy(Paths.get(inputFile), Paths.get(outputFile), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("✔ Data written to " + outputFile);
        } catch (IOException e) {
            System.out.println("✘ Error processing file: " + e.getMessage());
        }
    }
}
