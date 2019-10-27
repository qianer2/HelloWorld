package com.google.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SaveInformation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	
			BufferedWriter out = new BufferedWriter(new FileWriter("filename"));
		    out.write("Hii this is my first file");
		    out.close();
		    System.out.println("create successful");
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// log 日志系统
		}
	}

}
