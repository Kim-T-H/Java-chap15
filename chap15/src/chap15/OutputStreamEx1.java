package chap15;

/*
 * 
 * 
 * FileOutStream 예제:파일에데이터 출력
 * 					파일이 존재하지 않으면 파일 생성
 * 					파일이 존재하는 경우 파일을 수정.
 * 			
 * 		void write(int data):2바이트 출력
 * 		void write(char[] buf):buf의 내용을 파일에 출력
 * 		void write(char[] buf,int start, int len):buf의 인덱스부터의 내용을 파일에 len 크기만 출력
 *		void write(String data):문자열 출력
 */


import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamEx1 {

	public static void main(String[] args) throws IOException {
		System.out.print("출력 스트팀예제");
		OutputStream out =System.out;
		out.write('1');out.write('2');out.write('2');  //1byte
		out.write('a');out.write('b');out.write('b');
		out.write('가');out.write('나');out.write('다');  //2byte를 써야 출력됨
		out.flush();//강제로 버퍼의 내용을 목적지(콘솔)로 출력.
		//Writer 객체로 변경하기
		System.out.println();
		Writer w= new OutputStreamWriter(System.out);
		
		w.write('1');w.write('2');w.write('2');  //1byte
		w.write('a');w.write('b');w.write('b');
		w.write('가');w.write('나');w.write('다');  //2byte를 써야 출력됨
		w.flush();
	}

}
