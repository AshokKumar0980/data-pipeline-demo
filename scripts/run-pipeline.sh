#!/bin/bash
echo "Running Data Pipeline..."

INPUT_FILE=${1:-"input/sample-data.csv"}
OUTPUT_FILE=${2:-"output/processed-data.csv"}

java -jar target/data-processor-1.0.jar "$INPUT_FILE" "$OUTPUT_FILE"

echo "Pipeline execution completed"
echo "Output file: $OUTPUT_FILE"