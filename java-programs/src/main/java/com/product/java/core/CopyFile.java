package com.product.java.core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try{
			in = new FileInputStream("C:\\Softwares\\EclipseWorkSpace2018\\LearnJava\\JavaPrograms\\src\\com\\java\\projects\\Input.txt");
			out = new FileOutputStream("C:\\Softwares\\EclipseWorkSpace2018\\LearnJava\\JavaPrograms\\src\\com\\java\\projects\\Output.txt");
			
			int c;
			while((c = in.read()) != -1){
				
				out.write(c);
			}
		}finally{
			if(in != null){
				in.close();
			}if(out !=  null){
				out.close();
			}
		}
	}

}
