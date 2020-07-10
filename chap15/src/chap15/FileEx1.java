package chap15;

import java.io.File;

/*
 *File 클래스
 *	-파일이나 폴더의 정보를 관리하는 클래스
 *	-없는 파일도 관리됨 
 *
 *폴더 구분자
 *		윈도우:\
 *		리눅스:/
 */
public class FileEx1 {

	public static void main(String[] args) {
	String filePath="c:\\"; //c 드라이브.
	File f1 = new File(filePath);//f1:  c:\\ 정보관리.
	String files[] =f1.list(); //f1파일의 하위 정보를 배열로 리턴.
	for(String f : files) {
		File f2 = new File(filePath,f);	//new File(폴더(상위경로), 파일)
		if(f2.isDirectory())
			System.out.printf("%s: 디렉토리%n", f);
		else if(f2.isFile())
			System.out.printf("%s: 파일(%,dbyte)%n", f,f2.length()); //%,d 형식지원자.
	}
	
	}

}
