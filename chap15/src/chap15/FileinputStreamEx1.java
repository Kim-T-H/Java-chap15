package chap15;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

/*
 * FileInputStream: 파일의 내용을 읽어오기.바이트 입력스트림.
 * int read() : 1byte씩 읽어서 리턴
 * int read(byte[] buf) : buf의 크기만큼 읽어서 데이터를 buf에 저장함.
 * 							실제로 읽은 바이트수 리턴.
 * int read(byte[] buf,int start,int len) : buf의 크기에서 len만큼  데이터를 읽어서 데이터를  buf의 start인덱스부터 저장함.
 * 											실제로 읽은 바이트수 리턴.
 */
public class FileinputStreamEx1 {

	public static void main(String[] args) throws IOException {
		//fis:src/chap15/InputStreamEx1.java 참조
		FileInputStream fis = new FileInputStream("src/chap15/InputStreamEx1.java"); //반드시 IOException 을해야함
		System.out.println("======read()메서드 이용하여 읽기");
		int data=0;
		while((data=fis.read()) !=-1) {  //read 도 예외처리해야함
			System.out.print((char)data);
		}
		
		
		System.out.println("======read(byte[] buf)메서드 이용하여 읽기");
		fis = new FileInputStream("src/chap15/InputStreamEx1.java");
		//fis.available(): 읽기 가능 바이트 수. 파일의 byte수와 같다.
		byte[] buf= new byte[fis.available()];//버퍼의 크기를 파일의 크기만큼 설정.
		while((data=fis.read(buf)) !=-1) {	//버퍼만큼읽고     -1: EOF  파일의 끝   != -1은 파일의 끝이 아닌동안 읽어라! while 문
			System.out.println(new String(buf,0,data));  //data: 실제읽은 바이트수 저장.    버퍼의 0번부터 실제로 읽은 데이터값까지 출력해라
														//buf: 파일의 내용
		}
		
		
		System.out.println("======read(byte[] buf)메서드 이용하여 읽기");
		fis = new FileInputStream("src/chap15/InputStreamEx1.java");
		buf = new byte[fis.available()];
		while((data=fis.read(buf,0,buf.length)) !=-1) {
			System.out.println(new String(buf,0,data));
		}
	}

}
