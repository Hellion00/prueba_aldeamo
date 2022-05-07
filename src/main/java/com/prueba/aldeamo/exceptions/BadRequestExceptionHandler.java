package com.prueba.aldeamo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.prueba.aldeamo.dto.ArraysDto;
import com.prueba.aldeamo.dto.ResponseDto;


@ControllerAdvice
public class BadRequestExceptionHandler {

    public ResponseEntity<ResponseDto<ArraysDto>> exceptionHandler(BadRequestException ex) {
    	ResponseDto<ArraysDto> error = new ResponseDto<>(null,
        		HttpStatus.BAD_REQUEST.value(),
        		null
        		);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
    }
}
