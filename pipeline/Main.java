package com.company.pipeline;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting Data Pipeline...");
        
        String inputPath = args.length > 0 ? args[0] : "input/sample-data.csv";
        String outputPath = args.length > 1 ? args[1] : "output/processed-data.csv";
        
        DataProcessor processor = new DataProcessor();
        processor.processFile(inputPath, outputPath);
        
        System.out.println("Pipeline completed successfully!");
    }
}