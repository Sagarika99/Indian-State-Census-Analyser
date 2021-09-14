package com.bridgelabz.indiastatecensusanalyser.test;

import org.junit.Test;

import com.bridgelabz.indiastatecensusanalyser.IndianStateCensusAnalyser;
import com.bridgelabz.indiastatecensusanalyser.IndianStateException;

import org.junit.Assert;

public class IndianStateCensusAnalyserTest {

	@Test
	public void givenStatesCensusFile_ShouldReturnCorrectNumberOfRecords() {
		IndianStateCensusAnalyser censusAnalyser = new IndianStateCensusAnalyser();
		int sizearr = censusAnalyser.loadIndianStatesData();
		Assert.assertEquals(29, sizearr);
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
}
