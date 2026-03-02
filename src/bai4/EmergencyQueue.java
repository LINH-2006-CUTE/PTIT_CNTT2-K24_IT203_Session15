package bai4;

import java.util.Scanner;

import java.util.PriorityQueue;

public class EmergencyQueue {
    private PriorityQueue<EmergencyPatient> priorityQueue;

    public EmergencyQueue() {
        this.priorityQueue = new PriorityQueue<>();
    }

    public void addPatient(EmergencyPatient p) {
        priorityQueue.add(p);
        System.out.println("Bệnh nhân " + p.getName() + " đã đăng ký");
        displayQueue();
    }

    public EmergencyPatient callNextPatient() {
        if (priorityQueue.isEmpty()) {
            System.out.println("Hàng đợi đang trống.");
            return null;
        }
        EmergencyPatient nextPatient = priorityQueue.poll();
        System.out.println("Bác sĩ gọi bệnh nhân: " + nextPatient.getName());
        displayQueue();
        return nextPatient;
    }

    public void displayQueue() {
        System.out.println("Hàng đợi Ưu tiên");
        if (priorityQueue.isEmpty()) {
            System.out.println("Hàng đợi đang trống");
        } else {
            for (EmergencyPatient p : priorityQueue) {
                System.out.println("- " + p);
            }
        }
    }
}