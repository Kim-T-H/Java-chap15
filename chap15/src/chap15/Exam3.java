package chap15;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * ȭ�鿡�� ���ϸ��� �Է¹ް�, ����� ���۶��μ�, ������μ� �Է¹޾�
 * �ش� ������ ���۶���~������� ���� ȭ�鿡 ����ϱ�.
 * �� ��½� �ش���ε� �Բ� ����Ұ�.
 * 
 * [���]
 * ���ϸ��� �Է��ϼ���
 * aaa.txt 
 * ����� ���۶��ΰ� ��������� ���ڸ� �Է��ϼ���
 * 11 12
 * 
 * 11:asdfg
 * 12:sdfswf
 */
public class Exam3 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in)); //$$$
		System.out.println("���ϸ��� �Է��ϼ���.");
//		Scanner scan = new Scanner(System.in);
//		String filename = scan.next();
		
		String filename =stdin.readLine();  //$$$
		BufferedReader br = new BufferedReader(new FileReader(filename)); //bufferedReader ���� ���������� ������ ����
		
	
		
		System.out.println("����� ���۶��ΰ� ��������� ���ڸ� �Է��ϼ���.");
//		int start = scan.nextInt();
//		int end = scan.nextInt();
		String num=stdin.readLine();		//$$$
		int start= Integer.parseInt(num.split(" ")[0].trim()); //$$$
		int end= Integer.parseInt(num.split(" ")[1].trim());	//$$$
		
		
		
		String data=null;
		int line=0; //=>����о����� �������ִ� ����
		while((data=br.readLine())  !=null) {				//???????????
			++line;
			if(line<start) continue;  //continue=> ��������
			if(line>end) break;
			System.out.println(line+":"+data);
			
		}
		br.close();
	}

}
