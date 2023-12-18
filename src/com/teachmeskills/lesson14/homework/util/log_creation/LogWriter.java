package com.teachmeskills.lesson14.homework.util.log_creation;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Date;

public class LogWriter {
    public static void writeExecutionLog(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Java\\TeachMeSkills_C26_Lesson_14_HW\\log\\execution\\execution_log.txt", true))) {
            writer.write(new Date().toString() + " " + message + "\n");
        } catch (IOException e) {
            System.out.println("Error writing to execution log: " + e.getMessage());
        }
    }

    public static void writeErrorLog(String errorMessage) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Java\\TeachMeSkills_C26_Lesson_14_HW\\log\\error\\error_log.txt", true))) {
            writer.write(new Date().toString() + " " + errorMessage + "\n");
        } catch (IOException e) {
            System.out.println("Error writing to error log: " + e.getMessage());
        }
    }
}
