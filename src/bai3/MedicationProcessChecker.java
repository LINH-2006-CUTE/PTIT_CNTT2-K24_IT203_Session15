package bai3;

import java.util.Scanner;

import java.util.Stack;

public class MedicationProcessChecker {
    private Stack<String> stack;

    public MedicationProcessChecker() {
        this.stack = new Stack<>();
    }

    public boolean checkProcess(String[] actions) {
        for (String action : actions) {
            if (action.equalsIgnoreCase("pushhh")) {
                stack.push("Medication");
                System.out.println("Kích thước Stack: " + stack.size());

            } else if (action.equalsIgnoreCase("POP")) {
                if (stack.isEmpty()) {
                    System.out.println("Stack rỗng");
                }

                stack.pop();
                System.out.println("Kích thước Stack: " + stack.size());

            }
        }

        boolean finalCheck = stack.isEmpty();
        if (finalCheck) {
            System.out.println("Hơp lệ");
        } else {
            System.out.println("Không hợp lệ");
        }

        return finalCheck;
    }

}