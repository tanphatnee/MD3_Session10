package bt15.service;

import bt15.modal.Student;

public interface IStudentService {
    void save(Student student);
    void delete(int id);
    Student findById(int id);
}
