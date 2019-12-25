package com.costalopes;

import java.io.FileWriter;
import java.io.IOException;

public class DataAccess {

	private String fileName;
	
	public DataAccess(String fileName) {
		this.fileName = fileName;
	}
	
	public void write(String message) throws IOException {
		
		try (FileWriter writer = new FileWriter(fileName)) {
			writer.write(message);
		}
		
	}
	
}