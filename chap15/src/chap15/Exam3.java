package chap15;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 화면에서 파일명을 입력받고, 출력할 시작라인수, 종료라인수 입력받아
 * 해당 파일의 시작라인~종료라인 까지 화면에 출력하기.
 * 단 출력시 해당라인도 함께 출력할것.
 * 
 * [결과]
 * 파일명을 입력하세요
 * aaa.txt 
 * 출력할 시작라인과 종료라인의 숫자를 입력하세요
 * 11 12
 * 
 * 11:asdfg
 * 12:sdfswf
 */
public class Exam3 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in)); //$$$
		System.out.println("파일명을 입력하세요.");
//		Scanner scan = new Scanner(System.in);
//		String filename = scan.next();
		
		String filename =stdin.readLine();  //$$$
		BufferedReader br = new BufferedReader(new FileReader(filename)); //bufferedReader 에서 한줄한줄의 개념이 생김
		
	
		
		System.out.println("출력할 시작라인과 종료라인의 숫자를 입력하세요.");
//		int start = scan.nextInt();
//		int end = scan.nextInt();
		String num=stdin.readLine();		//$$$
		int start= Integer.parseInt(num.split(" ")[0].trim()); //$$$
		int end= Integer.parseInt(num.split(" ")[1].trim());	//$$$
		
		
		
		String data=null;
		int line=0; //=>몇번읽었는지 저장해주는 변수
		while((data=br.readLine())  !=null) {				//???????????
			++line;
			if(line<start) continue;  //continue=> 지나가다
			if(line>end) break;
			System.out.println(line+":"+data);
			
		}
		br.close();
	}

}
