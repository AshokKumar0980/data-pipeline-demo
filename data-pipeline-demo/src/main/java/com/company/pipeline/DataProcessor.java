package com.company.pipeline;

import java.io.*;
import java.util.*;

public class DataProcessor {
    
    public void processFile(String inputPath, String outputPath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
             PrintWriter writer = new PrintWriter(new FileWriter(outputPath))) {
            
            String header = reader.readLine();
            writer.println(header + ",processed_timestamp");
            
            String line;
            int recordCount = 0;
            
            while ((line = reader.readLine()) != null) {
                String processedLine = processRecord(line);
                writer.println(processedLine + "," + System.currentTimeMillis());
                recordCount++;
            }
            
            System.out.println("Processed " + recordCount + " records");
            
        } catch (IOException e) {
            System.err.println("Error processing file: " + e.getMessage());
        }
    }
    
    private String processRecord(String record) {
        // Add your business logic here
        // Example: Clean data, validate, transform
        return record.trim().toLowerCase();
    }
}