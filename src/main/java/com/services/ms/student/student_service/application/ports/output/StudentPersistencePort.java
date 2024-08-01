package com.services.ms.student.student_service.application.ports.output;

import com.services.ms.student.student_service.domain.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentPersistencePort {

    Optional<Student> finById(Long id);
    List<Student> findAll();
    Student save(Student student);
    //Save se usa para el update
    void deleteById(Long id);

}
