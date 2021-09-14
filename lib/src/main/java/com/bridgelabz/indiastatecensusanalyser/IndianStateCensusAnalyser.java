package com.bridgelabz.indiastatecensusanalyser;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.io.File;

import java.io.FileReader;
import java.io.Reader;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class IndianStateCensusAnalyser {
	public List<IndianStatesData> statesList = new ArrayList<>();
	public static String FILE_PATH = "C:\\Users\\sshind1\\OneDrive - MORNINGSTAR INC\\Documents\\Java CFP-081\\India State Census Analyser\\lib\\IndianStateCSV.csv";
	
	public Integer loadIndianStatesData() {
		try {
			Reader reader = Files.newBufferedReader(Paths.get(FILE_PATH));
			CSVReader csvReader = new CSVReaderBuilder(new FileReader(FILE_PATH)).withSkipLines(1).build();
    		List<String[]> records = csvReader.readAll();
    		records.stream().forEach(n -> {
    			Iterator<String> iterator = Arrays.stream(n).iterator();
    			String state = iterator.next();
    			String population = iterator.next();
    			String areaInSqKm = iterator.next();
    			String densityPerSqKm = iterator.next();
    			
    			try {
    				statesList.add(new IndianStatesData(state, Long.parseLong(population), Long.parseLong(areaInSqKm), Integer.parseInt(densityPerSqKm)));
    			}
    			catch (Exception e){
    				throw new IndianStateException("Type is Incorrect");
    			}    	
    		});
    		for (int i=0 ; i<statesList.size() ; i++) {
        		System.out.println(statesList.get(i));
        		System.out.println();
    		}
    		reader.close();
    		csvReader.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return statesList.size();
	}
	
	public int checkFileExists() throws IndianStateException {
		File file = new File("C:\\Users\\sshind1\\OneDrive - MORNINGSTAR INC\\Documents\\Java CFP-081\\India State Census Analyser\\lib\\IndianStateCSV.csv");
		if (file.exists()) {
			return 1;
		}
		else {
			throw new IndianStateException("File not found");
		}
	}
}
	
