package bai5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        EmergencyCaseQueue waitingRoom = new EmergencyCaseQueue();
        Patient p1 = new Patient("E001", "Nguyễn Văn A");
        EmergencyCase case1 = new EmergencyCase(p1);
        waitingRoom.addCase(case1);

        Patient p2 = new Patient("E002", "Trần Thị B");
        EmergencyCase case2 = new EmergencyCase(p2);
        waitingRoom.addCase(case2);

        waitingRoom.displayQueue();
        EmergencyCase currentPatientCase = waitingRoom.getNextCase();
        if (currentPatientCase != null) {
            currentPatientCase.addStep(new TreatmentStep("Tiếp nhận", "10:00"));
            currentPatientCase.addStep(new TreatmentStep("Chẩn đoán sơ bộ", "10:05"));
            currentPatientCase.addStep(new TreatmentStep("Tiêm thuốc giảm đau", "10:10"));
            currentPatientCase.undoStep(); // Hoàn tác "Tiêm thuốc giảm đau"

            currentPatientCase.addStep(new TreatmentStep("Truyền dịch", "10:15"));

            currentPatientCase.displaySteps();
        }

        EmergencyCase nextPatientCase = waitingRoom.getNextCase();
        if (nextPatientCase != null) {
            nextPatientCase.addStep(new TreatmentStep("Tiếp nhận", "10:12"));
            nextPatientCase.addStep(new TreatmentStep("Kiểm tra dấu hiệu sinh tồn", "10:14"));
            nextPatientCase.displaySteps();
        }

        waitingRoom.displayQueue();

        EmergencyCase firstPatientCaseAgain = waitingRoom.getNextCase();
        if (firstPatientCaseAgain != null) {
            System.out.println("Hoàn tất quy trình cho " + firstPatientCaseAgain.patient.name);
        }

        waitingRoom.displayQueue();

    }
}