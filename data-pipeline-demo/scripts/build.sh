#!/bin/bash
echo "Building Data Pipeline JAR..."

# Clean previous builds
rm -rf target/
mkdir -p target/

# Compile Java files
javac -d target/ src/main/java/com/company/pipeline/*.java

# Create JAR file
cd target/
jar cfm data-processor-1.0.jar ../MANIFEST.MF com/company/pipeline/*.class
cd ..

echo "Build completed: target/data-processor-1.0.jar"