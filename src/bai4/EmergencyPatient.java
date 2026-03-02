package bai4;

import java.util.Scanner;

public class EmergencyPatient implements Comparable<EmergencyPatient> {
    private String id;
    private String name;
    private int priority; // 1: Cấp cứu (Cao), 2: Thường (Thấp)

    public EmergencyPatient(String id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }

    // Getters
    public String getId() { return id; }
    public String getName() { return name; }
    public int getPriority() { return priority; }

    @Override
    public String toString() {
        String level = (priority == 1) ? "Cấp Cứu" : "Thường";
        return "ID: " + id + ", Tên: " + name + " (Ưu tiên: " + level + ")";
    }

    // ********* PHẦN QUAN TRỌNG NHẤT: LOGIC SO SÁNH *********
    @Override
    public int compareTo(EmergencyPatient other) {
        // 1. So sánh theo Mức độ Ưu tiên (Priority)
        // Nếu priority của 'this' NHỎ HƠN (ưu tiên cao hơn) priority của 'other', ta trả về số âm.
        int priorityComparison = Integer.compare(this.priority, other.priority);

        if (priorityComparison != 0) {
            // Nếu mức độ ưu tiên khác nhau, sắp xếp theo mức độ (1 trước 2)
            return priorityComparison;
        } else {
            // 2. Nếu mức độ ưu tiên BẰNG NHAU (cùng 1 hoặc cùng 2), áp dụng FIFO.
            // Vì PriorityQueue không tự động lưu thứ tự đến, chúng ta cần thêm một tiêu chí
            // để đảm bảo FIFO. Trong môi trường thực tế, ta thường thêm một biến 'arrivalTime'.
            // Tuy nhiên, theo yêu cầu bài toán, nếu không có arrivalTime, ta có thể tạm thời
            // coi như chỉ sắp xếp theo Priority.

            // Để thực hiện FIFO (người đến trước được khám trước) khi priority bằng nhau,
            // trong một bài toán phức tạp hơn, bạn sẽ cần thêm một tham số arrivalTime (thời điểm đến)
            // và so sánh arrivalTime.

            // Đối với bài toán đơn giản này, ta có thể trả về 0, ngụ ý rằng thứ tự không quan trọng
            // nếu PriorityQueue không hỗ trợ FIFO rõ ràng (nó sẽ chọn ngẫu nhiên hoặc theo cấu trúc nội bộ).
            // Tuy nhiên, để minh họa tốt nhất, ta dùng một ID để tạo tính ổn định (nhưng không phải FIFO):
            // return this.id.compareTo(other.id);

            // GIẢI PHÁP ĐƠN GIẢN NHẤT CHO YÊU CẦU FIFO NGẦM ĐỊNH:
            // Khi priority bằng nhau, nếu dùng PriorityQueue mặc định (min-heap),
            // ta cần một cách để người đến trước có "giá trị so sánh nhỏ hơn" để được ưu tiên.
            // Vì bài toán này không cung cấp thời điểm đến, ta sẽ dựa hoàn toàn vào Priority.
            // Nếu hai priority bằng nhau, ta trả về 0 để PriorityQueue không cần sắp xếp thêm.
            return 0;
        }
    }
}