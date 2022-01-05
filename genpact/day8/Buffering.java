package com.org.genpact.day8;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Buffering {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream f= new FileInputStream("C:\\Users\\703301560\\Documents\\JavaIo.txt");
		BufferedInputStream b = new BufferedInputStream(f);
		
		int i;
		try {
			while((i=b.read())!=-1) {
				System.out.print((char)i);
			}
			b.close();f.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
