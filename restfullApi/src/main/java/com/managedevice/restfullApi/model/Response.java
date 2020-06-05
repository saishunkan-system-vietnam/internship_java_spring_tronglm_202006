package com.managedevice.restfullApi.model;

public class Response {
	private Integer code;
	private String message;
	private Object payload;
			
	public Response(Integer code, String message, Object payload) {
		super();
		this.code = code;
		this.message = message;
		this.payload = payload;
	}
	
	public Response(Integer code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getPayload() {
		return payload;
	}
	public void setPayload(Object payload) {
		this.payload = payload;
	}
}
