package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ex01 {

	public static void main(String[]args) throws IOException {
		
		//I/O 스트림 준비 : 빨대
		InputStream in = new FileInputStream("C:\\JavaStudy\\img.jpg");
		
		System.out.println("스트림준비완료");
		
		//반복
		while(true){
			int date = in.read();
			System.out.println(date);
			
			if(date == -1) {
				System.out.println("읽기끝(-1)");
				break;
			}
		}
		
		System.out.println("프로그램 종료");
		
		
	}
}
