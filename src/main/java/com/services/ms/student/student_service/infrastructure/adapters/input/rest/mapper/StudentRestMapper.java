package com.services.ms.student.student_service.infrastructure.adapters.input.rest.mapper;

import com.services.ms.student.student_service.domain.model.Student;
import com.services.ms.student.student_service.infrastructure.adapters.input.rest.model.request.StudentCreateRequest;
import com.services.ms.student.student_service.infrastructure.adapters.input.rest.model.response.StudentResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StudentRestMapper{

    // StudentCreateRequest to Student
    // StudentResponse to Student


    Student toStudent(StudentCreateRequest studentCreateRequest);
    StudentResponse toStudentResponse(Student student);
    List<StudentResponse> toStudentResponseList(List<Student> studentList);


}
