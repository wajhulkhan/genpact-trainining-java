package com.org.genpact.day8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

public class ChannelTransferExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 //Input files
        String[] inputFiles = new String[]{"C:\\Users\\703301560\\Documents\\file1.txt","C:\\Users\\703301560\\Documents\\file2.txt","C:\\Users\\703301560\\Documents\\file3.txt"};

        //Files contents will be written in these files
        String outputFile = "C:\\Users\\703301560\\Documents\\File4.txt";

        //Get channel for output file
        FileOutputStream fos = new FileOutputStream(new File(outputFile));
        WritableByteChannel targetChannel = fos.getChannel();

        for (int i = 0; i < inputFiles.length; i++)
        {
            //Get channel for input files
            FileInputStream fis = new FileInputStream(inputFiles[i]);
            FileChannel inputChannel = fis.getChannel();

            //Transfer data from input channel to output channel
            inputChannel.transferTo(0, inputChannel.size(), targetChannel);

            //close the input channel
            inputChannel.close();
            fis.close();
    }
        targetChannel.close();
        fos.close();
      
	}

}
