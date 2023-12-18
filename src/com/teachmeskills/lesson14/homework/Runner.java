package com.teachmeskills.lesson14.homework;

import com.teachmeskills.lesson14.homework.util.file_parsing.FileParser;
import com.teachmeskills.lesson14.homework.util.log_creation.LogWriter;
import com.teachmeskills.lesson14.homework.validation.DocumentValidator;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        LogWriter.writeExecutionLog("Program started");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file`s path: ");
        String filePath = scanner.nextLine();
        String[] documents = new FileParser().parseFile(filePath);
        DocumentValidator.validateDocuments(documents);
        LogWriter.writeExecutionLog("Program finished");
    }
}
