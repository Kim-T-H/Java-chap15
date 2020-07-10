package chap15;

import java.io.File;
import java.io.IOException;
import java.util.Date;

//File 클래스의 주요 메서드
//File 내용은 Stream으로 설정해야함!
public class FileEx2 {

	public static void main(String[] args) throws IOException {
		 File f1 = new File("c:/temp1"); //폴더는 없지만 지정은 가능
		 System.out.printf("%s 폴더 생성:%b%n",f1.getAbsolutePath(),f1.mkdir() ); //f1.mkdir(): 폴더생성.
		 File f2 = new File("c:/temp1/test.txt");
		 System.out.printf("%s 파일 생성:%b%n",f2.getAbsolutePath(),f2.createNewFile());
		 //f2.createNewFile(): 파일생성  파일이 생성이되면 true 안되면 false
		 System.out.printf("파일이름:%s, 파일크기:%,d byte%n", f2.getName(),f2.length());
		 //f2.getName():파일이름 가져오기		   f2.length():파일의 크기.
		 File f3=new File("c:/temp1/test2.txt");
		 System.out.printf("%s->%s 이름변경:%b%n",		//test.txt=>test2.txt 이름변경
				 f2.getName(),f3.getName(),f2.renameTo(f3));
		 System.out.printf("%s 파일 최종 수정시간: %s%n", 
				 f3.getName(),new Date(f3.lastModified()));	
		 //f3.lastModified() :파일 수정시간.1970년 이후부터 파일수정시간까지 밀리초로 리턴
		 System.out.printf("%s 파일 삭제:%b%n", f3.getName(),f3.delete());
		 
	}

}
