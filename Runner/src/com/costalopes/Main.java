package com.costalopes;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		DataAccess access = new DataAccess("/home/joao/Documentos/message.txt");
		DataService service = new DataService(access);
		
		service.write("Hello World");
		
	}
	
}
