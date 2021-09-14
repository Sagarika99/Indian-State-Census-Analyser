package com.bridgelabz.indiastatecensusanalyser;

public class IndianStateException extends RuntimeException{

	public enum ExceptionType{
		CENSUS_FILE_PROBLEM, UNABLE_TO_PARSE, NO_CENSUS_DATA, CSV_FILE_INTERNAL_ISSUES
	}
	
	public IndianStateException (String message) {
		super(message);
	}
	
}
