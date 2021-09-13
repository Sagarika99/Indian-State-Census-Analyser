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
}
