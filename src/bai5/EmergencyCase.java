package bai5;

import java.util.Scanner;
import java.util.Stack;

class EmergencyCase {
    Patient patient;
    Stack<TreatmentStep> steps;

    EmergencyCase(Patient patient) {
        this.patient = patient;
        this.steps = new Stack<>();
    }

    public void addStep(TreatmentStep step) {
        steps.push(step);
        System.out.println(" Đã ghi nhận bước: " + step.description + " cho " + patient.name);
    }

    public TreatmentStep undoStep() {
        if (steps.isEmpty()) {
            System.out.println("Không có bước nào để hoàn tác cho " + patient.name);
            return null;
        }
        TreatmentStep lastStep = steps.pop();
        System.out.println("Đã hoàn tác bước: " + lastStep.description + " cho " + patient.name);
        return lastStep;
    }
    public void displaySteps() {
        System.out.println("Lịch sử xử lý cho " + patient.name + ":");
        if (steps.isEmpty()) {
            System.out.println("      (Chưa có bước nào được ghi)");
        } else {
            Stack<TreatmentStep> tempStack = new Stack<>();
            tempStack.addAll(steps);
            while(!tempStack.isEmpty()){
                TreatmentStep step = tempStack.pop();
                System.out.println("" + step);
            }
        }
    }
}