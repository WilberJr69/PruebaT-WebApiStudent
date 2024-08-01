package com.services.ms.student.student_service.utils;
import lombok.Getter;

@Getter
public enum ErrorCatalog {

    STUDENT_NOT_FOUND("ERR_STUDENT_001", "El estudiante no se encuentra registrado"),
    STUDENT_ALREADY_EXISTS("ERR_STUDENT_002", "El estudiante ya se encuentra registrado"),
    STUDENT_NOT_CREATED("ERR_STUDENT_003", "El estudiante no pudo ser creado"),
    STUDENT_NOT_DELETED("ERR_STUDENT_004", "El estudiante no pudo ser eliminado"),
    STUDENT_NOT_UPDATED("ERR_STUDENT_005", "El estudiante no pudo ser actualizado"),
    STUDENT_NOT_FETCHED("ERR_STUDENT_006", "El estudiante no pudo ser consultado"),
    STUDENT_NOT_FETCHED_ALL("ERR_STUDENT_007", "No se encontraron estudiantes registrados"),
    STUDENT_NOT_VALID("ERR_STUDENT_008", "El estudiante no es valido"),
    STUDENT_NOT_DELETED_ALL("ERR_STUDENT_009", "No se pudieron eliminar los estudiantes"),
    GENERIC_ERROR("ERR_GENERIC_001", "Ha ocurrido un error inesperado"); //Error 404

    private final String code;
    private final String message;

    ErrorCatalog(String code, String message) {
        this.code = code;
        this.message = message;
    }




}
