package com.org.genpact.day8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		
			FileInputStream f = new FileInputStream("C:\\Users\\703301560\\Documents\\waj.txt");
			int i=0;
			try {
				while((i=f.read())!=-1) {
					System.out.print((char)i);
				}
				f.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}

}
