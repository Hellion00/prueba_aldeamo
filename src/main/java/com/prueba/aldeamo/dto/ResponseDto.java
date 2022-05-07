package com.prueba.aldeamo.dto;

public class ResponseDto<T> {
    private T data;
    private Integer responseCode;
    private String message;
    
    
    
	public ResponseDto(T data, Integer responseCode, String message) {
		super();
		this.data = data;
		this.responseCode = responseCode;
		this.message = message;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Integer getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
