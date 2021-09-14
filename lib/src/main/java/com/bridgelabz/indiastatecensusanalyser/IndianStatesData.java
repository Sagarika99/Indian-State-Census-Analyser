package com.bridgelabz.indiastatecensusanalyser;

import com.opencsv.bean.CsvBindByName;

public class IndianStatesData {
	
	@CsvBindByName(column="State",required=true)
	public String State;
	
	@CsvBindByName(column="Population",required=true)
	public long Population;

	@CsvBindByName(column="AreaInSqKm",required=true)
	public long AreaInSqKm;
	
	@CsvBindByName(column="DensityPerSqKm",required=true)
	public int DensityPerSqKm;
	
	public IndianStatesData() {
		
	}

	public IndianStatesData(String state, long population, long areaInSqKm, int densityPerSqKm) {
		this.State = state;
		this.Population = population;
		this.AreaInSqKm = areaInSqKm;
		this.DensityPerSqKm = densityPerSqKm;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public long getPopulation() {
		return Population;
	}

	public void setPopulation(long population) {
		Population = population;
	}

	public long getAreaInSqKm() {
		return AreaInSqKm;
	}

	public void setAreaInSqKm(long areaInSqKm) {
		AreaInSqKm = areaInSqKm;
	}

	public int getDensityPerSqKm() {
		return DensityPerSqKm;
	}

	public void setDensityPerSqKm(int densityPerSqKm) {
		DensityPerSqKm = densityPerSqKm;
	}

	@Override
	public String toString() {
		return "IndianStatesData [State=" + State + ", Population=" + Population + ", AreaInSqKm=" + AreaInSqKm
				+ ", DensityPerSqKm=" + DensityPerSqKm + "]";
	}
	
}
