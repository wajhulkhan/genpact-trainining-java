package com.org.genpact.day8;

import java.io.FileInputStream;
import java.io.InputStreamReader;

//methods of inputstreamReader
//ready() close() getEncoding read()
public class InputStreamReaderChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream in = new FileInputStream("C:\\Users\\703301560\\Documents\\JavaIo.txt");
			InputStreamReader er  = new InputStreamReader(in);
			String s = er.getEncoding();
			System.out.println("Encoding used "+s);
			
			int  x; 
			while((x=er.read())!=-1) {
				char r=(char)x;
				System.out.println(" Char "+r);
				
				boolean b = er.ready();
				System.out.println("Ready or not "+b);
				
			}
		}catch(Exception e){}
	}

}
