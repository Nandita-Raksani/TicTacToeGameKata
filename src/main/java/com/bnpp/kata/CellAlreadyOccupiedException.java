package com.bnpp.kata;

public class CellAlreadyOccupiedException extends Exception {

	private static final long serialVersionUID = 1582625567260101798L;
	private String errorMessage;

	public CellAlreadyOccupiedException(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		return errorMessage;
	}
}
