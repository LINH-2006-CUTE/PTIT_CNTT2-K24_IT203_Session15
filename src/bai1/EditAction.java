package bai1;

import java.util.Scanner;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class EditAction {
    private String description;
    private LocalDateTime time;

    public EditAction(String description) {
        this.description = description;
        this.time = LocalDateTime.now();
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getTime() {
        return time;
    }


    @Override
    public String toString() {
        // định dạng
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return time.format(formatter) + description;
    }

}