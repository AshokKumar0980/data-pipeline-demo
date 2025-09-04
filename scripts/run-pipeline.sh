#!/bin/bash
echo "▶ Running Data Pipeline..."
java -cp target/data-processor-1.0.jar com.company.pipeline.Main
echo "✅ Data Pipeline execution completed."