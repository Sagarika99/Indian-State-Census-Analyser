package com.bridgelabz.indiastatecensusanalyser.test;

import org.junit.Test;

import com.bridgelabz.indiastatecensusanalyser.IndianStateCensusAnalyser;
import com.bridgelabz.indiastatecensusanalyser.IndianStateException;

import java.io.IOException;
import org.junit.Assert;

public class IndianStateCensusAnalyserTest {
	
	@Test
	public void givenStatesCensusFile_ShouldReturnCorrectNumberOfRecords() throws IndianStateException, IOException {
		try {	
			IndianStateCensusAnalyser censusAnalyser = new IndianStateCensusAnalyser();
			int sizearr = censusAnalyser.loadIndianStatesData();
			Assert.assertEquals(29, sizearr);
		}
		catch (IndianStateException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void givenIncorrectFile_ShouldReturnCustomException() {
		try {
			IndianStateCensusAnalyser censusAnalyser = new IndianStateCensusAnalyser();
			Assert.assertEquals(1, censusAnalyser.checkFileExists());
		}
		catch (IndianStateException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void givenIncorrectType_ShouldReturnCustomException() throws IOException {
		try {
			IndianStateCensusAnalyser censusAnalyser = new IndianStateCensusAnalyser();
			int sizearr = censusAnalyser.loadIndianStatesData();
			Assert.assertEquals(29, sizearr);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void givenIncorrectDelimeter_ShouldReturnCustomException() throws IOException {
		try {
			IndianStateCensusAnalyser censusAnalyser = new IndianStateCensusAnalyser();
			int sizearr = censusAnalyser.loadIndianStatesData();
			Assert.assertEquals(29, sizearr);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
