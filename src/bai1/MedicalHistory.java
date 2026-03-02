package bai1;

import java.util.Scanner;

import java.util.Stack;

public class MedicalHistory {
    private Stack<EditAction> history;


    public MedicalHistory() {
        history = new Stack<>(); // Tạo một Stack mới
    }

    public void addEdit(EditAction action) {
        history.push(action); // push() là thao tác thêm vào đỉnh Stack
        System.out.println("Đã thêm hành động: " + action.getDescription());
        displayHistory(); // Hiển thị lịch sử sau mỗi lần thêm
    }

    public EditAction undoEdit() {
        if (history.isEmpty()) {
            System.out.println("Không còn hành động nào để hoàn tác");
            return null; // null nếu k có gì để hoàn tác
        }
        EditAction lastAction = history.pop(); // pop() lấy và xóa phần tử ở đỉnh Stack
        System.out.println("Đã hoàn tác hành động: " + lastAction.getDescription());
        displayHistory();
        return lastAction;
    }


    public EditAction getLatestEdit() {
        if (history.isEmpty()) {
            System.out.println("Lịch sử chỉnh sửa đang trống.");
            return null;
        }
        return history.peek(); // peek() chỉ xem phần tử ở đỉnh Stack mà không xóa
    }


    public boolean isEmpty() {
        return history.isEmpty();
    }


    public void displayHistory() {
        System.out.println("\n--- LỊCH SỬ CHỈNH SỬA ---");
        if (history.isEmpty()) {
            System.out.println("Trống");
        } else {
            // Stack trong Java có thể duyệt từ trên xuống bằng cách lặp qua nó
            // hoặc sử dụng các phương thức khác. Ở đây ta dùng vòng lặp for-each đơn giản.
            // thứ tự duyệt của for-each trên Stack thường là từ đỉnh xuống đáy.
            for (int i = history.size() - 1; i >= 0; i--) {
                System.out.println("" + history.get(i)); // Lấy phần tử ở chỉ mục i và in ra
            }

        }
    }

    public int size() {
        return history.size();
    }
}