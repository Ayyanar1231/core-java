package com.chainsys.ebbillpayment;

public class InvalidInputDataException extends RuntimeException {
	public InvalidInputDataException() {
		System.out.println("This is not valid ");
	}

	public InvalidInputDataException(String message) {
		System.out.println(message);
	}
}
