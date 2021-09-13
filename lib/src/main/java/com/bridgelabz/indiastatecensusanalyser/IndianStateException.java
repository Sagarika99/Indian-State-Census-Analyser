package com.bridgelabz.indiastatecensusanalyser;

public class IndianStateException extends Exception{

	public enum ExceptionType{
		CENSUS_FILE_PROBLEM, UNABLE_TO_PARSE, NO_CENSUS_DATA, CSV_FILE_INTERNAL_ISSUES
	}
		
	ExceptionType type;
	public IndianStateException (String message,ExceptionType type) {
		super(message);
		this.type = type;
	}
}
