package com.sgs.vision.common.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class ErrorsList {
	
	private List<Error> errors;
	
	public ErrorsList(){
		errors = new ArrayList<>();
	}
	
	public List<Error> getErrors() {
		return errors;
	}

	public void setErrors(List<Error> errors) {
		this.errors = errors;
	}

	public static class Error{
		private String code;
		private String message;
		
		public Error(String code, String message) {
			this.code = code;
			this.message = message;
		}

		public String getCode() {
			return code;
		}
		
		public void setCode(String code) {
			this.code = code;
		}
		
		public String getMessage() {
			return message;
		}
		
		public void setMessage(String message) {
			this.message = message;
		}
		
		@Override
		public java.lang.String toString(){
			return "code: " + code + " message: " + message;
		}
	}
	
}
