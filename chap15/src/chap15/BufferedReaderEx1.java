package chap15;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 보조스트림
 *		1.새로운 기능을 추가하는 스트림 
 *		2.객체 생성시 다른 스트림을 매개변수로 받는다.****************
 *		new BufferedReader(Reader)
 *		new BufferedInputStream(InputStream)
 *		
 *BufferedReader: 버퍼기능을 추가하여 성능 향상 시킴.
 *=>readLine() : 한줄씩 읽을 수있는 기능 추가
 *
 *키보드에서 입력한 내용을 한줄씩 읽어서 화면에 출력하고 buffered.txt 파일에 저장하기
 *Scanner.nextLine() :한줄씩 읽기  => 사용하지않음
 * 
 */
public class BufferedReaderEx1 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //한줄씩 읽어내고 싶다
		FileWriter fw = new FileWriter("buffered.txt"); //한줄씩읽어낼수있는애를 저장
		String data =null;		//키보드에서 입력된 내용저장
		while((data=br.readLine()) != null) {  //br은 키보드입력     	EOF(파일의 끝): crtl+z
			System.out.println(data);
			fw.write(data+"\n"); // 파일에 찍음.
			
		}
		fw.flush();
		fw.close();

	}

}
