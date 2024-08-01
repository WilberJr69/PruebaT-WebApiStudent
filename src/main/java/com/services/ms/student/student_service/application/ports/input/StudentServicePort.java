package com.services.ms.student.student_service.application.ports.input;

import com.services.ms.student.student_service.domain.model.Student;

import java.util.List;

public interface StudentServicePort {

    //Casos de Uso
    Student findById(Long id);
    //CRUD
    Student save(Student student);
    List<Student> findAll();
    Student update(Long id, Student student);
    void deleteById(Long id);

}
