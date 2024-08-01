package com.services.ms.student.student_service.infrastructure.adapters.input.rest.model.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentCreateRequest {

    @NotBlank(message = "El campo First name no puede ser vacio o nulo")
    private String firstName;

    @NotBlank(message = "El campo Last name no puede ser vacio o nulo")
    private String lastName;

    @NotNull(message = "El campo Age no puede ser vacio o nulo")
    private Integer age;

    @NotBlank(message = "El campo Address no puede ser vacio o nulo")
    private String address;




}
