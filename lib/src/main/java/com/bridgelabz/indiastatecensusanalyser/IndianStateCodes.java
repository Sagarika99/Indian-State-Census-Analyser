package com.bridgelabz.indiastatecensusanalyser;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVReader;

public class IndianStateCodes {

	public List<StatesCodes> statesCode = new ArrayList<>();
	public String FILE_PATH_CODES = "C:\\Users\\sshind1\\OneDrive - MORNINGSTAR INC\\Documents\\Java CFP-081\\India State Census Analyser\\lib\\IndianStateCodes.csv";
	
	public Integer loadIndianStatesCodes() {
		try {
			FileReader reader = new FileReader( FILE_PATH_CODES);
			CSVReader csvReader = new CSVReader(reader);
			List<String[]> records = csvReader.readAll();
    		records.stream().forEach(n -> {
    			Iterator<String> iterator = Arrays.stream(n).iterator();
    			String srNo = iterator.next();
    			String stateName = iterator.next();
    			String tin = iterator.next();
    			String stateCode = iterator.next();
    	   	        if (!srNo.equals("SrNo")) {
        	        	try{
        	        		statesCode.add(new StatesCodes(Integer.parseInt(srNo), stateName, tin, stateCode));     	  
        	        	}
            			catch (Exception e){
            				throw new IndianStateException("Type is Incorrect");
            			}
        	        }
    		        else if ((srNo.equals("SrNo") && stateName.equals("StateName") && tin.equals("TIN") && stateCode.equals("StateCode"))!=true) {
    		        	throw new InputMismatchException("Wrong Header name");
    		        }  	
    		});
    		System.out.println(statesCode.size());
    		for (int i=0 ; i<statesCode.size() ; i++) {
        		System.out.println(statesCode.get(i));
        		System.out.println();
    		}
    		reader.close();
    		csvReader.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return statesCode.size();
	}
	
	public int checkFileExists() throws IndianStateException {
		File file = new File("C:\\Users\\sshind1\\OneDrive - MORNINGSTAR INC\\Documents\\Java CFP-081\\India State Census Analyser\\lib\\IndianStateCodes.csv");
		if (file.exists()) {
			return 1;
		}
		else {
			throw new IndianStateException("File not found");
		}
	}
}
