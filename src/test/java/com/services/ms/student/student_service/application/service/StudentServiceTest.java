package com.services.ms.student.student_service.application.service;

import com.services.ms.student.student_service.application.ports.output.StudentPersistencePort;
import com.services.ms.student.student_service.domain.model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

class StudentServiceTest {

    @Mock
    private StudentPersistencePort persistencePort;

    @InjectMocks
    private StudentService studentService;

    private Student student;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        student = Student.builder()
                .id(3L)
                .firstName("John")
                .lastName("Doe")
                .age(20)
                .address("123 Main St")
                .build();
    }

    @Test
    void findById() {
        when(persistencePort.finById(1L)).thenReturn(Optional.of(student));
        assertNotNull(studentService.findById(1L));
    }

    @Test
    void save() {
        when(persistencePort.save(student)).thenReturn(student);
        assertNotNull(studentService.save(student));
    }

    @Test
    void findAll() {
        when(persistencePort.findAll()).thenReturn(List.of(student));
        assertNotNull(studentService.findAll());
    }

    @Test
    void update() {
        when(persistencePort.finById(1L)).thenReturn(Optional.of(student));
    }

    @Test
    void deleteById() {
        when(persistencePort.finById(1L)).thenReturn(Optional.of(student));
    }
}