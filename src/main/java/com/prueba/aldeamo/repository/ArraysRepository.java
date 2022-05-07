package com.prueba.aldeamo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prueba.aldeamo.entity.ArraysEntity;

@Repository
public interface ArraysRepository extends CrudRepository<ArraysEntity,Integer>{
		
}
