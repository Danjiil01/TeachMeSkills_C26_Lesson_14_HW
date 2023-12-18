package com.teachmeskills.lesson14.homework.util.file_parsing;

import com.teachmeskills.lesson14.homework.util.log_creation.LogWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileParser {
    public String[] parseFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            return reader.lines().toArray(String[]::new);
        } catch (IOException e) {
            LogWriter.writeErrorLog("Error while reading the input file: " + e.getMessage());
            return new String[0];
        }
    }
}
