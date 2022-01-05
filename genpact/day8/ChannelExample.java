package com.org.genpact.day8;

import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RandomAccessFile file = new RandomAccessFile("C:\\Users\\703301560\\Documents\\waj.txt", "r");
		FileChannel fileChannel = file.getChannel();
		ByteBuffer byteBuffer = ByteBuffer.allocate(512);
		while(fileChannel.read(byteBuffer)>0) {
			//flip the buffer to prepare for get operation
			byteBuffer.flip();
			while(byteBuffer.hasRemaining()) {
				System.out.print((char)byteBuffer.get());
			}
			//clear the buffer readyfor next sequence of read
			byteBuffer.clear();
			
		}
		file.close();
		

	}

}
