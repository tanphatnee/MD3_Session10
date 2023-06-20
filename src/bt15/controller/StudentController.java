package bt15.controller;

import bt15.modal.Student;
import bt15.service.StudentService;

import java.util.ArrayList;

public class StudentController {
    private StudentService studentService = new StudentService();

    public ArrayList<Student> getAll() {
        return studentService.getAll();
    }

    public int getSize() {
        return studentService.getSize();
    }

    public void save(Student student) {
        studentService.save(student);
    }

    public void delete(int id) {
        studentService.delete(id);
    }

    public Student findById(int id) {
        return studentService.findById(id);
    }

    public int getNewId() {
        return studentService.getNewId();
    }

    public void sortByScore() {
        studentService.sortbyScore();
    }
}
