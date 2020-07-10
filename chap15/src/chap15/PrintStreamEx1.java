package chap15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
 * 보조스트림: PrintStream
 * 1.OutputStream 하위 클래스. 바이트 출력스트림.
 * 2.write() 기능을 다양하게 확장한 print(), println(), printf() 메서드 추가
 * 		-모든 자료형 출력
 * 		-예외처리 생략 가능.
 * 3.System.out(표준출력), System.err(표준오류) 의 클래스형
 */
public class PrintStreamEx1 {

	public static void main(String[] args) throws FileNotFoundException{
		FileOutputStream fos = new FileOutputStream("print.txt");
		PrintStream ps = new PrintStream(fos);
		ps.println("홍길동");
		ps.println(1234);
		ps.println(true);
		ps.println(65);
		ps.write(65);		//아스키값 65
		ps.flush();
		ps= new PrintStream("print2.txt");  //파일아웃풋스트림처럼 처리해준다.
		ps.println("홍길동");
		ps.println(1234);
		ps.println(true);
		ps.println(65);
		ps.write(65);		//아스키값 65
		ps.flush();
	}

}
