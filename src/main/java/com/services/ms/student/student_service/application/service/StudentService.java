package com.services.ms.student.student_service.application.service;

import com.services.ms.student.student_service.application.ports.input.StudentServicePort;
import com.services.ms.student.student_service.application.ports.output.StudentPersistencePort;
import com.services.ms.student.student_service.domain.exception.StudentNotFoundException;
import com.services.ms.student.student_service.domain.model.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService implements StudentServicePort   {

    private final StudentPersistencePort persistencePort;

    @Override
    public Student findById(Long id) {
        return persistencePort.finById(id)
                .orElseThrow(StudentNotFoundException::new);

    }

    @Override
    public Student save(Student student) {
        return persistencePort.save(student);
    }

    @Override
    public List<Student> findAll() {
        return persistencePort.findAll();
    }

    @Override
    public Student update(Long id, Student student) {
        return persistencePort.finById(id)
                .map(savedStudent ->{
                    savedStudent.setFirstName(student.getFirstName());
                    savedStudent.setLastName(student.getLastName());
                    savedStudent.setAge(student.getAge());
                    savedStudent.setAddress(student.getAddress());
                    return persistencePort.save(savedStudent);
                })
        .orElseThrow(StudentNotFoundException::new);
    }

    @Override
    public void deleteById(Long id) {
        if (persistencePort.finById(id).isEmpty()){
            throw new StudentNotFoundException();
        }
        persistencePort.deleteById(id);
    }


}
