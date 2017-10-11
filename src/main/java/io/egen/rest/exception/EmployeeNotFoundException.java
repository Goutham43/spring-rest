package io.egen.rest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.NOT_FOUND)
public class EmployeeNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 405802649322364762L;

	public EmployeeNotFoundException(String message) {
		super(message);
	}

	public EmployeeNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
}
