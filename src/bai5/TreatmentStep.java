package bai5;

import java.util.Scanner;

class TreatmentStep {
    String description;
    String time;

    TreatmentStep(String description, String time) {
        this.description = description;
        this.time = time;
    }

    @Override
    public String toString() {
        return description + " lúc " + time;
    }
}