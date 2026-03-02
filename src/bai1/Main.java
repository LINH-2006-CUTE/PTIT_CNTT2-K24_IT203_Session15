package bai1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MedicalHistory recordManager = new MedicalHistory();

        recordManager.addEdit(new EditAction("Thêm thông tin bệnh nhân A"));
        recordManager.addEdit(new EditAction("Cập nhật địa chỉ liên hệ"));
        recordManager.addEdit(new EditAction("Ghi nhận kết quả xét nghiệm X"));

        EditAction latest = recordManager.getLatestEdit();
        if (latest != null) {
            System.out.println("Hành động gần nhất:" + latest.getDescription());
        }

        System.out.println("Undo ");
        recordManager.undoEdit();
        recordManager.undoEdit();
        recordManager.undoEdit();
        recordManager.undoEdit();

    }
}