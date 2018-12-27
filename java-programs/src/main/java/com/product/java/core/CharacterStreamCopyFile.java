package com.product.java.core;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamCopyFile {
	
	public static void main(String[] args) throws IOException {
		
		FileReader in = null;
		FileWriter out = null;
		
		try{
			in = new FileReader("C:\\Softwares\\EclipseWorkSpace2018\\LearnJava\\JavaPrograms\\src\\com\\java\\projects\\Input.txt");
			out = new FileWriter("C:\\Softwares\\EclipseWorkSpace2018\\LearnJava\\JavaPrograms\\src\\com\\java\\projects\\Output.txt");
			
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
