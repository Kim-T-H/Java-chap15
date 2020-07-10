package chap15;

/*
 * FileWriter 예제:파일에 텍스트 데이터 출력
 * 		void write(int data):2바이트 출력
 * 		void write(char[] buf):buf의 내용을 파일에 출력
 * 		void write(char[] buf,int start, int len):buf의 인덱스부터의 내용을 파일에 len 크기만 출력
 *		void write(String data):문자열 출력
 */


import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx1 {

	public static void main(String[] args) throws IOException {
		System.out.println("out.txt 파일에 출력됩니다.");
		//fos:out.txt 파일을 쓰기 위해 참조함.
		FileWriter fos = new FileWriter("out2.txt");
		fos.write('1');	fos.write('2');	fos.write('3');
		fos.write('a');	fos.write('b');	fos.write('c');
		fos.write('가');	fos.write('나');	fos.write('다');
		char[] buf="\n반갑습니다. FileOutputStream 예제입니다.\n".toCharArray();
		fos.write(buf);
		fos.write(buf,1,6);
		fos.write("안녕하세요.	홍길동입니다.");
		fos.flush();

	}

}
