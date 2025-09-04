package com.company.pipeline;

public class Main {
    public static void main(String[] args) {
        System.out.println("🚀 Starting Data Pipeline...");

        DataValidator validator = new DataValidator();
        DataProcessor processor = new DataProcessor();

        String inputFile = "input/sample-data.csv";
        String outputFile = "output/processed-data.csv";

        if (validator.validate(inputFile)) {
            processor.process(inputFile, outputFile);
            System.out.println("✅ Pipeline completed successfully!");
        } else {
            System.out.println("❌ Validation failed. Exiting...");
        }
    }
}
