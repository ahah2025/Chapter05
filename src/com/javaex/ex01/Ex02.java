package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex02 {

	public static void main(String[] args) throws IOException {

		//Stream 준비
		InputStream in = new FileInputStream("C:\\JavaStudy\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\JavaStudy\\buffimg.jpg");
		System.out.println("스트림준비완료");
		
		byte[] buff = new byte[1024];
		
		
		
		System.out.println("복사시작");
		
		//반복
		while(true) {
			//읽기
			//int date = in.read();
			int date = in.read(buff);
			System.out.println(date);
		
			if(date == -1) {
				System.out.println("(-1)복사끝");
				break;
			}
			//쓰기
			//out.write(date);
			out.write(buff);
		}
		//스트림 종료
		in.close();
		out.close();

		System.out.println("프로그램 종료");
		
	}

}
