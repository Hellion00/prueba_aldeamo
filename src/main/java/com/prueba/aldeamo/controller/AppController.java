package com.prueba.aldeamo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.aldeamo.dto.ArraysDto;
import com.prueba.aldeamo.dto.RequestDto;
import com.prueba.aldeamo.dto.ResponseDto;
import com.prueba.aldeamo.services.IServiceArrays;

/**
 * Clase Controlador que permite definir las operaciones de exposicion en el
 * servicio REST
 *
 * @since 05/05/2022
 * @version 1.0
 * @author Anthony Parra
 */
@RestController
@RequestMapping("/PruebaAldeamo/V1")
public class AppController {

	@Autowired
	private IServiceArrays service;
	
	@RequestMapping(path="/getRespuesta", method=RequestMethod.POST)
	private ResponseEntity<ResponseDto<ArraysDto>> getData(@RequestBody RequestDto req) {
		if(req.getId()>5 || req.getId()==0) {
			return ResponseEntity.ok(new ResponseDto<ArraysDto>(null, 400, "Error el id debe ser igual o menor a 5 y no puede ser 0"));
		}
		return ResponseEntity.ok(service.getRespuesta(req.getId(), req.getQ()));
	}
}
