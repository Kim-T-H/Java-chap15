package chap15;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

/*
 * 1. 반복문을 이용하여 
   파일명을 입력받아서 해당 파일이 존재하면 해당파일명.bak 파일 복사하기
   파일명에 exit 가 입력되면, 프로그램 종료.
   해당 파일이 없으면 해당 파일이 없습니다. 메세지 출력


[결과]
 파일명을 입력하세요(종료:exit)
 aaa.txt  =>존재하는 경우
 aaa.bak 파일에 aaa.txt의 내용을 복사하기

 파일명을 입력하세요(종료:exit)
 bbb.txt  =>존재하지 않는 경우
 해당 파일이 없습니다. 
 */
public class test1 {

	public static void main(String[] args) throws IOException{
		
		Scanner scan= new Scanner(System.in);
//		BufferedInputStream in = null;
//		OutputStream out = null;
		
		while(true) {
		
		System.out.println("파일명을 입력하세요(종료:exit)");
		String name=scan.next();
		
		
		try {
		if(name.equals("exit")) break;
		FileInputStream fis =new FileInputStream(name+".txt");
		System.out.println("해당 파일이 존재");
		
		BufferedInputStream in = null;
		OutputStream out = null;
		in = new BufferedInputStream(new FileInputStream (name+".txt"));
		out = new FileOutputStream(name+".bak"); 
		int data =0;
		while((data=in.read()) !=-1){
				out.write(data);
		}
		
		
		}catch(FileNotFoundException e) { 
			System.out.println("해당파일 없음");    //try ~ catch 입출력 구문은 사용하여서 예외설정 
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		}
	}
}
		
		
		

	

