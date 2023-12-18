package com.teachmeskills.lesson14.homework.util.document_log;

import com.teachmeskills.lesson14.homework.util.log_creation.LogWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DocumentWriter {
    public static void writeValidDocNums(String validDocNums) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Java\\TeachMeSkills_C26_Lesson_14_HW\\report\\docnum_report\\valid_docnums_report.txt"))) {
            writer.write(validDocNums);
        } catch (IOException e) {
            LogWriter.writeErrorLog("Error writing valid docnums: " + e.getMessage());
        }
    }

    public static void writeValidContracts(String validContracts) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Java\\TeachMeSkills_C26_Lesson_14_HW\\report\\contract_report\\valid_contracts_report.txt"))) {
            writer.write(validContracts);
        } catch (IOException e) {
            LogWriter.writeErrorLog("Error writing valid contracts: " + e.getMessage());
        }
    }

    public static void writeInvalidDocs(String invalidDocs) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Java\\TeachMeSkills_C26_Lesson_14_HW\\report\\doc_report\\invalid_docs_report.txt"))) {
            writer.write(invalidDocs);
        } catch (IOException e) {
            LogWriter.writeErrorLog("Error writing invalid docs: " + e.getMessage());
        }
    }
}
