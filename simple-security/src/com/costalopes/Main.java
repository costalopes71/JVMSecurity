package com.costalopes;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		String javaVersion = System.getProperty("java.version");
		System.out.println(javaVersion);
		
		try (FileWriter writer = new FileWriter("/home/joao/Documentos/teste_escrita.txt")) {
			writer.write("Hello World");
		}
		
	}
	
}
