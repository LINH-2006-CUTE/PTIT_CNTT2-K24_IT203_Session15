package bai2;

import java.util.Scanner;

import java.util.LinkedList;
import java.util.Queue;

public class PatientQueue {
    private Queue<Patient> queue;

    public PatientQueue() {
        queue = new LinkedList<>();
    }

    // thêm bệnh nhân vào cuối hàng đợi (Enqueue)
    public void addPatient(Patient p) {
        queue.add(p);
        System.out.println("thêm bệnh nhân " + p.getName());
        displayQueue();
    }

    // gọi bệnh nhân đầu tiên để khám (Dequeue)
    public Patient callNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Hàng đợitrống");
            return null;
        }
        Patient next = queue.poll();
        System.out.println("gọi bệnh nhân: " + next.getName());
        displayQueue();
        return next;
    }

    public Patient peekNextPatient() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.peek(); // chỉ xem bệnh nhân đầu tiên
    }

    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Không có bệnh nhân nào ");
        } else {
            // Duyệt từ đầu đến cuối
            for (Patient p : queue) {
                System.out.println("    " + p);
            }
        }
    }
}