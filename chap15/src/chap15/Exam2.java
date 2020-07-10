package chap15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

/*
 * 화면에서 파일명을 입력받고,
 * 화면에 내용을 입력받아, 입력받은 파일명에 내용을 저장하기.
 * "exit" 내용을 입력받으면 프로그램 종료.
 * FileOutputStream 사용하기
 * [결과]
 * 파일명을 입력하세요.
 * aaa.txt
 * 저장할 내용을 입력하세요.
 * 안녕하세요
 * 반갑습니다.
 * 
 * aaa.txt 파일의 내용
 * 안녕하세요
 * 반갑습니다.
 * 
 */
public class Exam2 {

	public static void main(String[] args) throws IOException {
		System.out.println("파일명을 입력하세요");
		Scanner scan=new Scanner(System.in);
		String x = scan.next();
		
		FileOutputStream fos = new FileOutputStream(x+"txt");
		System.out.println("저장할 내용을 입력하세요(종료:exit)");
		
		while(true) {
			String data = scan.next();
			if(data.equals("exit")) break;
			fos.write((data+"\n").getBytes());
		}
		fos.flush();  //return 과 비슷
		fos.close();

	}

}
