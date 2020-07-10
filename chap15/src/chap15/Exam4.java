package chap15;

import java.io.File;

/*
 * C:\\windows 폴더를 지정하여 폴더의 하위 폴더 갯수와 파일의 갯수,
 * 파일의 총크기를 출력하기
 * 
 *갯수 출력은 변수를 초기화 선언후 조건을 충족하면 += 1 씩 증가
 *
 *sum1++
 *sum2++ 이렇게도 카운트 할수 있음.
 *
 */

public class Exam4 {

	public static void main(String[] args) {
		String filePath="c:\\windows";
		File f1 =new File(filePath);
		String files[] = f1.list();
		int sum1 = 0;
		int sum2 = 0;
		long sum3 = 0;
		for(String f: files) {
			File f2= new File(filePath,f);
			if(f2.isDirectory()) {
				sum1 += 1;
			}
			
			else if(f2.isFile()) {
				sum2 += 1;
				sum3 += f2.length();
			}
			
		}
			System.out.println("폴더의 갯수:"+sum1);
			System.out.println("파일의 갯수:"+sum2);
			System.out.printf("파일의 총 크기:%,dbyte",sum3); //printf 는 두개
	}

}
