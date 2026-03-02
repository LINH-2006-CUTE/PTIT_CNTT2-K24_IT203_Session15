package bai5;

import java.util.Scanner;

import java.util.Queue; // Nhớ import Queue
import java.util.LinkedList;
class EmergencyCaseQueue {
    Queue<EmergencyCase> cases; // Hàng đợi bệnh nhân chờ
    EmergencyCaseQueue() {
        this.cases = new LinkedList<>();
    }
    public void addCase(EmergencyCase newCase) {
        cases.offer(newCase); // Thêm vào cuối Queue
        System.out.println("Bệnh nhân " + newCase.patient.name + " đã được thêm vào hàng đợi chờ");
    }

    public EmergencyCase getNextCase() {
        if (cases.isEmpty()) {
            System.out.println("Hàng đợi đang trống. Không có bệnh nhân nào để xử lý");
            return null;
        }
        EmergencyCase next = cases.poll();
        System.out.println("Bác sĩ bắt đầu xử lý cho: " + next.patient.name);
        return next;
    }
    public void displayQueue() {
        System.out.println("Danh sách bệnh nhân đang chờ");
        if (cases.isEmpty()) {
            System.out.println("Không có ai đang chờ");
        } else {
            for (EmergencyCase currentCase : cases) {
                System.out.println("" + currentCase.patient.name);
            }
        }
    }
}