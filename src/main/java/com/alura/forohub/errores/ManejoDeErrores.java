package com.alura.forohub.errores;


import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@RestControllerAdvice
public class ManejoDeErrores {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity ManejarError404(){
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity ManejarError400(){
        return ResponseEntity.badRequest().body("Escribe un número válido");
    }


}
