package bt15.service;

import bt15.modal.Student;

import java.util.ArrayList;

public class StudentService implements IStudentService {

    private ArrayList<Student> students = new ArrayList<>();

    public ArrayList<Student> getAll() {
        return students;
    }

    public int getSize() {
        return students.size();
    }

    @Override
    public void save(Student student) {
        if (findById(student.getId()) == null) {
            students.add(student);
        } else {
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getId() == student.getId()) {
                    students.set(i, student);
                }
            }
        }
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
            }
        }
    }

    @Override
    public Student findById(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    public int getNewId() {
        int max = 0;
        for (Student s : students) {
            if (max < s.getId()) {
                max = s.getId();
            }
        }
        return max + 1;
    }

    public void sortbyScore() {
        students.sort((o1, o2) -> (int) (o1.getDiemTrungBinh() - o2.getDiemTrungBinh()));
    }
}
