package com.prueba.aldeamo.services;

import com.prueba.aldeamo.dto.ArraysDto;
import com.prueba.aldeamo.dto.ResponseDto;

public interface IServiceArrays {
	
	public ResponseDto<ArraysDto> getRespuesta(int id, int arrayA);
	
}
