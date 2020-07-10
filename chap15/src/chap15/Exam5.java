package chap15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * bin/chap/PrintStreamEx1.class 파일은 이진 파일이다.
 * 이진 파일을 읽어서 화면에 16진수로 출력하기.
 * 
 */
public class Exam5 {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		File f = new File("C:\\Users/GDJ24/Desktop/iop/PrintStreamEx1.class");
		FileInputStream fis =new FileInputStream(f);
		int len=0;
		byte [] buf=new byte[16];  //16버퍼 설정
				while((len=fis.read(buf)) !=-1) {
					for(int i =0; i<len;i++) {
						System.out.printf("%02X ",buf[i]);  //반복문을 이용해서 16버퍼씩 일고 16진수로 표현
					}
					System.out.println();
				}
			
	}

}
