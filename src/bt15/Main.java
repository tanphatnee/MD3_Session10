package bt15;

import bt15.config.ConfigScanner;
import bt15.controller.StudentController;
import bt15.modal.Student;

public class Main {
    static StudentController studentController = new StudentController();

    public static void main(String[] args) {
        int choose = 0;
        while (choose != 7) {
            System.out.println("================   MENU   ================");
            System.out.println("1. Xem list sinh viên");
            System.out.println("2. Thêm sinh viên");
            System.out.println("3. Sửa sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. In điểm trung bình của sinh viên");
            System.out.println("6. Sort by score");
            System.out.println("7. Thoát");
            System.out.println("===========================================");
            choose = ConfigScanner.scanner().nextInt();
            switch (choose) {
                case 1:
                    showListStudent();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    editStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    printDiemTrungBinh();
                    break;
                case 6:
                    studentController.sortByScore();
                    showListStudent();
                    break;
                case 7:
                    break;
                default:
                    break;
            }
        }
    }

    public static void showListStudent() {
        if (studentController.getSize() == 0) {
            System.err.println("Không có sinh viên nào");
            return;
        }
        for (Student student : studentController.getAll()) {
            System.out.println(student);
        }
    }

    public static void addStudent() {
        Student newStudent = new Student();
        newStudent.setId(studentController.getNewId());
        System.out.print("Nhập tên: ");
        newStudent.setName(ConfigScanner.scanner().nextLine());
        System.out.print("Nhập điểm trung bình: ");
        newStudent.setDiemTrungBinh(ConfigScanner.scanner().nextDouble());
        studentController.save(newStudent);
    }

    public static void editStudent() {
        System.out.print("Bạn muốn sửa id sinh viên nào: ");
        int id = ConfigScanner.scanner().nextInt();
        Student student = studentController.findById(id);
        System.out.printf("Sửa tên (tên cũ: %s): ", student.getName());
        student.setName(ConfigScanner.scanner().nextLine());
        System.out.printf("Sửa điểm trung trình (điểm cũ: %f): ", student.getDiemTrungBinh());
        student.setDiemTrungBinh(ConfigScanner.scanner().nextDouble());
        studentController.save(student);
    }

    public static void deleteStudent() {
        System.out.print("Bạn muốn sửa id sinh viên nào: ");
        int id = ConfigScanner.scanner().nextInt();
        studentController.delete(id);
    }

    public static void printDiemTrungBinh() {
        if (studentController.getSize() == 0) {
            System.err.println("Không có sinh viên nào");
            return;
        }
        for (Student student : studentController.getAll()) {
            System.out.println("Name: " + student.getName() + " | Điểm trung bình: " + student.getDiemTrungBinh());
        }
    }
}
