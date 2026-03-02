package bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MedicationProcessChecker checker = new MedicationProcessChecker();
        String[] validActions = {"PUSH", "PUSH", "POP", "POP"};
        System.out.println("Kiểm tra 1 : " + checker.checkProcess(validActions));
        System.out.println("\n========================================\n");

        String[] invalidActions1 = {"POP", "PUSH", "POP"};
        System.out.println("Kiểm tra 2 : " + checker.checkProcess(invalidActions1));
        System.out.println("\n========================================\n");

        String[] invalidActions2 = {"PUSH", "POP", "PUSH"};
        System.out.println("Kiểm tra 3 : " + checker.checkProcess(invalidActions2));
    }
}