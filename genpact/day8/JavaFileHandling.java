package com.org.genpact.day8;

import java.io.File;

public class JavaFileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File obj = new File("C:\\Users\\703301560\\Documents\\javaIo.txt");
			if(obj.createNewFile()) {
				System.out.println("File created "+obj.getName());
				
			}else {
				System.out.println("File already exists");
			}
		}catch(Exception e) {
			
		}

	}

}
