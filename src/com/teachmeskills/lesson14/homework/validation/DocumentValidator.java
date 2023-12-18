package com.teachmeskills.lesson14.homework.validation;

import com.teachmeskills.lesson14.homework.util.document_log.DocumentWriter;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class DocumentValidator {
    public static void validateDocuments(String[] documents) {
        StringBuilder validDocNums = new StringBuilder();
        StringBuilder validContracts = new StringBuilder();
        StringBuilder invalidDocs = new StringBuilder();

        for (String doc : documents) {
            if (isValidDocNum(doc)) {
                validDocNums.append(doc).append("\n");
            } else if (isValidContract(doc)) {
                validContracts.append(doc).append("\n");
            } else {
                invalidDocs.append(doc).append(": Invalid format or contains illegal characters\n");
            }
        }

        DocumentWriter.writeValidDocNums(validDocNums.toString());
        DocumentWriter.writeValidContracts(validContracts.toString());
        DocumentWriter.writeInvalidDocs(invalidDocs.toString());
    }

    private static boolean isValidDocNum(String doc) {
        Pattern pattern = Pattern.compile("^(docnum)[A-Za-z0-9]{9}$");
        Matcher matcher = pattern.matcher(doc);
        return matcher.matches();
    }

    private static boolean isValidContract(String doc) {
        Pattern pattern = Pattern.compile("^(contract)[A-Za-z0-9]{7}$");
        Matcher matcher = pattern.matcher(doc);
        return matcher.matches();
    }
}
