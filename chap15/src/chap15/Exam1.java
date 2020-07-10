package chap15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/*
 * 화면에서 파일명을 입력받아 해당의 파일의 내용을 화면에 출력하기
 * 한글 깨지지 않도록 하고, FileInputStream을 이용하기
 * 해당 파일이 없는 경우 '해당 파일 없음' 메세지 출력하기.
 * 
 */
public class Exam1 {

	public static void main(String[] args) throws IOException {
		System.out.println("파일명을 입력하세요.");
		Scanner scan= new Scanner(System.in);
		String x=scan.next();
		try {
		FileInputStream fis = new FileInputStream("src/chap15/" + x + ".java");   //x는 파일명
		int data;
		byte[] buf= new byte[fis.available()];
		while((data=fis.read(buf)) !=-1) {
			System.out.print(new String(buf,0,data));	
		}
		
		
		}
		catch(FileNotFoundException e) { 
			System.out.println("해당파일 없음");    //try ~ catch 입출력 구문은 사용하여서 예외설정 
		}	catch(Exception e) {
			e.printStackTrace();
		}
	}
}
