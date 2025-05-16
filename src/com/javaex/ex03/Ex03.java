package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Ex03 {

	public static void main(String[] args) throws IOException {

		//PhoneDB.txt 파일을 읽는다 (MS949 방식으로 저장되어 있음)
		InputStream in = new FileInputStream("C:\\JavaStudy\\PhoneDB_UTF8.txt"); 
		InputStreamReader isr = new InputStreamReader(in, "MS949");		 
		BufferedReader br = new BufferedReader(isr);					
		
		OutputStream out = new FileOutputStream("C:\\JavaStudy\\PhoneDB_UTF8-copy.txt"); 
		OutputStreamWriter osw = new OutputStreamWriter(out,"MS949");				
		BufferedWriter bw = new BufferedWriter(osw);
		
		var psArr = new Person[10];
		
		while(true){
			String str = br.readLine();
			if(str == null) {		
				break;
			}
			String[] date = str.split(",");
			if(date.length >=3) { //배열 3개
				String name = date[0];
				String hp = date[1];
				String company = date[2];
				
				bw.write(str);
			}
		}
		//스트림 종료
		bw.close();
		br.close();
	}
}
