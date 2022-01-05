package com.org.genpact.day8;

import java.io.FileOutputStream;

public class FileOutPutStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			FileOutputStream fo = new FileOutputStream("C:\\Users\\703301560\\Documents\\JavaIo.txt");
			String str ="Inserting the new data into javaio file";
			byte b1[]= str.getBytes();
			fo.write(b1);
			fo.close();
			System.out.println("Writing done");
			
		}catch(Exception e) {}

	}

}
