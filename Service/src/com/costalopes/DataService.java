package com.costalopes;

import java.io.IOException;

public class DataService {
	
	private DataAccess access;

	public DataService(DataAccess access) {
		this.access = access;
	}

	public void write(String message) throws IOException {
		access.write(message);
	}
	
	
}