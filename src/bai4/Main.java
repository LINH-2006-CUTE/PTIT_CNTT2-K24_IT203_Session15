package bai4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Gọi bệnh nhân vào khám ");
        EmergencyQueue triage = new EmergencyQueue();
        EmergencyPatient patient1 = new EmergencyPatient("P001", "Nguyễn Văn An", 2);
        triage.addPatient(patient1);
        EmergencyPatient patient2 = new EmergencyPatient("P002", "Trần Thị Bình", 1);
        triage.addPatient(patient2);
        EmergencyPatient patient3 = new EmergencyPatient("P003", "Lê Văn Cường", 2);
        triage.addPatient(patient3);
        EmergencyPatient patient4 = new EmergencyPatient("P004", "Phạm Thị Dung", 1);
        triage.addPatient(patient4);

        EmergencyPatient patient5 = new EmergencyPatient("P005", "Hoàng Văn Giang", 2);
        triage.addPatient(patient5);


    }
}