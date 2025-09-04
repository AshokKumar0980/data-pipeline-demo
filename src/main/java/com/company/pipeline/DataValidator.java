package com.company.pipeline;

import java.io.File;

public class DataValidator {
    public boolean validate(String filePath) {
        File file = new File(filePath);
        boolean exists = file.exists() && file.length() > 0;

        if (exists) {
            System.out.println("✔ File validation passed: " + filePath);
        } else {
            System.out.println("✘ File validation failed: " + filePath);
        }
        return exists;
    }
}
