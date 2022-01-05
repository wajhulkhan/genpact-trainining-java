package com.org.genpact.day8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "File handling in jva using file writer in the example";
		try {
			FileWriter fw = new FileWriter("C:\\Users\\703301560\\Documents\\JavaIo.txt");
			for(int i=0; i<s.length();i++) {
				fw.write(s.charAt(i));
				
			}
			System.out.println("Writing done ..");
			fw.close();
			
			FileReader fr = new FileReader("C:\\Users\\703301560\\Documents\\JavaIo.txt");
			BufferedReader bu = new BufferedReader(fr);
			int k;
			while((k=bu.read())!=-1) {
				System.out.print((char)k);
			}
					
		}catch(Exception e) {
			
		}
	}

}
