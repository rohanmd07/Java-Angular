package tech.getarrays.employeemanager.exception;

public class UserNotFoundException extends RuntimeException{
	public UserNotFoundException(String errMsg) {
		super(errMsg);
	}
}
