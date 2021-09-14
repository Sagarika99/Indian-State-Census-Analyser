package com.bridgelabz.indiastatecensusanalyser;

public class StatesCodes {

	public Integer srNo;
	public String statename;
	public String tin;
	public String stateCode;

	public StatesCodes() {
		
	}

	public StatesCodes(Integer srNo, String statename, String tin, String stateCode) {
		this.srNo = srNo;
		this.statename = statename;
		this.tin = tin;
		this.stateCode = stateCode;
	}
	
	@Override
	public String toString() {
		return "StatesCodes [srNo=" + srNo + ", statename=" + statename + ", tin=" + tin + ", stateCode=" + stateCode
				+ "]";
	}	
}
