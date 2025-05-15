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

		//PhoneDB.txt 파일을 읽는다 (UTF-8 방식으로 저장되어 있음)
		
		InputStream in = new FileInputStream("C:\\JavaStudy\\PhoneDB.txt"); 
		InputStreamReader isr = new InputStreamReader(in, "UTF-8");		 
		BufferedReader br = new BufferedReader(isr);					
		
		OutputStream out = new FileOutputStream("C:\\JavaStudy\\PhoneDB-copy.txt"); 
		OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");				
		BufferedWriter bw = new BufferedWriter(osw);
		
		while(true){
			String str = br.readLine();
			
			if(str == null) {		
				break;
			}
			System.out.println(str); 
			
			bw.write(str);
			bw.newLine();
		}
		
		//System.out.println("이름: "+ name);
		//System.out.println("핸드폰: "+ hp );
		//System.out.println("회사: "+ company );
		//System.out.println("");
		
		//이효리,010-2222-3333,031-2323-4441 ","로 구분한다 --> 배열
		
		String stri = "010-2222-3333";
		String[] sArr = stri.split(",");     	
		for(int i=0; i<sArr.length; i++) { 		
			System.out.print(sArr[i]);	
		}
		
		//스트림 종료
		bw.close();
		br.close();
		
		//문제에 있는 형식으로 출력한다

		
	}

}
/*
 결 과 값이 다르게 보임
이효리,010-2222-3333,031-2323-4441
정우성,010-2323-2323,02-5555-5555
이정재,010-9999-9999,02-8888-8888
010-2222-3333
*/
