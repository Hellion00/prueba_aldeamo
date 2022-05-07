package com.prueba.aldeamo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ARRAYS")
public class ArraysEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "input_array")
	private String input_array;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getArrays() {
		return input_array;
	}

	public void setArrays(String input_array) {
		this.input_array = input_array;
	}
}
