package com.coelhodev.crudclient.dto;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends CustomError{

	private List<FieldMessage> errors = new ArrayList<>();
	
	public ValidationError(Instant timestemp, Integer status, String error, String path) {
		super(timestemp, status, error, path);
	}

	public List<FieldMessage> getErrors() {
		return errors;
	}
	

	public void addError(String fieldName, String message) {
		errors.add(new FieldMessage(fieldName, message));
	}
	

	
}
