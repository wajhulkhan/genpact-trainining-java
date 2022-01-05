package com.org.genpact.day8;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BUFFEREDOutputStream {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileOutputStream fo = new FileOutputStream("C:\\Users\\703301560\\Documents\\JavaIo.txt");
		BufferedOutputStream bo = new BufferedOutputStream(fo);
		String s1  = "Here we are using file Io operations with byte and character streams";
		byte bb[] = s1.getBytes();
		try {
			bo.write(bb);
			bo.flush();
			bo.close();
			fo.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
