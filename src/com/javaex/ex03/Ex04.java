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
import java.util.LinkedList;
import java.util.List;

public class Ex04 {

	public static void main(String[] args)  throws IOException {

		//PhoneDB.txt 파일을 읽는다 (UTF-8 방식으로 저장되어 있음)
		InputStream in = new FileInputStream("C:\\JavaStudy\\PhoneDB.txt"); 
		InputStreamReader isr = new InputStreamReader(in, "UTF-8");		 
		BufferedReader br = new BufferedReader(isr);					
		
		OutputStream out = new FileOutputStream("C:\\JavaStudy\\PhoneDB-copy.txt"); 
		OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");				
		BufferedWriter bw = new BufferedWriter(osw);
		
		//반복문
		while(true){
			String str = br.readLine();
			
			if(str == null) {		
				break;
			}
			System.out.println(str); 
			
			bw.write(str);
			bw.newLine();
		}
		//이효리,010-2222-3333,031-2323-4441 ","로 구분한다 --> 배열
		String input = "1,2,3";
		String[] sArr = input.split("\n");     	
		for( String s : sArr) { 		
			System.out.println(s);	
		}
		//반복
		/*
		while(true) {
			String srt2 = br.readLine();
			
			if(str2 == null) {
				break;
			}
		}
		*/
		
		//리스트에 정리					 pList
		
		List<Person> psList = new LinkedList<Person>();
		
		Person ps1 = new Person("이효리","010-2222-3333","031-2323-4441");
		Person ps2 = new Person("정우성","010-2323-2323","02-5555-5555");
		Person ps3 = new Person("이정재","010-9999-9999","02-8888-8888");
		
		psList.add(ps1);
		psList.add(ps2);
		psList.add(ps3);
		
		//for문으로 출력
		for(int i=0; i<psList.size(); i++) {
			System.out.println(psList.get(i).toString());
		}
		
		//[0x111] [0x3333] [0x888]
		/*
		0x111 name = 이효리,hp = 010-2222-3333, company = 031-2323-4441  ==> Person
		
		//문제에 있는 형식으로 출력한다
		*/
		//스트림 종료
		bw.close();
		br.close();
	}
}
/*
이효리,010-2222-3333,031-2323-4441
정우성,010-2323-2323,02-5555-5555
이정재,010-9999-9999,02-8888-8888
1,2,3
이름: 이효리	핸드폰: 010-2222-3333	회사: 031-2323-4441
이름: 정우성	핸드폰: 010-2323-2323	회사: 02-5555-5555
이름: 이정재	핸드폰: 010-9999-9999	회사: 02-8888-8888
*/
