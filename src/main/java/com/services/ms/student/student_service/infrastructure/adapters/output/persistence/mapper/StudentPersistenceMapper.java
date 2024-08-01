package com.services.ms.student.student_service.infrastructure.adapters.output.persistence.mapper;

import com.services.ms.student.student_service.domain.model.Student;
import com.services.ms.student.student_service.infrastructure.adapters.output.persistence.Entity.StudentEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentPersistenceMapper {

    StudentEntity toStudentEntity(Student student);

    Student toStudent(StudentEntity studentEntity);

    List<Student> toStudentList(List<StudentEntity> entityList);



}
