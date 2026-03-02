package bai5;

import java.util.Scanner;

class Patient {
    String id;
    String name;

    Patient(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bệnh nhân: " + name + " (ID: " + id + ")";
    }
}