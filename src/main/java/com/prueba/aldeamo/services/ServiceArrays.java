package com.prueba.aldeamo.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.aldeamo.dto.ArraysDto;
import com.prueba.aldeamo.dto.ResponseDto;
import com.prueba.aldeamo.entity.ArraysEntity;
import com.prueba.aldeamo.repository.ArraysRepository;
import com.prueba.aldeamo.util.Utils;

@Service
public class ServiceArrays implements IServiceArrays{

	@Autowired
	private ArraysRepository repository;
	
	private List<String> arrayB = null;
	private List<String> arrayA = null;

	
	@Override
	public ResponseDto<ArraysDto> getRespuesta(int id, int q) {
		arrayA = new ArrayList<String>();
		arrayB = new ArrayList<>();
		Optional<ArraysEntity> res = repository.findById(id);
		ArraysDto dto = new ArraysDto();
		if(res.isPresent()) {
			arrayA = Arrays.asList(res.get().getArrays().split(","));
			for(int i=0; i<q; i++) {
				int pi = Utils.primos[i];
				addArrayA(arrayA, pi);
			}
			if(!arrayA.isEmpty()) {
				for (String string : arrayA) {
					arrayB.add(string);
				}
			}
			dto.setRespuesta(arrayB);
		}
		return new ResponseDto<ArraysDto>(dto, 200, "Ok");
	}

	private void addArrayA(List<String> array, int pi) {
		arrayA = new ArrayList<>();
		for (String string : array) {
			if(Integer.parseInt(string) % pi == 0) {
				arrayB.add(string);
			}else {
				arrayA.add(string);
			}
		}
	}
	
}
